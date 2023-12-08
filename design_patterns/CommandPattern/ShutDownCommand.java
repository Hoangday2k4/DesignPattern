package hus.oop.design_patterns.CommandPattern;

public class ShutDownCommand implements Command {
    Computer computer;

    public ShutDownCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {

    }
}
