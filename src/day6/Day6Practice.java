package day6;

import java.util.Scanner;

public class Day6Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        //1번 문제
//        for(int i = 1; i <= 10; i++) {
//            if (i % 2 == 1){
//                continue;
//
//            }
//            System.out.println("i = " + i);
//        }

        System.out.print("숫자를 입력하세요: ");
        int num1 = sc.nextInt();

        int cjsrkqtkddj = 0;
        for(int i = 1;  i<=  num1; i++){
            cjsrkqtkddj += i;
            if(cjsrkqtkddj > 50){
                break;
            }
            System.out.println("cjsrkqtkddj = " + cjsrkqtkddj);
        }




    }
}
