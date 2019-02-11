package com.ar.uso;

import factorias.EquipoFactory;
import factorias.EquipoFemeninoFactory;
import factorias.EquipoMasculinoFactory;
import partes.Arquero;
import partes.Atacante;
import partes.Defensor;

public class Main {

	public static void main(String[] args) {	    
        crearEquipo(new EquipoMasculinoFactory());
        crearEquipo(new EquipoFemeninoFactory());
	}
	
	  public static void crearEquipo(EquipoFactory factory) {
	        Arquero arquero = factory.crearArquero();
	        Defensor defensor = factory.crearDefensor();
	        Atacante atacante = factory.crearAtacante();
	      
	        System.out.println("_______Un equipo fue creado:_____ ");	   	
	        System.out.println(arquero.saqueArco());
	        System.out.println(defensor.barrida());
	        System.out.println(atacante.cabezazoOfensivo());	        
	    }
}