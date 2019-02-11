package partes;

public class DefensorHombre implements Defensor {

	@Override
	public String barrida() {
		return "barrida defensor hombre";
	}

	@Override
	public String despeje() {
		return "despeje defensor hombre";
	}

	@Override
	public String cabezazoDefensivo() {
		return "cabezazo defensor hombre";
	}
}