package dpoo.galeria.modelo.pieza;

import java.util.Date;
import java.util.List;

public abstract class Pieza {
    protected String titulo;
    protected Date fechaCreacion;
    protected String lugarCreacion;
    protected List<String> autores;
    protected String modalidadVenta;
    protected Date fechaEntrega;
    protected int ID;
    protected String IDpropietario;
    protected List<String> detallesAdicionales;

    public Pieza(String titulo, Date fechaCreacion, String lugarCreacion, List<String> autores,
                 String modalidadVenta, Date fechaEntrega, int ID, String IDpropietario,
                 List<String> detallesAdicionales) {
        this.titulo = titulo;
        this.fechaCreacion = fechaCreacion;
        this.lugarCreacion = lugarCreacion;
        this.autores = autores;
        this.modalidadVenta = modalidadVenta;
        this.fechaEntrega = fechaEntrega;
        this.ID = ID;
        this.IDpropietario = IDpropietario;
        this.detallesAdicionales = detallesAdicionales;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getLugarCreacion() {
        return lugarCreacion;
    }

    public void setLugarCreacion(String lugarCreacion) {
        this.lugarCreacion = lugarCreacion;
    }

    public List<String> getAutores() {
        return autores;
    }

    public void setAutores(List<String> autores) {
        this.autores = autores;
    }

    public String getModalidadVenta() {
        return modalidadVenta;
    }

    public void setModalidadVenta(String modalidadVenta) {
        this.modalidadVenta = modalidadVenta;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getIDpropietario() {
        return IDpropietario;
    }

    public void setIDpropietario(String IDpropietario) {
        this.IDpropietario = IDpropietario;
    }

    public List<String> getDetallesAdicionales() {
        return detallesAdicionales;
    }

    public void setDetallesAdicionales(List<String> detallesAdicionales) {
        this.detallesAdicionales = detallesAdicionales;
    }

    
}
