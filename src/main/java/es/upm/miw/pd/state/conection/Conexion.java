package es.upm.miw.pd.state.conection;

public final class Conexion implements Link {

    private String msg;

    private int respuesta;
    
    

    private ConexionState conexionState;

    public Conexion(LinkMock link) {
        super();
        this.conexionState = link;
    }

    public ConexionState getConexionState() {
        return conexionState;
    }

    public void setConexionState(ConexionState conexionState) {
        this.conexionState = conexionState;
    }
    
    public Estado getEstado(){
        return this.conexionState.estado;
    }

    public String getMsg() {
        return msg;
    }

    public int getRespuesta() {
        return respuesta;
    }

    @Override
    public void enviar(String msg) {
        this.msg = msg;
    }

    @Override
    public void recibir(int respuesta) {
        this.respuesta = respuesta;
    }

    public void abrir() {
    };

    public void iniciar() {
    };

    public void parar() {
    };

    public void cerrar() {
    }

   
}
