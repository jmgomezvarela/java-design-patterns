package factorias;

import partes.Arquero;
import partes.ArqueroHombre;
import partes.Atacante;
import partes.AtacanteHombre;
import partes.Defensor;
import partes.DefensorHombre;

public class EquipoMasculinoFactory extends EquipoFactory {
  
	@Override
	public Arquero crearArquero() {
		return new ArqueroHombre();
	}

	@Override
	public Defensor crearDefensor() {
		return new DefensorHombre();
	}

	@Override
	public Atacante crearAtacante() {
		return new AtacanteHombre();
	}
}