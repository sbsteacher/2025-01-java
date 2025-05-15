package ch04;

public class Mission13Result {
    public static void main(String[] args) {
        int star = (int)(Math.random() * 6) + 3; //3~8까지 랜덤값
        System.out.println("star: " + star);

        for(int i=0; i<star; i++) {
            for(int k=0; k<=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // OR
        System.out.println("----");
        for(int i=1; i<=star; i++) {
            for(int k=0; k<i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //star = 3
        //*      ----  0, 1
        //**     ----  1, 2
        //***    ----  2, 3

        //star = 5
        //*
        //**
        //***
        //****
        //*****
    }
}
