import java.util.Scanner;

public class pyramide {

    public static void build(int n){
        String spaces = " ";
        String stars = "*";
        if(n%2==0){
            System.out.println("Donnez un nombre impair!");
        }else{
            int taille = n;
            int numSpaces = taille - 1;
            int numStars = 1;
            for (int i=0; i < n; i++) { 
                System.out.print(spaces.repeat(numSpaces));
                System.out.println(stars.repeat(numStars));
                numSpaces--;
                numStars += 2;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Donnez la taille du motif: ");
        int n = sc.nextInt();
        build(n);  
    }
}