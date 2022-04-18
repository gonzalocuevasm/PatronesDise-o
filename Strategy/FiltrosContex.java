package Strategy;

public class FiltrosContex {

    private FiltrosStrategy strategy;
	
	public void setStrategy(FiltrosStrategy strategy) {
		this.strategy = strategy;
	}
	
	public FiltrosStrategy getStrategy() {
		return this.strategy;
	}
	
	public void aplicar(String imagen){
		this.strategy.aplicarFiltro(imagen);
	}
}
