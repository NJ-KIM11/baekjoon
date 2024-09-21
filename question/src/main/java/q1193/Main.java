package q1193;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

//        int X = scr.nextInt();
        int up=1;

        for (int odd = 1; odd < 20; odd +=2) {
            System.out.println(up + " ");
            while (up <=odd){
                System.out.print(up + " ");
                up++;
            }

            while(up >1){
                System.out.print(up + " ");
                up--;
            }

        }

    }
}