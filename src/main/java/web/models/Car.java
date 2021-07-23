package web.models;

public class Car {
    private int id;
    private String model;
    private int maxSpeed;
    private String color;

    public Car(int id, String model, int maxSpeed, String color) {
        this.id = id;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", color='" + color + '\'';
    }
}
