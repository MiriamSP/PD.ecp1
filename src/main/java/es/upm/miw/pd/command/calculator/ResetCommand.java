package es.upm.miw.pd.command.calculator;

public class ResetCommand extends OrderComando {

    public ResetCommand(Calculator calculator) {
        super(calculator);
    }

    @Override
    public void execute() {
        calculator.reset();
    }

    @Override
    public String name() {
        return "reset";
    }

}
