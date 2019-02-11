package factorias;

import partes.Arquero;
import partes.ArqueroMujer;
import partes.Atacante;
import partes.AtacanteMujer;
import partes.Defensor;
import partes.DefensorMujer;

public class EquipoFemeninoFactory extends EquipoFactory {

	@Override
	public Arquero crearArquero() {
		return new ArqueroMujer();
	}

	@Override
	public Defensor crearDefensor() {
		return new DefensorMujer();
	}

	@Override
	public Atacante crearAtacante() {
		return new AtacanteMujer();
	}
}