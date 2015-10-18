package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberCreatorEs extends NaturalNumberCreator {
    
    public NaturalNumber createNaturalNumber(int value){
        return new NaturalNumberEs(value);
    }
}
