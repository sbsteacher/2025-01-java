package ch04.sec08;

public class Game369 {
    public static void main(String[] args) {
        for(int i=1; i<=100_000; i++) {
            System.out.printf("i=%d ", i);

            int temp = i;

            do {
                if (temp % 10 % 3 == 0 && temp % 10 != 0) {
                    System.out.print("짝");
                }
            } while ( (temp /= 10) != 0 );
            // temp = temp / 10;
            // temp = temp + 10;  >>>>  temp += 10;
            //
            System.out.println();
        }
    }
}
