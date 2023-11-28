package org.example;
import org.example.Examination.Examination;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class Patient {
    private String name;
    private int age;
    private String urlofpicture;
    private ArrayList<Examination> examinations;

    public Patient(String name, int age, String urlofpicture){
        this.name = name;
        this.age = age;
        this.urlofpicture = urlofpicture;
        this.examinations = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getUrlofpicture() {
        return urlofpicture;
    }

    public void addexamination(Examination examination){
        examinations.add(examination);
    }
    public ArrayList<Examination> getExaminations() {
        return examinations;
    }

    public void displayinfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("URL of picture: " + urlofpicture);
        System.out.println("Examinations: ");
    for (Examination examination: examinations){
        examination.displayinfo();
        }
    }

    public void administrator_display(){
        for(Examination examination: examinations){
            String administratorinfo;
            administratorinfo = examination.getinformation();
            System.out.println(administratorinfo);
        }
    }

    public String getinformationfordisplayinframe(){
        String information = "";
        information = information + "Name: " + name + "\n";
        information = information + "Age: " + age + "\n";
        information = information + "URL of picture: " + urlofpicture + "\n";
        information = information + "Examinations: " + "\n";
        for (Examination examination: examinations){
            information = information + examination.getinformation() + "\n";
        }
        return information;
    }

    public void displayAllExamInFrame() {
        JFrame frame = new JFrame("Examination Details");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);

        for (Examination examination : examinations) {
            textArea.append(examination.getinformation() + "\n\n");
        }

        JLabel label_avator = new JLabel();
        JLabel label_mri = new JLabel();

        frame.setLayout(new GridLayout(1,4,5,5));

        try {
            URL imageURL = new URL(urlofpicture); // URLfrom boject
            URL imageurlmri = new URL("https://martinh.netfirms.com/BIOE60010/mri2.jpg");
            ImageIcon imageIcon = new ImageIcon(imageURL);
            ImageIcon imageIconmri = new ImageIcon(imageurlmri);
            label_avator.setIcon(imageIcon);
            label_mri.setIcon(imageIconmri);
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL: " + e.getMessage());
        }

        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(label_avator, BorderLayout.NORTH);
        frame.add(label_mri,BorderLayout.SOUTH);// Add the label to the frame
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {// Ends program if close window is clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
