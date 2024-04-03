package equipo;

import equipo.jugador.Jugador;
import equipo.jugador.centroCampista.Mediapunta;
import equipo.jugador.centroCampista.Pivote;
import equipo.jugador.delantero.DelanteroCentro;
import equipo.jugador.delantero.Extremo;
import equipo.jugador.portero.Portero;

public class Main {

	public static void main(String[] args) {
//		Realiza un método principal (Main) donde pruebes.
//		Creación de un equipo y un jugador para cada posición.
//		Demostración de la selección dinámica de métodos con el método mostrarDatos de los jugadores.

		Portero j1 = new Portero("David", 1, "Betis", 156);
		Portero j2 = new Portero("David", 2, "Betis", 156);
		Portero j3 = new Portero("David", 3, "Betis", 156);
		Portero j4 = new Portero("David", 4, "Betis", 156);
		Portero j5 = new Portero("David", 5, "Betis", 156);
		Portero j9 = new Portero("David", 6, "Betis", 156);
		Portero j10 = new Portero("David", 7, "Betis", 156);
		Portero j11 = new Portero("David", 8, "Betis", 156);
		Mediapunta j8 = new Mediapunta("Ejemplo", 9, "Betis", 160, 80);
		Pivote j6 = new Pivote("Ejemplo pivote 1", 10, "Barcelona", 80, 5);
		Pivote j7 = new Pivote("Ejemplo pivote 2", 11, "Barcelona", 80, 5);
		DelanteroCentro dc = new DelanteroCentro("Pablo", 9, "R.Madrid", 0, 0);
		System.out.println(dc.toString());
		Extremo ex = new Extremo("Morales", 7, "R.Madrid", 1,"IZQUIERDO");
		System.out.println(ex.toString());
		
		Jugador[] jugadores = {j1,j2,j3,j4,j5,j6,j7,j8,j9,ex,dc};
		
		Equipo e1 = new Equipo(jugadores);
		
		for (int i = 0; i < e1.getJugadores().length; i++) {
		    System.out.println(e1.getJugadores()[i].toString());
		}
		
		
		
		

}
}
