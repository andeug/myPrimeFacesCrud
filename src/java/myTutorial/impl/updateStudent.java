/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myTutorial.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import myTutorial.Database.DatabaseConn;
import myTutorial.interfaces.updateStudentInterface;
import myTutorial.model.student;

/**
 *
 * @author mspace
 */
public class updateStudent implements updateStudentInterface {

    DatabaseConn objConn = new DatabaseConn();
    Connection con = objConn.getMysqlConnection();
    PreparedStatement st = null;
    ResultSet rs = null;
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date date = new Date();

    @Override
    public void updateStudent() {
        String sql = "update tSTUDENT set firstname=?,surname=?,coursename=?,yrofstdy=? where id=?";
        try {
            if (con != null) {

            } else {
                System.out.println("Unable to connect to db... connection null*");
            }
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    @Override
    public void deleteStudent() {
        String sql = "";
        try {
            if (con != null) {

            } else {
                System.out.println("Unable to connect to db... connection null*");
            }
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    @Override
    public int updateStudent(String fname, String sname, String course, String yr, int id) {
        String sql = "update tSTUDENT set firstname=?,surname=?,coursename=?,yrofstudy=? where id=?";
        int status = 0;
        try {
            if (con != null) {
                st = con.prepareStatement(sql);
                st.setString(1, fname);
                st.setString(2, sname);
                st.setString(3, course);
                st.setString(4, yr);
                st.setInt(5, id);
                System.out.println("values " + fname + " sname" + sname + " " + course + " " + yr);

                int r = st.executeUpdate();
                if (r > 0) {
                    status = 1;
                } else {
                    status = 0;
                }
                //return status;
            } else {
                System.out.println("Unable to connect to db... connection null*");
                return status;
            }
        } catch (SQLException x) {
            x.printStackTrace();
        }
        System.out.println("Status " + status);
        return status;
    }

    @Override
    public int deleteStudent(int id) {
        int status = 0;
        String sql = "delete from tSTUDENT where id=? ";
        try {
            if (con != null) {
                st = con.prepareStatement(sql);
                st.setInt(1, id);
                int r = st.executeUpdate();
                if (r > 0) {
                    status = 1;
                } else {
                    status = 0;
                }
            } else {
                System.out.println("Unable to connect to db... connection null*");
                return status;
            }
        } catch (Exception x) {
            x.printStackTrace();
        }
        return status;
    }

    @Override
    public int createStudent(String fname, String sname, String course, String yr) {
        String sql = "insert into tSTUDENT (firstname,surname,coursename,yrofstudy,dateCreated)values(?,?,?,?,?)";
        int status = 0;

        try {
            if (con != null) {
                st = con.prepareStatement(sql);
                st.setString(1, fname);
                st.setString(2, sname);
                st.setString(3, course);
                st.setString(4, yr);
                st.setString(5, dateFormat.format(date));

                int r = st.executeUpdate();
                if (r > 0) {
                    status = 1;
                } else {
                    status = 0;
                }
            } else {
                System.out.println("Unable to connect to db... connection null*");
                return status;
            }
        } catch (SQLException x) {
            x.printStackTrace();
        }
        return status;
    }

    @Override
    public List<student> selectStudent() {
        //id,firstname,surname,coursename,yrofstudy
        List<student> ret = new ArrayList();
        String sql = "select * from tSTUDENT";
        try {
            if (con != null) {
                st = con.prepareStatement(sql);
                rs = st.executeQuery();
                while (rs.next()) {
                    student si = new student();
                    si.setId(rs.getInt("id"));
                    si.setFirstname(rs.getString("firstname"));
                    si.setSurname(rs.getString("surname"));
                    si.setCoursename(rs.getString("coursename"));
                    si.setYrofstudy(rs.getString("yrofstudy"));
                    ret.add(si);
                }
            } else {
                System.out.println("Unable to connect to db... connection null*");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        //    System.out.println("returning list");

        return ret;
    }
}
