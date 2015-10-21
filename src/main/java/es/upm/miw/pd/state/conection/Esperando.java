package es.upm.miw.pd.state.conection;

public class Esperando extends ConexionState {
//Esperando:
//    Acciones: Recibir

    public Esperando() {
        super(Estado.ESPERANDO);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void recibir(Conexion conexion, int respuesta) throws UnsupportedOperationException {
        // TODO Auto-generated method stub
        conexion.getLink().recibir(respuesta);  
        if (respuesta > 0 ){
            conexion.setConexionState(new Cerrado());
        } else if (respuesta == 0){
            conexion.setConexionState(new Preparado());
        }
       
    }
    @Override
    public Estado getEstado() {
        // TODO Auto-generated method stub
        return Estado.ESPERANDO;
    }
    

}
