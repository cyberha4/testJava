import models.Car;

import java.util.HashSet;

/**
 * Created by Хидир on 08.02.2017.
 */
public class Test {
    public static HashSet<Car> cars = new HashSet<>();

    public static void main(String[] args) {
        CarNew car = new CarNew(100, "Kia-ceed", "1000000");
        CarNew car2 = new CarNew(200, "Kia-rio", "500000");
        CarNew car3 = new CarNew(200, "Kia-rio2", "5000002");
        System.out.println(car);
        cars.add(car);
        cars.add(car2);

        System.out.println(cars.contains(car3));

    }
}
class CarNew extends Car
{
    public String colour;
    CarNew(int price, String model, String regNum){
        super(price, model, regNum);
    }

    @Override
    public String toString() {
        return " "+getModel()+" price:"+getPrice();
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public int hashCode() {
        return 2;
    }
}