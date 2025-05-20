package ch05.sec06;

import java.util.Arrays;

public class Mission02 {
    public static void main(String[] args) {
        int[] arr = new int[2];
        arr[0] = 10;
        arr[1] = 20;
        //------------------(이 공간 안에서 리터럴 사용 금지)

        //------------------
        System.out.println( Arrays.toString(arr) );
        // [20, 10]
    }
}
