package ch04;

public class Mission03Result03 {
    public static void main(String[] args) {
        int value = (int)(Math.random() * 100.0) + 1;

        System.out.printf("%d는(은) %s수입니다.\n"
                , value, value % 2 == 0 ? "짝" : "홀"); //삼항식
    }
}
