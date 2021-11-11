import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        VueProduit p1 = new VueProduit("Macbook Pro 16");
        VueProduit p2 = new VueProduit("AirPods");
        VueProduit p3 = new VueProduit("Macbook Air");
        VueCatalogue vue;
        System.out.println("Veuillez saisir votre age");
        int age = scan.nextInt();
        if(age > 50 ) {
            vue = new VueCatalogue(new VueOld());
        }
        else vue = new VueCatalogue(new VueYoung());
        vue.addProduct(p1);
        vue.addProduct(p2);
        vue.addProduct(p3);
        vue.afficher();
    }
}