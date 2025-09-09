import java.util.Scanner;

public class fibonacci {

    public static int fibo1(int n){
        if (n == 0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return fibo1(n-1) + fibo1(n-2);
        }
    }

    public static void fibo2(int n){
        int i = 0;
        while ( fibo1(i) < n){
            i++;
        }
        System.out.print("La valeur " + fibo1(i) + " au rang " + i + " est supérieure à la valeur " + n + " que vous avez saisie.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choisissez un nombre: ");
        int n = sc.nextInt();
        System.out.print(n + "e nombre dans la suite de fibonacci: " + fibo1(n) + "\n");
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Choisissez un nombre: ");
        int n2 = sc2.nextInt();
        fibo2(n2);
    }
}