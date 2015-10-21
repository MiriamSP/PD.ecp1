package es.upm.miw.pd.state.conection;


public class Cerrado extends ConexionState {

    public Cerrado() {
        super(Estado.CERRADO);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void abrir(Conexion conexion) {
        // TODO Auto-generated method stub
        conexion.setConexionState(new Preparado());
    }

    @Override
    public void cerrar(Conexion conexion) throws UnsupportedOperationException {
        // TODO Auto-generated method stub
        conexion.setConexionState(new Cerrado());
    }

    @Override
    public Estado getEstado() {
        // TODO Auto-generated method stub
        return estado.CERRADO;
    }

    

   

}
