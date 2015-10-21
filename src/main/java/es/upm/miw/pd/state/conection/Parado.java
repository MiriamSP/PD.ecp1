package es.upm.miw.pd.state.conection;

public class Parado extends ConexionState{
//    Parado
 //   Acciones: Parar, Iniciar

    public Parado() {
        // TODO Auto-generated constructor stub
        super(Estado.PARADO);
    }

    @Override
    public void parar(Conexion conexion) throws UnsupportedOperationException {
        // TODO Auto-generated method stub
        conexion.setConexionState(new Parado());
    }

    @Override
    public void iniciar(Conexion conexion) throws UnsupportedOperationException {
        // TODO Auto-generated method stub
        conexion.setConexionState(new Preparado());

    }
    public Estado getEstado() {
        // TODO Auto-generated method stub
        return Estado.PARADO;
    }
    
}
