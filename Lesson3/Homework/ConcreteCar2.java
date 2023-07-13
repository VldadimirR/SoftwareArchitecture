package Lesson3.Homework;
/**
 * конкретный класс автомобиля 2
 */

public class ConcreteCar2 extends Car implements iGasStation {
    private iGasStation iGasStation;
    private String fuelType;

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

    public ConcreteCar2(String brand, String model, String color, String bodyType, Gearbox gearbox, float engineSize) {
        super(brand, model, color, bodyType,gearbox, engineSize);
        iGasStation = new GasolineFuel();
        this.fuelType = "Бензиновый двигатель";
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
     * метод для заправки топлива
     */
    @Override
    public void fuelFilling() {
        iGasStation.fuelFilling();
    }

    /**
     * метод переключения передач
     */
    @Override
    public void gearShifting(Gearbox gearbox) {
        gearbox.gearShifting(gearbox);
    }
}
