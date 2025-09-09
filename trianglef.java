import java.util.Scanner;

public class trianglef {

    public static void build(int n){
        String result = "";
        for(int i=0; i < n; i++){
            result += "*";
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Donnez la taille du motif: ");
        int n = sc.nextInt();
        build(n);
    }
}
