package Command;

public class Invoker {

    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        if (this.command != null) {
            this.command.ejecutar();
        }

    }
    
}
