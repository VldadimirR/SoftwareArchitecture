package Lesson8.MVCApp.View;

import Lesson8.MVCApp.Controller.iGetController;
import Lesson8.MVCApp.Controller.iGetView;
import Lesson8.MVCApp.Model.Domen.Student;

import java.util.List;

public class View implements iGetView {
    private iGetController control;

    public void setController(iGetController control) {
        this.control = control;
    }

    public void callModel()
    {
        control.update();
    }

    public void printAllStudent(List<Student> students) {
        System.out.println("----------- Список студентов ----------");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
