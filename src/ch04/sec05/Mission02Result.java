package ch04.sec05;

import java.util.Scanner;

public class Mission02Result {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String calc = null;

        System.out.println("합계를 구할 숫자를 입력하세요 (0을 입력하면 종료)");
        int sum = 0;
        while(true) {
            System.out.print(">> ");
            int num = scanner.nextInt();
            if(num == 0) { break; }
            sum += num;
            if(calc == null) {
                calc = String.valueOf(num);
            } else {
                calc = calc + "+" + num;
            }
            System.out.printf("%s = %d\n", calc, sum);
        }
        System.out.println("--끝--");
        /*
        합계를 구할 숫자를 입력하세요 (0을 입력하면 종료)
        >> 100
        현재 계산식: 100 = 100
        >> 200
        현재 계산식: 100+200 = 300
        >> 300
        현재 계산식: 100+200+300 = 600
        >> 0
        종료
         */
    }
}
