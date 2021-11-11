import java.util.*;
public class VueCatalogue{
    private List<VueProduit> products = new ArrayList<VueProduit>();
    private Strategy strategy;
    public VueCatalogue(Strategy strategy){
        this.strategy=strategy;
    }
   public void addProduct(VueProduit v){
       products.add(v);
   }
   public void afficher(){
       strategy.afficher(products);
   } 
}