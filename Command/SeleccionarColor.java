package Command;

public class SeleccionarColor implements Commands {
    
    private Receiver valores;
    private String color;

    public SeleccionarColor(Receiver nuevosValores, String nuevoColor){
        this.color = nuevoColor;
        this.valores = nuevosValores;
    }
    
    @Override
    public void execute() {
        

        System.out.println("Color elegido: " + this.color);

        this.valores.setColor(color);
    }
}
