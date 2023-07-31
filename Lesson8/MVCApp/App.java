package Lesson8.MVCApp;


import Lesson8.MVCApp.Controller.Controller;
import Lesson8.MVCApp.Controller.iGetController;
import Lesson8.MVCApp.Controller.iGetModel;
import Lesson8.MVCApp.Controller.iGetView;
import Lesson8.MVCApp.Model.Domen.Student;
import Lesson8.MVCApp.Model.Model;
import Lesson8.MVCApp.View.View;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<Student> students = new ArrayList<Student>();
        Student s1 = new Student("Сергей",  21, 101);
        Student s2 = new Student("Андрей",  22, 111);
        Student s3 = new Student("Иван", 22, 121);
        Student s4 = new Student("Игорь", 23, 301);
        Student s5 = new Student("Даша",  25, 171);
        Student s6 = new Student("Лена",  23, 104);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);

        //    //Создание модели
        //    Model mod = new Model(students);
        //    //Создание вью
        //    View view = new View();


        //Создание модели
//        iGetModel model = new Model(students);
        iGetModel mod = new Model(students);
        //Создание вью
        iGetView view = new View();

        //Создаем экземпляр контроллера
        iGetController control = new Controller(mod, view);

        view.setController(control);

        //Запуск работы модели
        control.update();



    }
}
