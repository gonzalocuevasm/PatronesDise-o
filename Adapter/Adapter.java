package Adapter;

public class Adapter implements ClientInterface{
    private ColoresRGB colores;

    public Adapter(ColoresRGB rgb){
        this.colores = rgb;
    }

    @Override
    public String getColorHex(){
        String hex = "";
        
        System.out.println("Cambio a Hexadecimal...");

        if(colores.getColorRGB().equals("53-163-188")){
            hex = "3BA3BC";
        }
        if(colores.getColorRGB().equals("203-050-052")){
            hex = "CB3234";
        }
        if(colores.getColorRGB().equals("248-243-043")){
            hex = "3BA3BC";
        }
        return hex;
    }
}
