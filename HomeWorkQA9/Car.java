import exceptions.InvalidBrandCarException;
import exceptions.InvalidColorCarException;
import exceptions.InvalidWheelsCarException;

public class Car {

    private String color;
    private String brand;
    private int wheels;



    public Car(String color, String brand, int wheels) {
        this.color = color;
        this.brand = brand;
        this.wheels = wheels;

    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public int getWheels() {
        return wheels;
    }


    public void setColor(String color) {
        if(color.equals("yellow")){
            throw new InvalidColorCarException("It can't be yellow");
        }
        this.color = color;
    }

    public void setBrand(String brand) {
        if(brand.equals("")){
            throw new InvalidBrandCarException("Brand can't be allowed");
        }
        this.brand = brand;
    }

    public void setWheels(int wheels) {
        if (wheels != 4){
            throw new InvalidWheelsCarException ("Wheels should be 4");
        }
        this.wheels = wheels;
    }



    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", wheels=" + wheels +
                '}';
    }
}
