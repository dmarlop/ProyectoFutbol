package equipo.jugador.centroCampista;

import equipo.jugador.Jugador;

public class CentroCampista extends Jugador {
    private int pasesCompletados;

    public CentroCampista(String nombre, int dorsal, String equipo, int pasesCompletados) {
        this.setNombre(nombre);
        this.setDorsal(dorsal);
        this.setEquipo(equipo);
        this.pasesCompletados = pasesCompletados;
    }

    public int getPasesCompletados() {
        return pasesCompletados;
    }

    public void setPasesCompletados(int pasesCompletados) {
        this.pasesCompletados = pasesCompletados;
    }

    @Override // Imprime por consola los datos del centrocampista, como su nombre, dorsal, equipo y la cantidad de pases completados
    public void mostrarDatos() {
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Dorsal: " + this.getDorsal());
        System.out.println("Equipo: " + this.getEquipo());
        System.out.println("Pases Completados: " + this.getPasesCompletados());
    }

    @Override
    public String toString() {
        return "Centrocampista [nombre=" + this.getNombre() + ", dorsal y equipo: " + this.getEquipo() + ", pasesCompletados=" + this.pasesCompletados + "]";
    }

    @Override // Este método verifica si el objeto actual es igual al objeto pasado como argumento
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof CentroCampista))
            return false;
        CentroCampista otroCentrocampista = (CentroCampista) obj;
        return this.getNombre().equals(otroCentrocampista.getNombre()) && this.getDorsal() == otroCentrocampista.getDorsal() && this.getEquipo().equals(otroCentrocampista.getEquipo()) && this.pasesCompletados == otroCentrocampista.pasesCompletados;
    }
}
