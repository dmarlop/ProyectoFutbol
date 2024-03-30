package equipo.jugador.centroCampista;

public class Pivote extends CentroCampista {
    private int intercepciones;

    public Pivote(String nombre, int dorsal, String equipo,int pasesCompletados, int intercepciones) {
        super(nombre, dorsal, equipo, pasesCompletados);
        this.intercepciones = intercepciones;
    }

    public int getIntercepciones() {
        return intercepciones;
    }

    public void setIntercepciones(int intercepciones) {
        this.intercepciones = intercepciones;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Dorsal: " + getDorsal());
        System.out.println("Equipo: " + getEquipo());
        System.out.println("Intercepciones: " + getIntercepciones());
    }

    @Override
    public String toString() {
        return "Pivote [nombre=" + getNombre() + ", dorsal " + getDorsal() + " y equipo: " + getEquipo() + ", pasesCompletados=" + getPasesCompletados() + ", intercepciones=" + getIntercepciones() + "]";
    }


    @Override
	  public boolean equals(Object obj) {
    	Pivote otroPivote = (Pivote) obj;
		  boolean result = false;
		  
		  if(super.equals(obj) && this.intercepciones == otroPivote.intercepciones) {
			  result = true;
		  }
		  return result;
	  }
}