package day9;

public class Day9Practice {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.company = "bugatti";
        car1.model = "silon";
        car1.booster = "niteulo buseuteo";
        car1.oil = true;
        System.out.println(car1.company);
        System.out.println(car1.model);
        System.out.println(car1.booster);
        System.out.println(car1.oil);
        car1.exhaust();

    }
}
