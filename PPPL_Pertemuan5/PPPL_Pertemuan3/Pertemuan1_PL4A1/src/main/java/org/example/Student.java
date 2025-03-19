package org.example;

public class Student {
    String Name;
    int Semester;
    boolean isActive;

    public Student(String Name, int Semester, boolean isActive){
        this.Name = Name;
        this.Semester = Semester;
        this.isActive = isActive;
    }

    public boolean isDoingMBKM() {
        return Semester >= 6 && isActive;
    }
}
