package day4;

import java.util.Scanner;

public class Day4Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("첫 번째 숫자를 입력하세요: ");
//        int num1 = sc.nextInt();
//        System.out.print("두 번째 숫자를 입력하세요: ");
//        int num2 = sc.nextInt();
//        System.out.print("세 번째 숫자를 입력하세요");
//        int num3 = sc.nextInt();
//
//        int maxNum = (num1 > num2) ? num1 : num2;
//        maxNum =  (maxNum > num3) ? maxNum : num3;
//        System.out.print("더 큰 숫자는 " + maxNum + "입니다.");

        System.out.println("월을 입력하세요 (1~12)");
        int month = sc.nextInt();
        switch (month) {
            case 12, 1, 2:
                System.out.println("겨울");
                break;
            case 3, 4, 5:
                System.out.println("봄:");
                break;
            case 6, 7, 8:
                System.out.println("여름:");
                break;
            case 9, 10, 11:
                System.out.println("가을:");
        }

    }
}
