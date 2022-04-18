package Strategy;

public class FiltroEscalaFrios implements FiltrosStrategy {

	@Override
	public void aplicarFiltro(String imagen) {
		System.out.println("Filtro: Escala de Fríos");

		//Simula la aplicación de un algoritmo para cambiar la escala de colores a una 
        System.out.println("Aplicando filtro...");


		System.out.println("Salida: "+ imagen +"-Frios.png");
	}
}