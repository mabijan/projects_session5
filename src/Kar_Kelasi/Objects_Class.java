package Kar_Kelasi;

import javax.swing.*;

public class Objects_Class {

    private String Job;
    private String Username;
    private String Pass;
    private String Age;
    private String Family;
    private String Name;

    public Objects_Class(String job, String username, String pass, String age, String family, String name) {
        Job = job;
        Username = username;
        Pass = pass;
        Age = age;
        Family = family;
        Name = name;
    }

    public String getJob() { return "Your job:" + Job; }

    public void setJob(String job) { Job = job; }

    public String getUsername() { return "Your username:" + Username; }

    public void setUsername(String username) { Username = username; }

    public String getPass() { return "Your pass:" + Pass; }

    public void setPass(String pass) { Pass = pass; }

    public String getAge() { return "Your age:" + Age; }

    public void setAge(String age) { Age = age; }

    public String getFamily() { return "Your Family:" + Family; }

    public void setFamily(String family) { Family = family; }

    public String getName() { return "Your Name:" +  Name; }

    public void setName(String name) { Name = name; }

    public void print_info() {

        System.out.println(Job);
        System.out.println(Name);
        System.out.println(Family);
        System.out.println(Pass);
        System.out.println(Age);
        System.out.println(Username);
    }
}
