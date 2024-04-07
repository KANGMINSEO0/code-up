package com.kms.section01;

import java.util.Scanner;

public class Practice1 {
    // 1166 : 윤년판별
    // 400의 배수이면 무조건 윤년이다.
    // 4의 배수이며, 100의 배수가 아니면 윤년이다.
    /* 출력예시
    *  입력받은 자연수가 윤년이라면 "Leap"를 아니라면 "Normal"을 출력한다.
    * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("========== 윤년 판별 프로그램 ==========");
//        System.out.print("연도를 입력하세요 : ");
        int year = sc.nextInt();

        if (year % 400 == 0 ) {
            System.out.println("Leap");
        } else if ((year % 4 == 0) && (year % 100 != 0)) {
            System.out.println("Leap");
        } else {
            System.out.println("Normal");
        }
    }
}
