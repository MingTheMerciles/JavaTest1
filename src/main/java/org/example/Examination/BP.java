package org.example.Examination;
import java.time.LocalDate;

public class BP extends Examination {
    final private Integer systolic_pressure;
    final private Integer diastolic_pressure;

    final private String term;

    public BP(LocalDate dateofexamination, Integer systolic_pressure, Integer diastolic_pressure,String term){
        this.dateofexamination = dateofexamination;
        this.systolic_pressure = systolic_pressure;
        this.diastolic_pressure = diastolic_pressure;
        this.term = term;
    }

    @Override
    public String getinformation() {
        return "Date of examination: " + dateofexamination + ", Systolic pressure: " + systolic_pressure + ", Diastolic pressure: " + diastolic_pressure + ", Term: " + term;
    }

    @Override
    public void displayinfo(){
       System.out.println("Blood Pressure Measurement: ");
       System.out.println("Date of examination: " + dateofexamination );
       System.out.println("Systolic pressure: " + systolic_pressure + " mmHg");
       System.out.println("Diastolic pressure: " + diastolic_pressure + " mmHg");
       System.out.println("Term: " + term);
    }


}
