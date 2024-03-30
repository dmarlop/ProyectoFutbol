package equipo.jugador;



public abstract class Jugador {

	//nombre, dorsal y equipo.
	
	private String nombre;
	private int dorsal;
	private String equipo;
	
	public Jugador (String nombre, int dorsal, String equipo) {
		
		this.nombre = nombre;
		setDorsal(dorsal);
		this.equipo = equipo;
		
	}
	
	public Jugador (String nombre, String equipo) {
		
		this.nombre = nombre;
		this.dorsal = 99;
		this.equipo = equipo;
		
	}
	

	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDorsal() {
		return this.dorsal;
	}
	
	public void setDorsal(int dorsal) {
		if(dorsal >= 100) {
			throw new IllegalArgumentException("Error: No puedes asignar un dorsal de 3 cifras.");
		}
		this.dorsal = dorsal;
		
	}
	
	public String getEquipo() {
		return this.equipo;
	}
	
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	
	public abstract void mostrarDatos();
	
	
	@Override
	public abstract String toString ();
	
	
	@Override
	public boolean equals (Object obj) {
		Jugador nuevoJugador = (Jugador) obj;
		boolean result = false;
		
		if(this.dorsal == nuevoJugador.getDorsal() && 
				this.nombre.equals(nuevoJugador.getNombre()) && 
				this.equipo.equals(nuevoJugador.getEquipo())) {
			result = true;
			
		}
		return result;
	}
	
}



