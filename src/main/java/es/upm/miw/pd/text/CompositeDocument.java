package es.upm.miw.pd.text;

import java.util.ArrayList;

public abstract class CompositeDocument extends Componente {

    private String endLineFeed;

    
    
   public CompositeDocument(ArrayList<Componente> componentes, String endLineFeed) {
        super(componentes);
        this.endLineFeed = endLineFeed;
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
