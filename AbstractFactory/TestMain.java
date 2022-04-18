package AbstractFactory;

/* Descripción:
Simula la fabricación de trees productos con dos colores distintos
*/
public class TestMain {
    public static void main(String[] args) {
      
      System.out.println("----------------------------------------");
      System.out.println("Ejemplo de Patron Abstract Factory");
      System.out.println("----------------------------------------");

      
      AbstractFactory factory;
      Application application;

      System.out.println("Blue Factory\n");

      factory = new BlueFactory();
      application = new Application(factory);
      application.make();

      System.out.println("\n--------------------------");
      System.out.println("Grey Factory\n");
      factory = new GreyFactory();
      application = new Application(factory);
      application.make();

	}
}
