package Adapter;

public class ColoresRGB {
    private String rgb;

    
    public ColoresRGB(String color){
        if(color.equals("AZUL")){
            this.rgb = "53-163-188";
        }
        if(color.equals("ROJO")){
            this.rgb = "203-050-052";
        }
        if(color.equals("AMARILLO")){
            this.rgb = "248-243-043";
        }
    }
    public String getColorRGB(){
        return this.rgb;
    }
}

