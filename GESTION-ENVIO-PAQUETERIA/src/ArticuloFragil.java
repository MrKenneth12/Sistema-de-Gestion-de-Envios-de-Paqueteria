class ArticuloFragil extends Envio {
    public ArticuloFragil(double peso, double[] dimensiones, boolean esFragil) {
        super(peso, dimensiones, esFragil);
    }

    @Override
    double calcularCostoEnvio() {
        double costoBase = 15.0; 
        double costoFragilidad = 1.5;
        if (esFragil) {
            costoFragilidad = peso * 0.1; 
        }

        return costoBase + costoFragilidad;
    }
}
