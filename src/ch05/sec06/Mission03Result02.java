package ch05.sec06;

import java.util.Arrays;

public class Mission03Result02 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 70 };
        System.out.println( Arrays.toString(arr) );
        System.out.println("------------");
        //여기 아래는 여러분의 놀이터.
        int commaCnt =  arr.length - 1;
        System.out.print("[");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + (i < commaCnt ? ", ": "") );
        }
        System.out.print("]");

    }
}
