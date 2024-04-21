package dpoo.galeria.modelo.pieza;

import java.util.Date;

import java.util.List;

public class Pintura extends Pieza {
    private List<String> color;
    private String tecnica;
    private String estilo;
    private String superficie;

    public Pintura(String titulo, Date fechaCreacion, String lugarCreacion, List<String> autores,
                   String modalidadVenta, Date fechaEntrega, int ID, String IDpropietario,
                   List<String> detallesAdicionales, List<String> color, String tecnica, 
                   String estilo, String superficie) {
    	super(titulo, fechaCreacion, lugarCreacion, autores, modalidadVenta, 
              fechaEntrega, ID, IDpropietario, detallesAdicionales);
        this.color = color;
        this.tecnica = tecnica;
        this.estilo = estilo;
        this.superficie = superficie;
    }


    public List<String> getColor() {
        return color;
    }

    public void setColor(List<String> color) {
        this.color = color;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }


}