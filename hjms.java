import java.util.Scanner;

public class hjms {

    public static void time(int secondes){
        int jours = secondes / 86400;
        secondes = secondes - jours * 86400;
        int heures = secondes / 3600;
        secondes = secondes - heures * 3600;
        int minutes = secondes / 60;
        secondes = secondes - minutes * 60;
        System.out.print("Cette durée équivaut à " + jours + " jour(s) "+ heures + " heure(s) " + minutes + " minute(s) " + secondes + " seconde(s).");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Donnez une durée en secondes : ");
        int t = sc.nextInt();
        time(t);
    }
}
