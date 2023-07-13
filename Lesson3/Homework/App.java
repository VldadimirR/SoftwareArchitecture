package Lesson3.Homework;

public class App {
    public static void main(String[] args) {
        ConcreteCar BMW = new ConcreteCar("BMW","X5","Black","Sedan",new Gearbox(),100);
        ConcreteCar2 Mazda = new ConcreteCar2("Mazda","CX5","Red","Sedan",new Gearbox(),150);
        BMW.fuelFilling();
        Mazda.fuelFilling();

    }
}
