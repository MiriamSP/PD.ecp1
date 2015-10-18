package es.upm.miw.pd.text;

public abstract class Componente {
    
    public abstract String dibujar(Boolean formatMayusculas);

    public abstract void add(Componente componente);
    
    public abstract boolean isComposite();

}
