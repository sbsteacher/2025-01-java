package ch04;

import java.util.Scanner;

public class Mission04Result02 {
    public static void main(String[] args) {
        //int score = (int)(Math.random() * 201.0); // 0 ~ 200 사이의 랜덤값
        Scanner scan = new Scanner(System.in);
        System.out.print("점수를 입력해주세요: ");
        int score = scan.nextInt();
        System.out.printf("score: %d\n", score);

        if(score < 0 || score > 100) { // 0미만 혹은 100초과인 경우
            System.out.println("측정 불가");
        } else { // 0 ~ 100 사이인 경우
            String result = "D";
            if(score >= 90) { // 90 ~ 100 사이
                result = "A";
                // 0 ~ 89
            } else if(score >= 80) { // 80 ~ 89 사이
                result = "B";
                // 0 ~ 79
            } else if(score >= 70) { // 70 ~ 79 사이
                result = "C";
                // 0 ~ 69
            }
            System.out.printf("당신은 %s학점\n", result);
        }

        System.out.println("-- 끝 --");
    }
}
