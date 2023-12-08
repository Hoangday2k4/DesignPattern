package hus.oop.design_patterns.CommandPattern;

public class RestartCommand implements Command {
    Computer computer;
    public RestartCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {

    }
}
