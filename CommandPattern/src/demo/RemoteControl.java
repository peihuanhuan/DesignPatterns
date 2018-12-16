package demo;

import demo.command.Command;
import demo.command.NoCommand;

import java.util.Arrays;

/**
 * 遥控器类
 */
public class RemoteControl {

    //
    private Command[] onCommands;
    private Command[] offCommands;

    private Command undoCommand;

    /**
     * 一个遥控器有三组按钮
     */
    public RemoteControl() {
        onCommands = new Command[3];
        offCommands = new Command[3];

        //填充空指令
        Command noCommand = new NoCommand();
        Arrays.fill(onCommands, noCommand);
        Arrays.fill(offCommands, noCommand);
    }

    /**
     * 设置对应按钮的指令
     * @param slot 按钮号
     * @param onCommand 开指令
     * @param offCommand 关指令
     */
    public void setCommand(int slot,Command onCommand,Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    /**
     * 按下了slot号 开按钮
     * @param slot 按钮号
     */
    public void OnButtonWasPushed(int slot){
        onCommands[slot].executed();

        undoCommand = onCommands[slot];
    }

    /**
     * 按下了slot号 关按钮
     * @param slot 按钮号
     */
    public void OffButtonWasPushed(int slot){
        offCommands[slot].executed();

        undoCommand = offCommands[slot];
    }

    /**
     * 撤销最后一次执行的指令
     */
    public void UndoButtonWasPushed(){
        undoCommand.undo();
    }



}
