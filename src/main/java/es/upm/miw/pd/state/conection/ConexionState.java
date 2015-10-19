package es.upm.miw.pd.state.conection;

public abstract class ConexionState {

    protected Estado estado;

    public String msjExcepcion = "[ERROR] Usupported Operation";

    public ConexionState(Estado estado) {
        this.estado = estado;
    }

    public void abrir(Conexion conexion) {
        throw new UnsupportedOperationException(msjExcepcion);
    }

    public void iniciar(Conexion conexion) {
    };

    public void parar(Conexion conexion) {
    };

    public void cerrar(Conexion conexion) {
    };

}
