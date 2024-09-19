package q1463;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int N = scr.nextInt();
        int count = 1;
        int num = 666;

        if (N> 0 && N <= 10000){
            while(count != N) {
                num++;
                String str = String.valueOf(num);
                if(str.contains("666")){
                    count++;
                }
            }
        }
        System.out.println(num);
    }
}
