package demo.status;

import demo.CandyMachine;

public class NoCoinStatus extends Status {

    private CandyMachine candyMachine;

    public NoCoinStatus(CandyMachine candyMachine) {
        this.candyMachine = candyMachine;
    }

    //没有硬币时，投入硬币会变成 有硬币的状态
    @Override
    public void putCoins() {
        candyMachine.setNowStatus(candyMachine.getHasCoinStatus());
        System.out.println("有个傻瓜往糖果机里投入了一枚硬币...");
    }


}
