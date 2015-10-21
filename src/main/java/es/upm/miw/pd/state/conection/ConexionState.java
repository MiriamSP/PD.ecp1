package es.upm.miw.pd.state.conection;

public abstract class ConexionState {
  

    protected Conexion conexion;

    public String msjExcepcion = "[ERROR] Usupported Operation";

    public ConexionState(Conexion conexion) {
        this.conexion = conexion;
    }
    public void abrir() throws UnsupportedOperationException {
        throw new UnsupportedOperationException(msjExcepcion);
    }

    public void cerrar() throws UnsupportedOperationException {
        throw new UnsupportedOperationException(msjExcepcion);
    }

    public void parar() throws UnsupportedOperationException {
        throw new UnsupportedOperationException(msjExcepcion);
    }

    public void iniciar() throws UnsupportedOperationException {
        throw new UnsupportedOperationException(msjExcepcion);
    }

    public void enviar(String msg) throws UnsupportedOperationException {
        throw new UnsupportedOperationException(msjExcepcion);
    }

    public void recibir(int respuesta) throws UnsupportedOperationException {
        throw new UnsupportedOperationException(msjExcepcion);
    }

    public abstract Estado getEstado();   

}
