package day3;

import java.util.Scanner;

public class Day3Practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력해주세요: ");
        int num1 =  sc.nextInt();
        System.out.print("두번째 숫자를 입력해주세요: ");
        int num2 = sc.nextInt();
        System.out.print("세번째 숫자를 입력해주세요: ");
        int num3 = sc.nextInt();

        double average3 = (num1 + num2 + num3) /  3.0;
        System.out.println(average3);
    }
}
