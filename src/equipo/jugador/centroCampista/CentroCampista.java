package equipo.jugador.centroCampista;

import equipo.jugador.Jugador;

public abstract class CentroCampista extends Jugador {
    private int pasesCompletados;

    public CentroCampista(String nombre, int dorsal, String equipo, int pasesCompletados) {
        super(nombre, dorsal, equipo); // Llama al constructor de la clase padre para inicializar los atributos heredados
        this.pasesCompletados = pasesCompletados;
    }

    public int getPasesCompletados() {
        return pasesCompletados;
    }

    public void setPasesCompletados(int pasesCompletados) {
        this.pasesCompletados = pasesCompletados;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Dorsal: " + getDorsal());
        System.out.println("Equipo: " + getEquipo());
        System.out.println("Pases Completados: " + getPasesCompletados());
    }

    @Override
    public String toString() {
        return "Centrocampista [nombre=" + getNombre() + ", dorsal y equipo: " + getEquipo() + ", pasesCompletados=" + pasesCompletados + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof CentroCampista))
            return false;
        CentroCampista otroCentrocampista = (CentroCampista) obj;
        return getNombre().equals(otroCentrocampista.getNombre()) && getDorsal() == otroCentrocampista.getDorsal() && getEquipo().equals(otroCentrocampista.getEquipo()) && pasesCompletados == otroCentrocampista.pasesCompletados;
    }
}
