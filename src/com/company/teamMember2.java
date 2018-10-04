package com.company;

public class teacher extends Person {
    private String subject = "";
    private String title = "";

    public teacher (String subject, String title) {
        super("teacher");
        this.subject = subject;
        this.title = title;
    }

    public String getSubject(); {
        return this.subject;
    }
    public String getTitle(); {
        return this.title + "." + this.getFamilyName();
    }
}
