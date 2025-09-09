public class affichetab {

    public static void affiche(int[] tab, int n){
        System.out.print("[");
        for(int i=0;i<n;i++){
            System.out.print(tab[i] +",");
        }
        System.out.print("]");
    }
    
    public static void main(String[] args) {
        int[] t = {12, 5 ,84, 9};
        affiche(t, 4);
    }
}
