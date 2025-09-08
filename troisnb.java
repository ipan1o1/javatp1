import java.util.Scanner;

public class troisnb {

    public static void order(int one, int two, int three){
        if (one > two) {
            int temp = one;
            one = two;
            two = temp;
        }
        if (two > three) {
            int temp = two;
            two = three;
            three = temp;
        }
        if (one > two) {
            int temp = one;
            one = two;
            two = temp;
        }

        System.out.println("Les nombres dans l'ordre croissant : " + one + " " + two + " " + three);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1er Nombre:");
        int x = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.print("2e Nombre:");
        int y = sc2.nextInt();
        Scanner sc3 = new Scanner(System.in);
        System.out.print("3e Nombre:");
        int z = sc3.nextInt();
        order(x, y, z);
    }
}
