package day10;

public class Cat {
    public String name;
    public int age;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce(){
        System.out.println("내 이름은" + name);
        System.out.println("내 나이는" + age);
    }

    public String getName(){
        return name;
    }

    public void introduceMaster(String master){
        System.out.println("제 주인의 이름은 " + master + "이에요!");
    }
    public int getAge() {
        return age;
    }
}

