package AbstractFactory;

public class GreyFactory implements AbstractFactory{
    
    @Override
    public Jacket createJacket() {
        return new GreyJacket();
    }
    @Override
    public Shirt createShirt() {
        return new GreyShirt();
    }
    @Override
    public Pants createPants() {
        return new GreyPants();
    }
}
