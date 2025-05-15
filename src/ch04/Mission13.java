package ch04;

public class Mission13 {
    public static void main(String[] args) {
        int star = (int)(Math.random() * 6) + 3; //3~8까지 랜덤값
        System.out.println("star: " + star);
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
