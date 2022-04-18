package Strategy;

public class FiltroEscalaGrises implements FiltrosStrategy {

	@Override
	public void aplicarFiltro(String imagen) {
		System.out.println("Filtro: Escala de Grises");

		//Simula la aplicación de un algoritmo para cambiar la escala de colores
        System.out.println("Aplicando filtro...");


		System.out.println("Salida: "+ imagen +"-Grises.png");
	}
}