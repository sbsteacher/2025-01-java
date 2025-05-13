package ch03.sec01;
//p.80
public class SingleOperatorExample {
    public static void main(String[] args) {
        int x = -100;
        System.out.printf("1. x: %d\n", x);

        x = -x;  // x = -100 * -1;   >>    x = 100;
        System.out.printf("2. x: %d\n", x);

        int y = 100 * -1;
        System.out.printf("3. y: %d\n", y);

        y = y * -1;
        System.out.printf("4. y: %d\n", y);
    }
}
