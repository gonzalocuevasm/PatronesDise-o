package AbstractFactory;

public class BlueFactory implements AbstractFactory{
    
    @Override
    public Jacket createJacket() {
        return new BlueJacket();
    }
    @Override
    public Shirt createShirt() {
        return new BlueShirt();
    }
    @Override
    public Pants createPants() {
        return new BluePants();
    }
}
