package es.upm.miw.pd.state.conection;

import pd.ecp1.state.Conexion;

public class Preparado extends ConexionState {

    // Preparado//
    // Acciones: Iniciar, Abrir, Enviar, Cerrar, Parar

    public Preparado() {
        super(estado.PREPARADO);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void abrir(Conexion conexion) throws UnsupportedOperationException {
        // TODO Auto-generated method stub
        conexion.setConexionState(new Preparado());

    }

    @Override
    public void cerrar(Conexion conexion) throws UnsupportedOperationException {
        // TODO Auto-generated method stub
        conexion.setConexionState(new Cerrado());

    }

    @Override
    public void parar(Conexion conexion) throws UnsupportedOperationException {
        // TODO Auto-generated method stub
        conexion.setConexionState(new Parado());

    }

    @Override
    public void iniciar() throws UnsupportedOperationException {
        // TODO Auto-generated method stub
        conexion.setConexionState(new Preparado());
    }

    @Override
    public void enviar(Conexion conexion, String msg) throws UnsupportedOperationException {
        // TODO Auto-generated method stub
        conexion.setConexionState(new Preparado());
    }

    @Override
    public Estado getEstado() {
        // TODO Auto-generated method stub
        return Estado.CERRADO;
    }

}
