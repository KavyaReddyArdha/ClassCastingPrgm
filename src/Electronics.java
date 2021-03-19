public class Electronics {
    void show(){
        System.out.println("The features are");
    }
}
class Refridgerator extends Electronics{
    void show() {
        System.out.println("The features of this refridgerator is Double-door");
    }
    public static void main (String args[]){
            Electronics e = new Refridgerator();
            Refridgerator r = (Refridgerator) e;
            r.show();
        }

}

