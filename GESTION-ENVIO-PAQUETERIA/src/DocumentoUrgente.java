
class DocumentoUrgente extends Envio {
    public DocumentoUrgente(double peso, double[] dimensiones, boolean esFragil) {
        super(peso, dimensiones, esFragil);
    }

    @Override
    double calcularCostoEnvio() {
     
        double costo = 20.0; // Ejemplo de costo base para envío urgente
        costo += peso * 2.0; // Ejemplo de incremento de costo por peso
        double volumen = dimensiones[0] * dimensiones[1] * dimensiones[2];
        costo += volumen * 0.5; // Ejemplo de incremento de costo por volumen
        return costo;
    }
}
