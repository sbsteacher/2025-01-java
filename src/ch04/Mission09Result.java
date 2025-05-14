package ch04;

public class Mission09Result {
    public static void main(String[] args) {
        int dan = (int)(Math.random() * 8.0) + 2; //2~9사이 랜덤값 생성해주세요.
        System.out.println("dan: " + dan);

        for(int i=1; i<10; i++) {
            System.out.printf("%d x %d = %d\n", dan, i, dan * i);
        }

    }
}
