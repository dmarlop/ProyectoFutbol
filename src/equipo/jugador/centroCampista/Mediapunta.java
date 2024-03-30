package equipo.jugador.centroCampista;


public class Mediapunta extends CentroCampista {
    private int asistencias;

    public Mediapunta(String nombre, int dorsal, String equipo,int pasesCompletados, int asistencias) {
        super(nombre, dorsal, equipo, pasesCompletados);
        this.asistencias = asistencias;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Dorsal: " + getDorsal());
        System.out.println("Equipo: " + getEquipo());
        System.out.println("Asistencias: " + getAsistencias());
    }

    @Override
    public String toString() {
    	 return "Portero [nombre=" + getNombre() + ", dorsal " + getDorsal() + " y equipo: " + getEquipo() + ", asistencias=" + asistencias + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Mediapunta))
            return false;
        Mediapunta otroMediapunta = (Mediapunta) obj;
        return getNombre().equals(otroMediapunta.getNombre()) && getDorsal() == otroMediapunta.getDorsal() && getEquipo().equals(otroMediapunta.getEquipo()) && asistencias == otroMediapunta.asistencias;
    }
}