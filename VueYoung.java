import java.util.List;
public class VueYoung implements Strategy{
    @Override
    public void afficher(List<VueProduit> products) {
        for (int i = 0; i < products.size(); i++) {
            if (i % 3 == 0&& i!=0)
                System.out.println("");
            products.get(i).afficher();
            System.out.print("  ");
        }
        System.out.println("");
    }
}