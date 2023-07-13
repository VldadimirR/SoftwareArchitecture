package Lesson3.Homework;

/**
 * Абстрактный класс для создания автомобиля
 */

public abstract class Car  {

    private String brand;
    private String model;
    private String color;
    private String bodyType;
    private float engineSize;
    private int wheels = 4;
    private Gearbox gearbox;

    private Wiper wiper;

    /**
     * конструктор
     *
     * @param brand      - бренд, задается в классе наследнике
     * @param model      - модель
     * @param color      - цвет
     * @param bodyType   - тип кузова
     * @param gearbox    - тип коробки передач
     * @param engineSize - объем двигателя
     */
    public Car(String brand, String model, String color, String bodyType, Gearbox gearbox, float engineSize) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.gearbox = gearbox;
        this.engineSize = engineSize;
    }

    /**
     * метод движения машины
     */
    abstract void movement();

    /**
     * метод включения фар
     */
    abstract void useHeadlights(Ligth ligth);

    /**
     * метод включения дворников
     */
    abstract void useWiper(Wiper wiper);

    /**
     * метод переключения передач
     */
    abstract void gearShifting(Gearbox gearbox);

    /**
     * метод для измения кол-во колес
     *
     * @param wheels - кол-во колес
     */
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}


