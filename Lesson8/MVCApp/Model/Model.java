package Lesson8.MVCApp.Model;

import Lesson8.MVCApp.Controller.iGetModel;
import Lesson8.MVCApp.Model.Domen.Student;

import java.util.List;

public class Model implements iGetModel {
    private List<Student> students;

    public Model(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudents()
    {
        return students;
    }
}
