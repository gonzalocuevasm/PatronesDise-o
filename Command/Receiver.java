package Command;

public class Receiver {
    private String pincelActual;
    private String colorActual;
    
    public Receiver (){
        this.colorActual = "Negro";
        this.pincelActual = "Lápiz";
    }

    public void setPincel(String pincel){
        this.pincelActual = pincel;
    }
    public void setColor(String color){
        this.colorActual = color;
    }

   public void getIniciales(){
    System.out.println("Pincel Inicial: " + this.pincelActual);
    System.out.println("Color Inicial: " + this.colorActual);
   }


}
