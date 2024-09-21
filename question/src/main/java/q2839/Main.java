package q2839;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int N = scr.nextInt();
        int a = 0;
        int b = 0;

        for (int i = 0; i < 1667; i++) {
            for (int j = 0; j < 1667; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                else if (i == 0 && j !=0) {
                    b = N / j*3;
                    N = N % (j*3);
                }else {
                    a = N / i*5;
                    N = N % (i*5);
                    if (j != 0) {
                        b = N / j*3;
                        N = N % (j*3);
                    }
                }
                if(N == 0){
                    System.out.println(a + ", " + b);
                    System.out.println(a+b);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}
