 package obtainminutes1;

import java.util.Scanner;

public class Obtainminutes1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter seconds to change to minuts and seconds");
        int seconds = input.nextInt();
        int minutes = (int) (seconds / 60);
        int remainsecond = (int) (seconds % 60);
        System.out.println("Minutes and seconds is " + minutes + " : " + remainsecond);
    }

}
