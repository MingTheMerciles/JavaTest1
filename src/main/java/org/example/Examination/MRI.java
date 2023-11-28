package org.example.Examination;

import java.time.LocalDate;

public class MRI extends Examination{
    final private String urltotheimage;
    final private int magneticfieldstrength;

    public MRI(LocalDate dateofexamination, String urltotheimage, int magneticfieldstrength){
        this.dateofexamination = dateofexamination;
        this.urltotheimage = urltotheimage;
        this.magneticfieldstrength = magneticfieldstrength;
    }
    public Integer getmagneticfieldstrength(){
        return magneticfieldstrength;
    }

    @Override
    public String getinformation() {
        return "Date of examination: " + dateofexamination + ", URL to the image: " + urltotheimage + ", Magnetic field strength: " + magneticfieldstrength;
    }

    public void displayinfo(){
        System.out.println("MRI Measurement: ");
       System.out.println("Date of examination: " + dateofexamination);
       System.out.println("URL to the image: " + urltotheimage);
       System.out.println("Magnetic field strength: " + magneticfieldstrength+" Tesla");
    }
}