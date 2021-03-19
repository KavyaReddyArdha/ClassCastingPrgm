public class Mobile {
    void display(){
        System.out.println("Cost of the Mobile: ");
    }
}
class Samsung extends Mobile{
    void display(){
        System.out.println("Cost of the Samsung is 25,000");
    }
}
class Oneplus extends Mobile{
    void display(){
        System.out.println("Cost of the Oneplus is 45,000");
    }
}
class Realme extends Mobile{
    void display(){
        System.out.println("Cost of the Realme is 15,000");
    }
}
class phone{
    public static void main(String args[]){
        Mobile m=new Samsung();
        Mobile m1=new Oneplus();
        Mobile m2=new Realme();
        m.display();
        m1.display();
        m2.display();
    }
}


