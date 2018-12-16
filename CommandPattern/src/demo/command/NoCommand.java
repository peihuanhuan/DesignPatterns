package demo.command;

public class NoCommand implements Command {
    @Override
    public void executed() {
        System.out.println("没有设置命令");
    }

    @Override
    public void undo() {
        System.out.println("没有设置命令");
    }
}
