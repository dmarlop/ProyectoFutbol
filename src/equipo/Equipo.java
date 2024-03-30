package equipo;

import equipo.jugador.Jugador;
import equipo.jugador.centroCampista.Mediapunta;
import equipo.jugador.centroCampista.Pivote;
import equipo.jugador.portero.Portero;

public class Equipo {
	
	private Jugador [] jugadores;

	public Equipo(Jugador[] jugadores) {
		
		this.jugadores = jugadores;
	}



	public Jugador[] getJugadores() {
		return jugadores;
	}

	public void setJugadores(Jugador[] jugadores) {
		this.jugadores = jugadores;
	}
	
	
	public void añadirJugador (int i, Jugador j) {
		
		if(i<0 || i > jugadores.length-1) {
			throw new IllegalArgumentException("La posición no se encuentra dentro del Array");
		}
		
		jugadores[i] = j;
		
	}
	
	public void mostrarAlineacion() {
        String[] posicion = {
            "Portero",
            "Lateral izquierdo",
            "Central",
            "Central",
            "Lateral derecho",
            "Pivote",
            "Pivote",
            "Mediapunta",
            "Extremo izquierdo",
            "Extremo derecho",
            "Delantero centro"
        };
        
        if (jugadores.length < posicion.length) {
            throw new IllegalArgumentException("No todos los puestos están cubiertos");
        }

        for (int i = 0; i < posicion.length; i++) {
            System.out.println(i + ": " + posicion[i] + ". " + jugadores[i].getNombre() + ", " + jugadores[i].getDorsal());
        }
    }

	
	
}
