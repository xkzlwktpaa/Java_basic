package day2;

import java.util.Scanner;

public class Day2Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("출생년도를 입력하세요: ");
//        int year = sc.nextInt();
//        System.out.println("당신의 나이는 " + (2025 -year + 1));

        System.out.print("사각형의 가로 길이를 입력하세요: ");
        int a =  sc.nextInt();
        System.out.print("사각형의 세로 길이를 입력하세요: ");
        int b = sc.nextInt();
        System.out.println("사각형의 넓이는" + (a * b));

    }
}
