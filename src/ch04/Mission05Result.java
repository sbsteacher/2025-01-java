package ch04;

public class Mission05Result {
    public static void main(String[] args) {
        int starCount = (int)(Math.random() * 6.0) + 2; //(1) 2~7사이 랜덤값
        System.out.printf("starCount: %d\n", starCount);

        for(int i=0; i<3; i++) {
            System.out.print("*");
        }

        System.out.println();

        for(int i=0; i<7; i++) {
            System.out.print("*");
        }

        System.out.println();

        for(int i=0; i<2; i++) {
            System.out.print("*");
        }

        //starCount = 3;
        //***

        //starCount = 7;
        //*******

        //starCount = 2;
        //**
    }
}
