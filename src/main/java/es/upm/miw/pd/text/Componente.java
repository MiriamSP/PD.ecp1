package es.upm.miw.pd.text;

import java.util.ArrayList;

public abstract class Componente {
      
    
       protected ArrayList<Componente> componentes;
    

    public Componente(ArrayList<Componente> componentes) {
        this.componentes = new ArrayList<Componente>();
    }

    public abstract String dibujar(Boolean formatMayusculas);

    public abstract void add(Componente componente);
    
    public abstract boolean isComposite();

}
