package equipo.jugador.defensa;

public class Central extends Defensa {
	
	private int entradas;
	
	public Central(String nombre, int dorsal, String equipo, int disputasRealizadas, int entradas) {
		super(nombre, dorsal, equipo, disputasRealizadas);
		this.entradas= entradas;
	}

	public int getEntradas() {
		return this.entradas;
	}

	public void setEntradas(int entradas) {
		this.entradas = entradas;
	}
	
	@Override 
	public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Dorsal: " + getDorsal());
        System.out.println("Equipo: " + getEquipo());
        System.out.println("disputas Realizadas: " +getDisputasRealizadas());
        System.out.println("entradas"+this.entradas);
    }
	@Override
    public String toString() {
        return "Central [nombre=" + getNombre() + ",equipo: " + getEquipo() + "Dorsal:" + getDorsal() + "Disputas Realizadas:"+getDisputasRealizadas()+"Entradas"+this.entradas+"]";
    }
	 @Override
	  public boolean equals(Object obj) {
		  Central otroCentral = (Central) obj;
		  boolean result = false;
		  
		  if(super.equals(obj) && this.entradas == otroCentral.entradas ) {
			  result = true;
		  }
		  return result;
	  }
}
