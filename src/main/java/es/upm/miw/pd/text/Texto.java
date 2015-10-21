package es.upm.miw.pd.text;

import java.util.ArrayList;

public class Texto extends CompositeDocument {

    public Texto() {
        super();
        composite = true;
        endLineFeed = "---o---\n";
    }
    

    @Override
    public String dibujar(Boolean formatMayusculas) {
        // TODO Auto-generated method stub
        return super.dibujar(formatMayusculas);
    }

    /*
     * 
     * @see es.upm.miw.pd.text.Componente#add(es.upm.miw.pd.text.Componente) Se pueden añadir o borrar párrafos o textos. Si se intenta
     * añadir un carácter se debe lanzar una UnsupportedOperationException.
     * 
     */
    @Override
    public void add(Componente componente) {
        // TODO Auto-generated method stub
        if (componente != null) {
            if (componente.isComposite()) {
                componentes.add(componente);
            } else
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public boolean isComposite() {
        return true;
    }
}
