package day10;

public class Day10Method {

    public static void main(String[] args) {
        String  result = add(3, 5.0);
        System.out.println("result = " + result);

        Cat cat1 = new Cat();
        cat1.name = "알럭이";
        cat1.age = 156;

        System.out.println(cat1.getAge());
        System.out.println(cat1.getName());

        Cat cat2 = new Cat("민성", 16);
        System.out.println(cat2.getAge());
        System.out.println(cat2.getName());
        cat2.introduceMaster("윤은서");

        Cat cat3 = new Cat("민성");
        System.out.println(cat3.getAge());
        System.out.println(cat3.getName());

    }

    public static String add(int a, double b){
//        System.out.println(a + b);
        return "안녕하세요";
    }
}
