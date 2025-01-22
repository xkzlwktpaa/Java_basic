package day6;

import java.util.Scanner;

public class Day6RePeat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //무한 반복문
        System.out.println("무한 반복문 시작");

        while (true){
            System.out.print("숫자를 입력하세요. 0을 입력하면 종료됩니다:");
            int input = sc.nextInt();
            if (input == 0){
                break;
            }
            System.out.println();
            System.out.println("input = " + input);
        }

        //continue문 사용
        for(int i = 1; i <= 10; i++){
            if(i == 5){
                System.out.println("5 건너뛰기");
                continue;
            }
            System.out.println("i = " + i);
        }

    //중첩 반복문 예제: 2단부터 9단까지 구구단 출력
        System.out.println("구구단 표:");
        for(int i = 1; i <= 9; i++){
            for (int j = 2; j <= 9; j++){
                System.out.print(j + " x " + i + " = " + (j * i) + "\t");
            }
            System.out.println();
        }


    }
}
