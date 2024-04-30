
class ServicioEnvio {
    double calcularTarifaEnvio(Envio envio) {
        double costoEnvio = 0.0;
        if (envio instanceof PaqueteEstandar) {
            costoEnvio = calcularTarifaPaquete((PaqueteEstandar) envio);
        } else if (envio instanceof DocumentoUrgente) {
            costoEnvio = calcularTarifaDocumento((DocumentoUrgente) envio);
        } else if (envio instanceof ArticuloFragil) {
            costoEnvio = calcularTarifaArticulo((ArticuloFragil) envio);
        }
        return costoEnvio;
    }

    
    private double calcularTarifaPaquete(PaqueteEstandar paquete) {
        double costo = 10.0; // Costo base
        if (paquete.esFragil) {
            costo += 5.0; // Costo adicional por fragilidad
        }
        return costo;
    }

  
    private double calcularTarifaDocumento(DocumentoUrgente documento) {
        double costo = 20.0; // Costo base
        // Considerar factores adicionales para documentos urgentes
        // Por ejemplo, si la distancia de entrega es larga, agregar un costo adicional
        costo += documento.peso * 2; // Ejemplo de costo adicional basado en el peso
        // También se podría agregar un costo adicional por servicio de seguimiento, seguro, etc.
        costo += 5.0; // Ejemplo de costo adicional por servicio de seguimiento
        return costo;
    }

 
    private double calcularTarifaArticulo(ArticuloFragil articulo) {
        double costo = 15.0; // Costo base
        // Considerar un costo adicional por el manejo especial de los artículos frágiles
        costo += 7.0; // Ejemplo de costo adicional por manejo especial
        return costo;
    }
}
