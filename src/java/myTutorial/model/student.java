/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myTutorial.model;

/**
 *
 * @author mspace
 */
public class student {

    private int id;
    private String firstname;
    private String surname;
    private String coursename;
    private String yrofstudy;

    public student() {//instance one

    }

    public student(int id, String firstname, String surname, String coursename, String yrofStudy) {//instaance two

        this.id = id;
        this.firstname = firstname;
        this.surname = surname;
        this.coursename = coursename;
        this.yrofstudy = yrofStudy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getYrofstudy() {
        return yrofstudy;
    }

    public void setYrofstudy(String yrofstudy) {
        this.yrofstudy = yrofstudy;
    }

}
