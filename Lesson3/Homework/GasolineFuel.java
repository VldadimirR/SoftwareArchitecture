package Lesson3.Homework;
/**
 * Класс для заправки бензиновым топливом
 */

public class GasolineFuel implements iGasStation{
    /**
     * метод для заправки
     */
    @Override
    public void fuelFilling() {
        System.out.println("Запрвлен бензином");
    }
}
