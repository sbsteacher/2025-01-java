package ch04;

public class Mission03Result {
    public static void main(String[] args) {
        int value = (int)(Math.random() * 100.0) + 1;

        if(value % 2 == 0) {
            System.out.println(value + "는(은) 짝수입니다.");
        } else {
            System.out.println(value + "는(은) 홀수입니다.");
        }
    }
}
