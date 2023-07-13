package Lesson3.Homework;
/**
 * Класс для заправки дизельным топливом
 */

public class DieselFuel implements iGasStation{
    /**
     * метод для заправки
     */
    @Override
    public void fuelFilling()  {
        System.out.println("Запрвлен дизелем");
    }
}
