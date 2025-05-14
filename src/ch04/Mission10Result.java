package ch04;

public class Mission10Result {
    public static void main(String[] args) {
        int star = (int)(Math.random() * 4.0) + 3; // 3~6사이 랜덤값
        System.out.printf("star: %d\n", star);
        for(int k=0; k<star; k++) {
            for (int i = 0; i < star; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
