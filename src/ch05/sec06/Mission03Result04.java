package ch05.sec06;

import java.util.Arrays;

public class Mission03Result04 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 70 };
        System.out.println( Arrays.toString(arr) );
        System.out.println("------------");
        //여기 아래는 여러분의 놀이터.
        if(arr.length == 0) {
            System.out.println("[]");
            return;
        }
        System.out.printf("[%d", arr[0]);
        for(int i=1; i<arr.length; i++) {
            System.out.printf(", %d", arr[i]);
        }
        System.out.print("]");

    }
}

