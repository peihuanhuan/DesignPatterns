package demo.command;

/**
 * 复合指令，有一组指令构成
 */
public class MultiCommand implements Command {

    private Command[] commands;

    public MultiCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void executed() {
        for(Command command:commands){
            command.executed();
        }
    }

    @Override
    public void undo() {
        for(Command command:commands){
            command.undo();
        }
    }
}
