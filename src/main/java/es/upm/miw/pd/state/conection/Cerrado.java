package es.upm.miw.pd.state.conection;


public class Cerrado extends ConexionState {

    public Cerrado() {
        //super(this.setEstado(Estado.CERRADO));
        // TODO Auto-generated constructor stub
        super(Estado.CERRADO);
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
      
        return Estado.CERRADO;
    }
}

    

   

