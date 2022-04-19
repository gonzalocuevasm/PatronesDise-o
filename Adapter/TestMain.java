package Adapter;

/* Descripción:
Simula la aplicación de un adaptador que cambia el código de un color en RGB
a Hexadecimal 
*/

public class TestMain {

    public static void paint(String color){
        if(color.length()!= 6){
            System.out.println("Código no es Hexadecimal\n");
        }
        else{
            System.out.println("Se está utilizando el código:"+ color+ "\n");
        }
    }
	public static void main(String[] args) {
		
		
		
		System.out.println("----------------------------------------");
		System.out.println("Ejemplo de Patron Adapter");
		System.out.println("----------------------------------------\n");

        String color = "AZUL";
        ColoresHex hex = new ColoresHex(color);
        //Para efectos de prueba, se ha generado una relacion con la clase ColoresRGB
        ColoresRGB rgb = new ColoresRGB(color);

        System.out.println("Usando interfaz compatible:");
        paint(hex.getColorHex());
        
        System.out.println("Usando interfaz incompatible:");
        paint(rgb.getColorRGB());

		System.out.println("--------------------------");

        Adapter colorAdaptado = new Adapter(rgb);
        paint(colorAdaptado.getColorHex());
		
	}
}