package ch04;

public class Mission05Result02 {
    public static void main(String[] args) {
        int starCount = (int)(Math.random() * 6.0) + 2; //(1) 2~7사이 랜덤값
        System.out.printf("starCount: %d\n", starCount);

        for(int i=0; i<starCount; i++) {
            System.out.print("*");
        }


    }
}
