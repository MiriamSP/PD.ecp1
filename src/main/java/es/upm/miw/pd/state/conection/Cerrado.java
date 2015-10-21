package es.upm.miw.pd.state.conection;

public class Cerrado extends ConexionState {

    public Cerrado() {
        super(Estado.CERRADO);
    }

    @Override
    public void abrir(Conexion conexion) {
        conexion.setConexionState(new Preparado());
    }

    @Override
    public void cerrar(Conexion conexion) throws UnsupportedOperationException {
        conexion.setConexionState(new Cerrado());
    }

    @Override
    public Estado getEstado() {
        return Estado.CERRADO;
    }
}
