package equipo.jugador.delantero;

public class Extremo extends Delantero{
	private String puesto;
	
	public Extremo(String nombre, int dorsal, String equipo, int goles, String puesto) {
		super(nombre, dorsal, equipo, goles);
	    this.puesto = puesto;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	 @Override
	 public void mostrarDatos() {
	        super.mostrarDatos();
	        System.out.println("Puesto: "+ getPuesto());
	    }
	
	 @Override
	 public String toString() {
	        return  super.toString() + "puesto =" + this.puesto ;
	    }
	 
	 @Override
	  public boolean equals(Object obj) {
	        Extremo otroExtremo = (Extremo) obj;
	          boolean result = false;

	          if(super.equals(obj) && this.puesto == otroExtremo.puesto) {
	              result = true;
	          }
	          return result;
	      }
	 
}
