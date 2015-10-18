package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class AddCommand extends OrderComando{

    public AddCommand(Calculator calculator) {
        // TODO Auto-generated constructor stub
        super(calculator);
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        int num = IO.getIO().readInt();
        calculator.add(num);
    }

    @Override
    public String name() {
        // TODO Auto-generated method stub
        return "sumar";
    }
    

}
