public class Jugador {
    /*Atributos*/
    private String nombre;
    private int numeroCamiseta;
    private String posicion;

    /*Constructor*/
    public Jugador(String nombre, int numeroCamiseta, String posicion) {
        this.nombre = nombre;
        this.numeroCamiseta = numeroCamiseta;
        this.posicion = posicion;
    }

    /*Metodos*/
    public String entrenar;
    public System jugar;
    public EstadisticaJugador estadisticas;



    /*Getters y Setters*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setEstadisticas(EstadisticaJugador estadisticas) {
        this.estadisticas = estadisticas;
    }

    public EstadisticaJugador getEstadisticas() {
        return estadisticas;
    }
}
