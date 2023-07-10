package Lesson2.Homework.TemplateMethod;

public class App {
    public static void main(String[] args) {
        Builder android = new AndroidBuilder();
        android.build();

        System.out.println();
        Builder ios = new IosBuilder();
        ios.build();
    }
}
