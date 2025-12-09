package com.demo.dto;

public class StudentDto {
    private int sid;
    private String sname;
    private String email;
    private double percentage;

    // Default constructor
    public StudentDto() {
        super();
    }

    // Parameterized constructor
    public StudentDto(int sid, String sname, String email, double percentage) {
        super();
        this.sid = sid;
        this.sname = sname;
        this.email = email;
        this.percentage = percentage;
    }

    // Getters and Setters
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    // toString method
    @Override
    public String toString() {
        return "StudentDTO [sid=" + sid + ", sname=" + sname + 
               ", email=" + email + ", percentage=" + percentage + "]";
    }
}
