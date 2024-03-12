package equipo.jugador;



public abstract class Jugador {

	//nombre, dorsal y equipo.
	
	private String nombre;
	private int dorsal;
	private String equipo;
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}



	public String getEquipo() {
		return equipo;
	}



	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}



	public abstract void mostrarDatos();
	
	@Override
	public String toString() {
		return "Jugador [nombre=" + this.nombre + ", dorsal y equipo: " + this.equipo + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Jugador nuevoJugador = (Jugador) obj;

		boolean result = false;

		if (this.nombre == nuevoJugador.nombre && this.dorsal == nuevoJugador.dorsal && this.equipo == nuevoJugador.equipo) {
			result = true;
		}
		return result;
	}
	
}



