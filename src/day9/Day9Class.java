package day9;

public class Day9Class {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.name = "알렉산더 4세";
        dog1.age = 4;
        dog1.gender = "man";
        dog1.neutering = false;

        System.out.println(dog1.name);
        System.out.println(dog1.age);
        System.out.println(dog1.gender);
        System.out.println(dog1.neutering);
        dog1.bark();

        dog2.name = "알렉산더 네이버쥬니어 54세";
        dog2.age = 50;
        dog2.gender = "man";
        dog2.neutering = true;

        System.out.println(dog2.name);
        System.out.println(dog2.age);
        System.out.println(dog2.gender);
        System.out.println(dog2.neutering);
        dog2.bark();
    }
}
