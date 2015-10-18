package es.upm.miw.pd.state.conection;

public abstract class ConexionState {
    
    protected Estado estado;
    private String msjExcepcion = "[ERROR] Usupported Operation";
    

    public ConexionState(Estado estado) {
        this.estado = estado;
    }

    public void abrir(Conexion conexion){
        throw new UnsupportedOperationException(msjExcepcion);
    }

    public  void iniciar(){};

    public  void parar(){};

    public void cerrar(){}

    public void cerrar(Conexion conexion) {
        // TODO Auto-generated method stub
        
    };

}
