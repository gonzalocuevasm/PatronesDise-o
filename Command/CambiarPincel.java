package Command;

public class CambiarPincel implements Commands{
    private Receiver valores;
    private String pincel;

    public CambiarPincel(Receiver nuevosValores, String nuevoPincel){
        this.pincel = nuevoPincel;
        this.valores = nuevosValores;
    }
    @Override
    public void execute() {

        System.out.println("Pincel elegido: " + this.pincel);

        this.valores.setPincel(this.pincel);
    }
}
