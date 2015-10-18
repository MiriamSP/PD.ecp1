package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class ResetCommand extends OrderComando {

    public ResetCommand(Calculator calculator) {
        // TODO Auto-generated constructor stub
        super(calculator);
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
            calculator.reset();
    }

    @Override
    public String name() {
        // TODO Auto-generated method stub
        return "reset";
    }

}
