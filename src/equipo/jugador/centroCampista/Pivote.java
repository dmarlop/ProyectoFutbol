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
    	 return "Portero [nombre=" + getNombre() + ", dorsal " + getDorsal() + " y equipo: " + getEquipo()  + ", intercepciones=" + intercepciones + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Pivote))
            return false;
        Pivote otroPivote = (Pivote) obj;
        return getNombre().equals(otroPivote.getNombre()) && getDorsal() == otroPivote.getDorsal() && getEquipo().equals(otroPivote.getEquipo()) && intercepciones == otroPivote.intercepciones;
    }
}