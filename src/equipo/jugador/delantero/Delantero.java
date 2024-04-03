package equipo.jugador.delantero;

import equipo.jugador.Jugador;

public abstract class Delantero extends Jugador {
	
	private int goles;

	public Delantero(String nombre, int dorsal, String equipo, int goles) {
		super(nombre, dorsal, equipo);
		this.goles = goles;
	}

	public int getGoles() { 
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}
	
	
	@Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Dorsal: " + getDorsal());
        System.out.println("Equipo: " + getEquipo());
        System.out.println("Goles: " + getGoles());
    }

    @Override
    public String toString() {
        return "Delantero [nombre=" + getNombre() + ", dorsal=" + getDorsal() + ", equipo=" + getEquipo() + ", goles=" + this.goles + "]";
    }

    @Override
    public boolean equals(Object obj) {
        Delantero otroDelantero = (Delantero) obj;
          boolean result = false;

          if(super.equals(obj) && this.goles == otroDelantero.goles) {
              result = true;
          }
          return result;
      }

}
