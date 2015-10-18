package es.upm.miw.pd.text;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {
    private Map<String, Integer> references;

    private int reference;

    private static FactoriaCaracter referencesFactory = null;

    public FactoriaCaracter() {
        this.references = new HashMap<>();
        this.reference = 0;
    }

    public static FactoriaCaracter getFactoria() {
        if (referencesFactory == null) {
            referencesFactory = new FactoriaCaracter();
        }
        return referencesFactory;
    }

    public int getReference(String key) {
        Integer result = this.references.get(key);
        if (result == null) {
            this.references.put(key, this.reference);
            result = this.reference;
            reference++;
        }
        return result;
    }

    public void removeReference(String key) {
        this.references.remove(key);
    }

}
