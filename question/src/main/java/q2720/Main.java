package q2720;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int T = scr.nextInt();
        scr.nextLine();
        while (T != 0) {
            T--;
            int C = scr.nextInt();
            int q = C / 25;
            C = C % 25;
            int d = C / 10;
            C = C % 10;
            int n = C / 5;
            int p = C % 5;

            System.out.println(q + " " + d + " " + n + " " + p);
        }
    }
}
