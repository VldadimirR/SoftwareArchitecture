package Lesson8.MVCApp.Controller;

import Lesson8.MVCApp.Model.Domen.Student;

import java.util.List;

public interface iGetView {
    public void printAllStudent(List<Student> students);
    public void setController(iGetController control);
}
