package es.upm.miw.pd.text;

import java.util.ArrayList;

public abstract class Componente {

    protected   ArrayList<Componente> componentes;

    public Componente() {
        componentes = new ArrayList<>();
    }

   

    public abstract String dibujar(Boolean formatMayusculas);

    public abstract void add(Componente componente);

    public abstract boolean isComposite();

}
