package demo;

import demo.command.Command;
import demo.command.LightOffCommand;
import demo.command.LightOnCommand;
import demo.command.MultiCommand;
import demo.receiver.Light;

public class Test {

    public static void main(String args[]){

        //新建一个灯
        Light light = new Light();

        //新建一个遥控器
        RemoteControl remoteControl = new RemoteControl();

        //新建开灯关灯指令
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        //设置命令
        remoteControl.setCommand(0,lightOnCommand,lightOffCommand);


        //设置一组命令
        Command[] commands={lightOnCommand,lightOffCommand,lightOnCommand,lightOffCommand,lightOnCommand,lightOnCommand};
        MultiCommand multiCommand = new MultiCommand(commands);
        remoteControl.setCommand(1,multiCommand,multiCommand);

        //启动命令
        System.out.println("测试开灯关灯命令~~~~~~~~~~~");
        remoteControl.OnButtonWasPushed(0);
        remoteControl.OffButtonWasPushed(0);

        //测试撤销操作
        System.out.println("\n测试撤销操作~~~~~~~~");
        remoteControl.UndoButtonWasPushed();
        remoteControl.UndoButtonWasPushed();
        remoteControl.UndoButtonWasPushed();

        //测试命令组
        System.out.println("\n测试一组命令~~~~~~~~~");
        remoteControl.OnButtonWasPushed(1);



    }

}
