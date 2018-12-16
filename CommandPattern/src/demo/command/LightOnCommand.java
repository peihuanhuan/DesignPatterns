package demo.command;

import demo.receiver.Light;

/**
 * 开灯的指令
 */

public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void executed() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
