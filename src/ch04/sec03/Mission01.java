package ch04.sec03;

public class Mission01 {
    public static void main(String[] args) {
        int month = (int)(Math.random() * 16.0); // 0 ~ 15 랜덤값
        System.out.println("month: " + month);
        // switch 이용하여
        // month 값이 12, 1, 2라면 "겨울"
        // month 값이 3, 4, 5라면 "봄"
        // month 값이 6, 7, 8라면 "여름"
        // month 값이 9, 10, 11라면 "가을"
        // 나머지는 "해당 계절이 없습니다."

    }
}
