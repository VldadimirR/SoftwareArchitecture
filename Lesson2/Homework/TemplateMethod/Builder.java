package Lesson2.Homework.TemplateMethod;

 abstract class Builder {
     final void build() {
         start();
        test();
        lint();
        assemble();
        deploy();
     }

     abstract void start();
     abstract void test();

     abstract void lint();

     abstract void assemble();

     abstract void deploy();

 }