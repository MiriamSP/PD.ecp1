package es.upm.miw.pd.text;

import java.util.ArrayList;

public abstract class CompositeDocument extends Componente {

    private static String endLineFeed;

    
    
   public CompositeDocument() {
       // super(componentes);
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
