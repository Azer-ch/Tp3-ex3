import java.util.List;

public class VueOld implements Strategy {
    @Override
    public void afficher(List<VueProduit> products) {
        for (int i = 0; i < products.size(); i++) {
            products.get(i).afficher();
            System.out.println("");
        }
    }
}