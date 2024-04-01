package equipo.jugador.defensa;

import equipo.jugador.Jugador;
import equipo.jugador.centroCampista.CentroCampista;
import equipo.jugador.portero.Portero;

public abstract class Defensa extends Jugador {
	

	private int disputasRealizadas;
	
	public Defensa(String nombre, int dorsal, String equipo,int disputasRealizadas) {
		super(nombre, dorsal, equipo);
		this.disputasRealizadas= disputasRealizadas;
		
	}

	public int getDisputasRealizadas() {
		return this.disputasRealizadas;
	}

	public void setDisputasRealizadas(int disputasRealizadas) {
		this.disputasRealizadas = disputasRealizadas;
	}
	
// no pongo los metodos ya que al ser clase abstract no crearemos ningun defensa 
	
}
