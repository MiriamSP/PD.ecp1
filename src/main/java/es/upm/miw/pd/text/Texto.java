package es.upm.miw.pd.text;

import java.util.ArrayList;

public class Texto extends CompositeDocument {

    public Texto() {
        super();

            composite = true;
    }
    /*
     * public Texto() { //super(componentes, endLineFeed); // TODO Auto-generated constructor stub }
     */

    private static String endLineFeed = "---o---";

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
            }
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public boolean isComposite() {
        return true;
    }

    public String getEndLineFeed() {
        return endLineFeed;
    }

}
