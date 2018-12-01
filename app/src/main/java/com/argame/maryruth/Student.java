package com.argame.maryruth;

public class Student {
    String fname, lname;
    double ave;

    public Student(String fname, String lname, double ave) {
        this.fname = fname;
        this.lname = lname;
        this.ave = ave;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public double getAve() {
        return ave;
    }

    public void setAve(double ave) {
        this.ave = ave;
    }
}