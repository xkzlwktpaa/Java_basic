package day12;

import java.util.Scanner;

public class Day12Practice {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        //1. 쇼핑몰 결제 계산기
        Payment payment = new Payment();

        //정수 상품 가격 합계 계산
        System.out.println("두 상품 총액: " + payment.calculate(10000, 15000) + "원");
        System.out.println("세 상품 총액: " + payment.calculate(10000, 15000) + "원");

        //실수 상품 가격 합계 계산
        System.out.println("두 상품 총액(실수):" + Math.round(payment.calculate(12.5, 8.49) * 100) / 100.0 + "원");

        //연필 가격 계산
        System.out.println("연필(1500원) 몇 개를 구매할까요? ");
        long n = sc.nextLong();
        System.out.println("연필 총액: " + payment.calculate(n) + "원 입니다.");
    }
}
