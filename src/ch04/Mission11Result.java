package ch04;

public class Mission11Result {
    public static void main(String[] args) {
        //2 ~ 9단 구구단 출력 단수가 바뀔 때 개행처리
        for(int dan=2; dan<10; dan++) {
            for(int i=1; i<10; i++) {
                System.out.printf("%d x %d = %d\n", dan, i, dan * i);
            }
            System.out.println();
        }
        /*
        2 x 1 = 2
        2 x 2 = 4
        2 x 3 = 6
        ...
        2 x 9 = 18

        3 x 1 = 3
        3 x 2 = 6
        ...
        9 x 9 = 81

         */
    }
}
