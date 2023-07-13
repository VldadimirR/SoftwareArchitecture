package Lesson3.Homework;

/**
 * конкретный класс автомобиля
 */

public class ConcreteCar extends Car implements iGasStation {
    private iGasStation iGasStation;

    /**
     * конструктор
     *
     * @param brand    - бренд, задается в классе наследнике
     * @param model    - модель
     * @param color    - цвет
     * @param bodyType - тип кузова
     * @param gearbox - тип коробки передач
     * @param engineSize - объем двигателя
     */

    public ConcreteCar(String brand, String model, String color, String bodyType, Gearbox gearbox, float engineSize) {
        super(brand, model, color, bodyType,gearbox, engineSize);

    }

    /**
     * метод движения машины
     */
    @Override
    void movement() {

    }

    /**
     * метод включения фар
     *
     * @param ligth - фары
     */
    @Override
    void useHeadlights(Ligth ligth) {
        ligth.turningHeadlights();
    }

    /**
     * метод включения дворников
     *
     * @param wiper - дворникии
     */
    @Override
    void useWiper(Wiper wiper) {
        wiper.turningWipers();
    }

    /**
     * метод переклюения передачи
     *
     * @param gearbox - тип коробки передач
     */
    @Override
    void shiftGear(Gearbox gearbox) {
        gearbox.gearShifting();
    }

    /**
     * метод для заправки топлива
     */
    @Override
    public void fuelFilling(String fuelType) {
        iGasStation.fuelFilling(fuelType);
    }

}
