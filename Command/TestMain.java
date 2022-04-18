package Command;

/* Descripción:
Simula los dos comandos de una app de diseño, donde uno de estos comandos
permite seleccionar el tipo de pincel con el que se trabajará y el otro
el color que se usará.
*/
public class TestMain {
    
        public static void main(String[] args) {
            
            
            
            System.out.println("----------------------------------------");
            System.out.println("Ejemplo de Patron Command");
            System.out.println("----------------------------------------");
    
            
            
            Receiver valores = new Receiver();
            valores.getIniciales();

            String color = "AZUL";
            String pincel = "BROCHA";
            Invoker invocador = new Invoker();

            CambiarPincel cambioP = new CambiarPincel(valores, pincel);
            invocador.setComandos(cambioP);
            invocador.executeCommand();
            System.out.println("----------------------------------------");
            SeleccionarColor cambioC = new SeleccionarColor(valores, color);
            invocador.setComandos(cambioC);
            invocador.executeCommand();
            
            
            

    
            
        }
}
