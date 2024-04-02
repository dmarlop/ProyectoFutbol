package equipo.jugador.delantero;

public class DelanteroCentro extends Delantero{
	private int golesDePenalti;
	
	public DelanteroCentro(String nombre, int dorsal, String equipo, int goles, int golesDePenalti) {
		super(nombre, dorsal, equipo, goles);
	    this.golesDePenalti = golesDePenalti;
	}

	public int getGolesDePenalti() {
		return golesDePenalti;
	}

	public void setGolesDePenalti(int golesDePenalti) {
		this.golesDePenalti = golesDePenalti;
	}
	
	@Override
	 public void mostrarDatos() {
		super.mostrarDatos();
        System.out.println("golesDePenalti: " + getGolesDePenalti());
    }
	
	
	  @Override
	    public String toString() {
	        return "DelanteroCentro [nombre=" + getNombre() + ", dorsal " + getDorsal() + " y equipo: " + getEquipo() + ", goles=" + getGoles() + ", GolesDePenalti +"+ this.golesDePenalti + "]";
	    }
	  
	  
	  @Override
	  public boolean equals(Object obj) {
	        DelanteroCentro otroDelanteroCentro = (DelanteroCentro) obj;
	          boolean result = false;

	          if(super.equals(obj) && this.golesDePenalti == otroDelanteroCentro.golesDePenalti) {
	              result = true;
	          }
	          return result;
	      }
	  

}
