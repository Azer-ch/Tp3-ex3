public class VueProduit{
    protected String desc;
    public VueProduit(String desc){
        this.desc=desc;
    }
    public void afficher(){
        System.out.print(this.desc);
    }
}