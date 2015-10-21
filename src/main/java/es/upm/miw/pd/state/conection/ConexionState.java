package es.upm.miw.pd.state.conection;

public abstract class ConexionState {

    private Estado estado;

    public String msjExcepcion = "[ERROR] Usupported Operation";

    public ConexionState(Estado estado) {
        this.estado = estado;
    }

    public void abrir(Conexion conexion) throws UnsupportedOperationException {
        throw new UnsupportedOperationException(msjExcepcion);
    }

    public void cerrar(Conexion conexion) throws UnsupportedOperationException {
        throw new UnsupportedOperationException(msjExcepcion);
    }

    public void parar(Conexion conexion) throws UnsupportedOperationException {
        throw new UnsupportedOperationException(msjExcepcion);
    }

    public void iniciar(Conexion conexion) throws UnsupportedOperationException {
        throw new UnsupportedOperationException(msjExcepcion);
    }

    public void enviar(Conexion conexion, String msg) throws UnsupportedOperationException {
        throw new UnsupportedOperationException(msjExcepcion);
    }

    public void recibir(Conexion conexion, int respuesta) throws UnsupportedOperationException {
        throw new UnsupportedOperationException(msjExcepcion);
    }

    public Estado getEstado() {
        return this.estado;
    };

    public void setEstado(Estado estado) {
        this.estado = estado;
    };
}
