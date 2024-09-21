package q2869;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int A = scr.nextInt();
        int B = scr.nextInt();
        int V = scr.nextInt();
        int day;
        day = (int)Math.ceil(((double)(V-A)/(double)(A-B)))+1;
        System.out.println(day);
    }
}
