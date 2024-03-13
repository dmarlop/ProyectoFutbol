package equipo.jugador;



public abstract class Jugador {

	//nombre, dorsal y equipo.
	
	private String nombre;
	private int dorsal;
	private String equipo;
	
	
	public Jugador (String nombre, int dorsal, String equipo) {
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.equipo = equipo;
	}
	
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
		return "Soy un jugador de futbol, sin posición por definir";
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



