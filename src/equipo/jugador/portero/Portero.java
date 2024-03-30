package equipo.jugador.portero;

import equipo.jugador.Jugador;

public class Portero extends Jugador {
	
	private int paradas;

	public Portero(String nombre, int dorsal, String equipo, int paradas) {
		super(nombre, dorsal, equipo);
		this.paradas = paradas;
		
	}
	
	
	

	 public int getParadas() {
		return paradas;
	}




	public void setParadas(int paradas) {
		this.paradas = paradas;
	}




	@Override
	    public void mostrarDatos() {
	        System.out.println("Nombre: " + getNombre());
	        System.out.println("Dorsal: " + getDorsal());
	        System.out.println("Equipo: " + getEquipo());
	        System.out.println("Paradas: " + getParadas());
	    }

	  @Override
	    public String toString() {
	        return "Portero [nombre=" + getNombre() + ", dorsal " + getDorsal() + " y equipo: " + getEquipo() + " y paradas=" + getParadas() + "]";
	    }
	
	  @Override
	  public boolean equals(Object obj) {
		  Portero otroPortero = (Portero) obj;
		  boolean result = false;
		  
		  if(super.equals(obj) && this.paradas == otroPortero.paradas) {
			  result = true;
		  }
		  return result;
	  }
	
	
	
	
}
