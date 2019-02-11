package factorias;

import partes.Arquero;
import partes.Atacante;
import partes.Defensor;

public abstract class EquipoFactory {

	public abstract Arquero crearArquero();
	public abstract Defensor crearDefensor();
    public abstract Atacante crearAtacante();
}