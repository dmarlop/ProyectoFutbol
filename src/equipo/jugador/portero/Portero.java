package equipo.jugador.portero;

import equipo.jugador.Jugador;

public class Portero extends Jugador {
	
	private double altura;
	
	public Portero(String nombre, int dorsal, String equipo, double altura) {
		super(nombre, dorsal, equipo);
		this.altura= altura;
	
	}



	@Override
	public void mostrarDatos() {
		System.out.println("nombre: " + 
				this.getNombre() + ", dorsal: " + this.getDorsal() + ", equipo: " + 
					this.getEquipo() + " y altura: " + this.altura);
		
	}

	@Override
	public String toString() {
		return "Soy portero de fútbol";
		
	}
	
	@Override
	public boolean equals(Object obj) {
		Portero p1 = (Portero) obj;
		boolean result = false;
		if(super.equals(obj) && this.altura == p1.altura) {
			result = true;
		}
		return result;
	}
	
	
}
