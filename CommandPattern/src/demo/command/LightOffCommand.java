package demo.command;

import demo.receiver.Light;

/**
 * 关灯的指令
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void executed() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
