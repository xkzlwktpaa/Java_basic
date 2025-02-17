package day11;

public class Day11Encapsulation {
    public static void main(String[] args) {
        Day11AccessModifier example = new Day11AccessModifier();

        // public 접근
        System.out.println(example.publicField);

        // private 접근 (직접 접근 불가)
//         System.out.println(example.privateField); //오류 발생

        // pvivate 접근 (getter 사용)
        System.out.println(example.getPrivateField());

        //private 값 수정 (setter 사용)
        example.setPrivateField("새로운 값");
        System.out.println(example.getPrivateField());
    }
}
