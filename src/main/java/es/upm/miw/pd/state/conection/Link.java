package es.upm.miw.pd.state.conection;

public interface Link {
    
    public static final int ACK = 0;
    
    public abstract void enviar(String msg);

    public abstract void recibir(int respuesta);
}