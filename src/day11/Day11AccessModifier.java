package day11;

public class Day11AccessModifier {
    public String publicField = "누구나 접근 가능";

    private String privateField = "클래스 내부에서만 접근 가능";


    public String getPrivateField(){
        return privateField; // private 변수에 접근하는 public
    }

//    public void setPrivateField(String value) {
//        privateField = value; // private 변수 값을 수정하는 public 매서드
//    }
}
