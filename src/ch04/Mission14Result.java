package ch04;

public class Mission14Result {
    public static void main(String[] args) {
        int star = 4; // 4~9 랜덤값
        System.out.println("star: " + star);
        for(int i=1; i<=star; i++) {
            int underCnt = star - i;
            for(int k1=0; k1<underCnt; k1++) {
                System.out.print("_");
            }
            for(int k2=0; k2<i; k2++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("===========================");
        for(int i=star; i>0; i--) {

            int k=1;
            for( ; k<i; k++) {
                System.out.print("_");
            }
            for( ; k<=star; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("===========================");
        for(int i=star; i>0; i--) {
            for(int k=1; k<=star; k++) {
                System.out.print(k < i ? "_" : "*");
            }
            System.out.println();
        }

        //star = 4
        //___*
        //__**
        //_***
        //****

        //star = 5
        //____*
        //___**
        //__***
        //_****
        //*****
    }
}
