package Lesson2.Homework.TemplateMethod;

public class IosBuilder extends Builder{
    @Override
    void start() {
        System.out.println("Start IOS...");
    }

    @Override
    void test() {
        System.out.println("Running ios tests");
    }

    @Override
    void lint() {
        System.out.println("Linting the ios code");
    }

    @Override
    void assemble() {
        System.out.println("Assembling the ios build");
    }

    @Override
    void deploy() {
        System.out.println("Deploying ios build to server");
    }
}
