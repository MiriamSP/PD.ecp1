package es.upm.miw.pd.text;

import java.util.ArrayList;

public class Parrafo extends CompositeDocument {

    public Parrafo() {
        super();
        composite = false;
        endLineFeed = "\n";
    }

  
    @Override
    public String dibujar(Boolean formatMayusculas) {
        // TODO Auto-generated method stub
        return super.dibujar(formatMayusculas);
    }
   

    @Override
    public void add(Componente componente) {
        // TODO Auto-generated method stub
        if (componente != null) {
            if (!componente.isComposite()) {
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
