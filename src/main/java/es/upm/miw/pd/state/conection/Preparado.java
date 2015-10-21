package es.upm.miw.pd.state.conection;

public class Preparado extends ConexionState {
    // Preparado
    // Acciones: Iniciar, Abrir, Enviar, Cerrar, Parar

    public Preparado() {
        super(Estado.PREPARADO);
    }

    @Override
    public void abrir(Conexion conexion) throws UnsupportedOperationException {
        conexion.setConexionState(new Preparado());
    }

    @Override
    public void cerrar(Conexion conexion) throws UnsupportedOperationException {
        conexion.setConexionState(new Cerrado());
    }

    @Override
    public void parar(Conexion conexion) throws UnsupportedOperationException {
        conexion.setConexionState(new Parado());
    }

    @Override
    public void iniciar(Conexion conexion) throws UnsupportedOperationException {
        conexion.setConexionState(new Preparado());
    }

    @Override
    public void enviar(Conexion conexion, String msg) throws UnsupportedOperationException {
        conexion.getLink().enviar(msg);
        conexion.setConexionState(new Esperando());
    }

    @Override
    public Estado getEstado() {
        return Estado.PREPARADO;
    }
}
