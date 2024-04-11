package nested.inner.ex1;

public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine(this);
    }

    //Engine에서만 사용
    public String getModel() {
        return model;
    }

    //Engine에서만 사용
    public int getChargeLevel() {
        return chargeLevel;
    }

    public void start() {
        engine.start();
        System.out.println(model + " 준비 완료");
    }
}
