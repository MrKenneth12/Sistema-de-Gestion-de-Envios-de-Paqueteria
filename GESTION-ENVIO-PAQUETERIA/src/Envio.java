import java.util.Arrays;
abstract class Envio {
    double peso;
    double[] dimensiones; // [ancho, alto, largo]
    boolean esFragil;

    public Envio(double peso, double[] dimensiones, boolean esFragil) {
        if (peso <= 0 || Arrays.stream(dimensiones).anyMatch(d -> d <= 0)) {
            throw new IllegalArgumentException("Peso y dimensiones deben ser mayores que cero.");
        }
        this.peso = peso;
        this.dimensiones = dimensiones;
        this.esFragil = esFragil;
    }

  
    abstract double calcularCostoEnvio();
}
