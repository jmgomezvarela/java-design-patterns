package partes;

public class AtacanteHombre implements Atacante{

	@Override
	public String patearArco() {
		return "tiro al arco atacante hombre";
	}

	@Override
	public String gambetear() {
		return "gambeta atacante hombre";
	}

	@Override
	public String cabezazoOfensivo() {
		return "cabezazo atacante hombre";
	}  
}