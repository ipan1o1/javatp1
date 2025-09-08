import java.util.Scanner;

public class trianglewhile {

    public static void build(int n){
        String result = "";
        int i = 0;
        while (i<n) {
            result+="*";
            System.out.println(result); 
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre d'etoiles: ");
        int n = sc.nextInt();
        build(n);
    }
}
