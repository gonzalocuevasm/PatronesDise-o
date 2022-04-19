package AbstractFactory;

public class Application {
    
    
    private AbstractFactory factory;

    public Application(AbstractFactory factory){
        this.factory = factory;
    }
    public void make() {

        Jacket producJacket = factory.createJacket();
        producJacket.make();

        Shirt producShirt = factory.createShirt();
        producShirt.make();
        
        Pants producPants = factory.createPants();
        producPants.make();
        
    }
}
