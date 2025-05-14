package ch04;

public class Mission10 {
    public static void main(String[] args) {
        int star = (int)(Math.random() * 4.0) + 3; // 3~6사이 랜덤값
        System.out.printf("star: %d\n", star);
        /*
        star: 3
        ***
        ***
        ***


        star: 5
        *****
        *****
        *****
        *****
        *****




         */
    }
}
