import java.util.Scanner;

public class degres {

    public static float convertF(float f){
        float c = (f - 32) * 5/9;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Donnez une température en Fahrenheit : ");
        float f = sc.nextFloat();
        System.out.print("Cette température équivaut à "+ convertF(f)+ " degrés Celsius.");
    }
}
