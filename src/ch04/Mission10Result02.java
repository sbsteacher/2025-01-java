package ch04;

public class Mission10Result02 {
    public static void main(String[] args) {
        int star = (int)(Math.random() * 4.0) + 3; // 3~6사이 랜덤값
        System.out.printf("star: %d\n", star);
        int totalCount = star * star;
        for(int k=1; k<=totalCount; k++) { //star3 > 9번, star4 > 16
            System.out.print("*");
            if(k % star == 0) {
                System.out.println();
            }
        }
        /*
            1 % 3 = 1,
            2 % 3 = 2,
            3 % 3 = 0,

            4 % 3 = 1,
            5 % 3 = 2,
            6 % 3 = 0,

            7 % 3 = 1,
            8 % 3 = 2,
            9 % 3 = 0,
            ....
        */
    }
}
