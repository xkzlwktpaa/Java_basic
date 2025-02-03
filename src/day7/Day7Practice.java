package day7;

import java.util.Scanner;

public class Day7Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("학생수를 입력하세요");
        int num1 = sc.nextInt();
        int[] scores = new int[num1];

        int sum = 0;

        for(int i =0; i < scores.length; i++){
            System.out.print("점수를 입력하세요: ");
            scores[i] = sc.nextInt();
        }

        for (int i = 0; i < scores.length; i++) {
            System.out.println("scores[" + i + "] = " + scores[i]);
        }

        for (int i =0; i < scores.length; i++){
            sum = sum + scores[i];
        }

        System.out.println(sum / num1);


    }

}
