package es.upm.miw.pd.state.conection;

public class Parado extends ConexionState {
    // Parado
    // Acciones: Parar, Iniciar

    public Parado() {
        super(Estado.PARADO);
    }

    @Override
    public void parar(Conexion conexion) throws UnsupportedOperationException {
        conexion.setConexionState(new Parado());
    }

    @Override
    public void iniciar(Conexion conexion) throws UnsupportedOperationException {
        conexion.setConexionState(new Preparado());

    }

    public Estado getEstado() {
        return Estado.PARADO;
    }
}
