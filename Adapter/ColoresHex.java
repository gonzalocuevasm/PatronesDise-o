package Adapter;

public class ColoresHex {
    private String hex;

    public ColoresHex(String color){
        if(color.equals("AZUL")){
            this.hex = "3BA3BC";
        }
        if(color.equals("ROJO")){
            this.hex = "CB3234";
        }
        if(color.equals("AMARILLO")){
            this.hex = "F8F32B";
        }
    }
    public String getColorHex(){
        return this.hex;
    }
}
