package ch05.sec06;

public class Mission07Result {
    public static void main(String[] args) {
        int[] arr = { 77, 34, 109, 200, 21, 101, 48 };

        //arr 배열에서 가장 큰 값 찾아서 출력
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.print(max);
    }
}
