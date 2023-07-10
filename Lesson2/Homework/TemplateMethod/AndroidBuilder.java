package Lesson2.Homework.TemplateMethod;

public class AndroidBuilder extends Builder{
    @Override
    void start() {
        System.out.println("Start Android...");
    }

    @Override
    void test() {
        System.out.println("Running android tests");
    }

    @Override
    void lint() {
        System.out.println("Linting the android code");
    }

    @Override
    void assemble() {
        System.out.println("Assembling the android build");
    }

    @Override
    void deploy() {
        System.out.println("Deploying android build to server");
    }
}
