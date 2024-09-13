import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        String[] array = new String[10];
        int num =0;

        Scanner scr = new Scanner(System.in);

        int desiredNum = scr.nextInt();
        scr.nextLine();

        while(true) {
            String str = String.valueOf(count);
            if(str.contains("666")){
                System.out.println(str);
                array[num] = str;
                num++;
            }else {
                count++;
            }

        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
