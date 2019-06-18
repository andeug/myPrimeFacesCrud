/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myTutorial.interfaces;

import java.util.List;
import myTutorial.model.student;

/**
 *
 * @author mspace
 */
public interface updateStudentInterface {

    public void updateStudent();

    public void deleteStudent();

    public int updateStudent(String fname, String sname, String course, String yr, int id);

    public int deleteStudent(int id);

    public int createStudent(String fname, String sname, String course, String yr);

    public List<student> selectStudent();

}
