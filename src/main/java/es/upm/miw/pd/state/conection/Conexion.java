package es.upm.miw.pd.state.conection;

public final class Conexion {

    private String msg;

    private int respuesta;

    private Link link;

    private ConexionState conexionState;

    public Conexion(Link link) {
                     
        this.setLink(link);
        conexionState = new Cerrado();
    }

    public ConexionState getConexionState() {
        return conexionState;
    }

    public void setConexionState(ConexionState conexionState) {
        this.conexionState = conexionState;
    }

    public void enviar(String msg) {
        this.conexionState.enviar(this, msg);

    }

    public void recibir(int respuesta) {
        this.conexionState.recibir(this, respuesta);
    }

    public void abrir() {
        this.conexionState.abrir(this);
    };

    public void iniciar() {
        this.conexionState.iniciar(this);
    };

    public void parar() {
        this.conexionState.parar(this);

    };

    public void cerrar() {
        this.conexionState.cerrar(this);
    }

    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }

}
