package org.example.Examination;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
public abstract class Examination {
    protected LocalDate dateofexamination;
    public abstract String getinformation();

    public abstract void displayinfo();
}
