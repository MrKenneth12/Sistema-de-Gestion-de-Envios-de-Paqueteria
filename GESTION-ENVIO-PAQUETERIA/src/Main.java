public class Main {
    public static void main(String[] args) {
        
        ServicioEnvio servicioEnvío = new ServicioEnvio();
        PaqueteEstandar paquete = new PaqueteEstandar(5.0, new double[]{10.0, 20.0, 15.0}, false);
      
        double costoPaquete = servicioEnvío.calcularTarifaEnvio(paquete);
        System.out.println("Costo del paquete estándar: $" + costoPaquete);

        DocumentoUrgente documento = new DocumentoUrgente(0.5, new double[]{8.0, 11.0, 0.1}, false);
        
        double costoDocumento = servicioEnvío.calcularTarifaEnvio(documento);
        System.out.println("Costo del documento urgente: $" + costoDocumento);

     
        ArticuloFragil articulo = new ArticuloFragil(2.0, new double[]{5.0, 5.0, 5.0}, true);
       
        double costoArticulo = servicioEnvío.calcularTarifaEnvio(articulo);
        System.out.println("Costo del artículo frágil: $" + costoArticulo);
    }
}

