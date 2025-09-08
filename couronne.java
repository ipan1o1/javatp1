import java.util.Scanner;

public class couronne {

    public static boolean check(int Px, int Py, int x, int y){
        if ((0<= x) && (x <= Px)){
            if ((0<= y) && (y<=Py)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Rayon exterieur: 14");
        System.out.println("Rayon interieur: 0");
        Scanner sc = new Scanner(System.in);
        System.out.print("Valeur de x: ");
        int x = sc.nextInt();
        Scanner sca = new Scanner(System.in);
        System.out.print("Valeur de y: ");
        int y = sca.nextInt();
        if (check(14, 0, x, y)){
            System.out.print("Le point est dans la couronne.");
        }else{
            System.out.println("Le point n'est pas dans la couronne.");
        }
    }
}
