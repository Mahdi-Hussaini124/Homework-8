package excecise11;

public class Excecise11 {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println("Befor the swap : x = " + x);
        System.out.println("Befor the swap : y = " + y);
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("later the swap : y = " + y);
        System.out.println("Later the swap : x = " + x);
    }

}
