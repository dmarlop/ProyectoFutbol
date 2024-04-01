package equipo.jugador.defensa;

public class Lateral extends Defensa{
	
	private Puesto puesto;
	public Lateral(String nombre, int dorsal, String equipo, int disputasRealizadas,String puesto) {
		super(nombre, dorsal, equipo, disputasRealizadas);
		setPuesto(null);
	}
	public String getPuesto() {
		return puesto.toString();
	}
	public void setPuesto(Puesto puesto) {
		this.puesto = puesto.valueOf(getPuesto());
	}
	
	@Override 
	public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Dorsal: " + getDorsal());
        System.out.println("Equipo: " + getEquipo());
        System.out.println("disputas Realizadas: " +getDisputasRealizadas());
        System.out.println("Puesto"+this.puesto);
    }
	@Override
    public String toString() {
        return "Lateral [nombre=" + getNombre() + ",equipo: " + getEquipo() + "Dorsal:" + getDorsal() + "Disputas Realizadas:"+getDisputasRealizadas()+"Puesto"+this.puesto+"]";
    }
	 @Override
	  public boolean equals(Object obj) {
		  Lateral otroLateral = (Lateral) obj;
		  boolean result = false;
		  
		  if(super.equals(obj) && this.puesto == otroLateral.puesto ) {
			  result = true;
		  }
		  return result;
	  }
}
