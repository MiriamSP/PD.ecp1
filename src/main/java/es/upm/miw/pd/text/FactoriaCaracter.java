package es.upm.miw.pd.text;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {
    
    private Map<String, Caracter> references;

    private static FactoriaCaracter referencesFactory = null;

    public FactoriaCaracter() {
        this.references = new HashMap<>();
    }

    public static FactoriaCaracter getFactoria() {
        if (referencesFactory == null) {
            referencesFactory = new FactoriaCaracter();
        }
        return referencesFactory;
    }

    public Caracter get(char key) {
        if (references.containsKey(key)) {
            return references.get(key);
        } else {
            // construcción perezosa
            Caracter pl = new Caracter(key);
            Character sKey = (Character) key;
            references.put(sKey.toString(), pl);
            return pl;
        }
    }
}
