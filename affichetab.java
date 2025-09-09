public class affichetab {

    public static void affiche(int[] tab, int n){
        System.out.print("[");
        for(int i=0;i<n;i++){
            System.out.print(tab[i] +",");
        }
        System.out.print("]");
    }

    public static void increment(int[] t){
        for(int i=1; i <= t.length; i++){
            t[i-1] ++;
        }
    }
    
    public static void main(String[] args) {
        int[] t = {12, 5 ,84, 9};
        int[] t2 = t;
        t2[2] = 67;
        affiche(t, 4);
        affiche(t2, 4);
        increment(t);
        affiche(t, 4);
    }
}
