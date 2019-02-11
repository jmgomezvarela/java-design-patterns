package partes;

public class ArqueroHombre implements Arquero {

	@Override
	public String tirarseIzquierda() {
		return "tirarse izquierda arquero hombre";
	}

	@Override
	public String saqueArco() {
		return  "saque de arco de arquero hombre";
	}

	@Override
	public String tirarseDerecha() {
		return "tirarse a derecha arquero hombre";
	}
}