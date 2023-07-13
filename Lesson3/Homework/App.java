package Lesson3.Homework;

public class App {
    public static void main(String[] args) {
        Gearbox gearbox = new Gearbox();
        ConcreteCar BMW = new ConcreteCar("BMW","X5","Black","Sedan",gearbox,100);
        BMW.fuelFilling("Бензин");
        ConcreteCar Mazda = new ConcreteCar("Mazda","CX5","Red","Sedan",gearbox,150);
        Mazda.fuelFilling("Дизель");
    }
}
