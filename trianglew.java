import java.util.Scanner;

public class trianglew {

    public static void build(int n){
        String result = "";
        int i = 0;
        while(i < n){
            result += "*";
            System.out.println(result);
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Donnez la taille du motif: ");
        int n = sc.nextInt();
        build(n);
    }
}