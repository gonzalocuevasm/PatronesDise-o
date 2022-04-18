package Strategy;



public class FiltroEscalaCalidos implements FiltrosStrategy {

	@Override
	public void aplicarFiltro(String imagen) {

		System.out.println("Filtro: Escala de Cálidos");

		//Simula la aplicación de un algoritmo para cambiar la escala de colores a una 
        System.out.println("Aplicando filtro...");

		System.out.println("Salida: "+ imagen +"-Calidos.png");
	}
}