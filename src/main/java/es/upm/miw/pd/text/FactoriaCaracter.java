package es.upm.miw.pd.text;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {
    // private Map<String, Integer> references;
    private Map<String, Caracter> references;

    private Caracter reference;

    private static FactoriaCaracter referencesFactory = null;

    public FactoriaCaracter() {
        this.references = new HashMap<>();
        this.reference = null;
    }

    public static FactoriaCaracter getFactoria() {
        if (referencesFactory == null) {
            referencesFactory = new FactoriaCaracter();
        }
        return referencesFactory;
    }

    /*
     * public Caracter getReference(String key) { Caracter result = this.references.get(key); if (result == null) { this.references.put(key,
     * this.reference); result = this.reference; reference++; } return result; }
     */

    /*
     * public int get(String key) { Integer result = this.references.get(key); if (result == null) { this.references.put(key,
     * this.reference); result = this.reference; reference++; } return result; }
     */

    public Caracter get(char key) {
        Character aux;
        aux = (Character)key;
        Caracter result = this.references.get(aux);
        if (result == null) {
            this.references.put(aux.toString(), this.reference);
            result = this.reference;
        }
        return result;
    }

    // public void removeReference(String key) {
    // this.references.remove(key);
    // }

}
