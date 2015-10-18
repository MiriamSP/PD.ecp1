package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class SubtractCommand extends OrderComando {

    public SubtractCommand(Calculator calculator) {
        super(calculator);
    }

    @Override
    public void execute() {
        int num = IO.getIO().readInt();
        calculator.subtract(num);
    }

    @Override
    public String name() {
        return "restar";
    }

}
