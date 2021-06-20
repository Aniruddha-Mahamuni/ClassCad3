package com.example.classcad.context;

import java.util.ArrayList;

import android.app.Application;

import com.example.classcad.bean.AttendanceBean;
import com.example.classcad.bean.AttendanceSessionBean;
import com.example.classcad.bean.FacultyBean;
import com.example.classcad.bean.StudentBean;

public class ApplicationContext extends Application {
    public FacultyBean facultyBean;
    public AttendanceSessionBean attendanceSessionBean;
    public ArrayList<StudentBean> studentBeanList;
    public ArrayList<AttendanceBean> attendanceBeanList;

    public FacultyBean getFacultyBean() {
        return facultyBean;
    }
    public void setFacultyBean(FacultyBean facultyBean) {
        this.facultyBean = facultyBean;
    }
    public AttendanceSessionBean getAttendanceSessionBean() {
        return attendanceSessionBean;
    }
    public void setAttendanceSessionBean(AttendanceSessionBean attendanceSessionBean) {
        this.attendanceSessionBean = attendanceSessionBean;
    }
    public ArrayList<StudentBean> getStudentBeanList() {
        return studentBeanList;
    }
    public void setStudentBeanList(ArrayList<StudentBean> studentBeanList) {
        this.studentBeanList = studentBeanList;
    }
    public ArrayList<AttendanceBean> getAttendanceBeanList() {
        return attendanceBeanList;
    }
    public void setAttendanceBeanList(ArrayList<AttendanceBean> attendanceBeanList) {
        this.attendanceBeanList = attendanceBeanList;
    }



}
