package es.upm.miw.pd.text;

import java.util.ArrayList;

public abstract class CompositeDocument extends Componente {

    public String endLineFeed;

    public ArrayList<Componente> componentes;

    public CompositeDocument() {
        if (componentes == null) {
            componentes = new ArrayList<Componente>();
        }
    }

    @Override
    public String dibujar(Boolean formatMayusculas) {
        String text = "";
        for (Componente componente : componentes) {
            text += componente.dibujar(formatMayusculas);
        }
        return text + endLineFeed;
    }
}
