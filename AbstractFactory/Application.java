package AbstractFactory;

public class Application {
    
    private Jacket jacketProduct;
    private Shirt shirtProduct;
    private Pants pantsProduct;

    public Application(AbstractFactory factory){
        jacketProduct = factory.createJacket();
        shirtProduct = factory.createShirt();
        pantsProduct = factory.createPants();
    }
    public void make() {
        jacketProduct.make();
        shirtProduct.make();
        pantsProduct.make();
        
    }
}
