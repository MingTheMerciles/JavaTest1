package org.example;
import org.example.Examination.BP;
import org.example.Examination.Examination;
import org.example.Examination.MRI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDate;
import java.net.MalformedURLException;
import java.net.URL;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Patient Daphne = new Patient("Daphne Von Oram", 62, "https://martinh.netfirms.com/BIOE60010/DaphneVonOram.jpg");
        LocalDate dateOfExamination_for_daphne = LocalDate.now();
        Examination mri_examination_for_daphne = new MRI(dateOfExamination_for_daphne, "https://martinh.netfirms.com/BIOE60010/mri1.jpg", 2);
        Examination bp_examination_for_daphne = new BP(dateOfExamination_for_daphne, 120, 80, "ST");
        Daphne.addexamination(mri_examination_for_daphne);
        Daphne.addexamination(bp_examination_for_daphne);
        Daphne.displayinfo();
        System.out.println("  ");
        Daphne.administrator_display();


        System.out.println("  ");
        System.out.println("  ");
        System.out.println("  ");

        Patient Seb = new Patient("Sebastian", 31, "https://martinh.netfirms.com/BIOE60010/SebastianCompton.jpg");
        Examination mri_examination_for_seb = new MRI(dateOfExamination_for_daphne, "https://martinh.netfirms.com/BIOE60010/mri2.jpg", 4);
        Examination bp_examination_for_seb = new BP(dateOfExamination_for_daphne, 150, 80, "VST");
        Seb.addexamination(mri_examination_for_seb);
        Seb.addexamination(bp_examination_for_seb);
        Seb.displayinfo();
        System.out.println("  ");
        Seb.administrator_display();


        Daphne.displayAllExamInFrame();
        Seb.displayAllExamInFrame();
        /*
        // Create a simple window to display the output
        JFrame frame = new JFrame("Appointments");
        frame.setSize(450,400);

        JPanel displayPanel = new JPanel();
        // Create a label for each patient's text
        JLabel displayLabel1 = new JLabel(Daphne.getinformationfordisplayinframe());
        JLabel displayLabel2 = new JLabel(Seb.getinformationfordisplayinframe());

        displayPanel.add(displayLabel1);
        displayPanel.add(displayLabel2);

        JLabel label = new JLabel();
        URL imageURL=null;
        try {
            imageURL = new URL("https://martinh.netfirms.com/b3ta/kennyg.jpg");
        }
        catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }
        ImageIcon thisImageIcon = new ImageIcon(imageURL);
        label.setIcon(thisImageIcon);


        frame.setContentPane(displayPanel);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {// Ends program if close window is clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        }
        */
    }
}