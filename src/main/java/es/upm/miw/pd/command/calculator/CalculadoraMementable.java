package es.upm.miw.pd.command.calculator;

public interface CalculadoraMementable<T> {
    T createMemento();

    void restoreMemento(T memento);

}
