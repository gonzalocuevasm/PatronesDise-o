package Strategy;

/* Descripción:
Simula la aplicación de tres filtros distintos a una imagen, donde cada uno trabaja 
con un algoritmo especifico y entrega un archivo resultante asociado a ese filtro.
*/
public class TestMain {

	public static void main(String[] args) {
		
		String imagen = "Imagen";
		
		System.out.println("----------------------------------------");
		System.out.println("Ejemplo de Patron Strategy");
		System.out.println("----------------------------------------");

		FiltrosContex context = new FiltrosContex();

		context.setStrategy(new FiltroEscalaCalidos());
		context.aplicar(imagen);

		System.out.println("--------------------------");
		
		context.setStrategy(new FiltroEscalaFrios());
		context.aplicar(imagen);

		System.out.println("--------------------------");
		
		context.setStrategy(new FiltroEscalaGrises());
		context.aplicar(imagen);
		
		
	}
}