package es.progcipfpbatoi.views;

import de.vandermeer.asciitable.AsciiTable;
import de.vandermeer.skb.interfaces.transformers.textformat.TextAlignment;
import es.progcipfpbatoi.model.entidades.Viaje;
import java.util.List;


public class ListadoViajesView {

    private final List<Viaje> viajes;

    private static final int ANCHO_TABLA = 100;

    public ListadoViajesView(List<Viaje> viajes) {
        this.viajes = viajes;
    }

    private AsciiTable buildASCIITable()  {
        
        AsciiTable view = new AsciiTable();
        view.addRule();
        view.addRow("*", "*", "*", "*", "*", "*", "*", "*");
        view.addRule();
        view.addRow(null, null, null, null, null, null, null, "Listado Viajes");
        view.addRule();
        view.addRow("Cod. Viaje", null, "Ruta", "Precio", "Propietario", "Tipo", "Plazas Disponibles", "Cancelado");
        view.addRule();
        generarFilasViajes(view);
        view.setTextAlignment(TextAlignment.CENTER);
        return view;
    }

    @Override
    public String toString() {
        return buildASCIITable().render(ANCHO_TABLA);
    }

    private void generarFilasViajes (AsciiTable tabla){
        
        // Implementa este método usando un bucle que itere sobre la lista de viajes y mostrando uno por fila.
        
        tabla.addRow(1, null, "Barcelona-Alicante", 45, "roberto1979", "Estándar", 3, "No");
        tabla.addRule();
        tabla.addRow(2, null, "Alcoy-Elche", 10, "sergio123", "Estándar", 5, "Sí");
        tabla.addRule();
    }
}
