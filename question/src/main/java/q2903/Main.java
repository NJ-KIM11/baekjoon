package q2903;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int N = scr.nextInt();
        int num = 2;
        int count = 0;
        int result = 0;
        while (count != N) {
            num += (num-1);
            count++;
        }
        result = (int) Math.pow(num, 2);
        System.out.println(result);
    }
}
