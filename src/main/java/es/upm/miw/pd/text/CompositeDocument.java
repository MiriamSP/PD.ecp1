package es.upm.miw.pd.text;

import java.util.ArrayList;

public abstract class CompositeDocument extends Componente {

    protected ArrayList<Componente> componentes;
    private String endLineFeed;

    public CompositeDocument() {
        componentes = new ArrayList<Componente>();
    }

    @Override
    public String dibujar(Boolean formatMayusculas) {
        String text = "";
        for (Componente componente : componentes) {
            text += componente.dibujar(formatMayusculas);
        }
        return text + getEndLineFeed();
    }

    private String getEndLineFeed() {
        // TODO Auto-generated method stub
        return endLineFeed;
    }


}
