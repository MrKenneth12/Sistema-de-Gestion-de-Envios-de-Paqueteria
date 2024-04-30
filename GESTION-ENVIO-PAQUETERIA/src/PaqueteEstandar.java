class PaqueteEstandar extends Envio {
    public PaqueteEstandar(double peso, double[] dimensiones, boolean esFragil) {
        super(peso, dimensiones, esFragil);
    }

    @Override
    double calcularCostoEnvio() {
        double costo = 0.0;
        if (peso <= 5.0) {
            costo += 5.0;
        } else if (peso <= 20.0) {
            costo += 10.0;
        } else {
            costo += 20.0;
        }

        // Calculo del costo basado en las dimensiones del paquete
        double volumen = dimensiones[0] * dimensiones[1] * dimensiones[2];
        if (volumen > 1000) {
            costo += 15.0; // Costo adicional por paquetes de gran volumen
        }

        // Ejemplo de calculo adicional basado en fragilidad
        if (esFragil) {
            costo += 5.0; // Costo adicional por fragilidad
        }

        return costo;
    }
}
