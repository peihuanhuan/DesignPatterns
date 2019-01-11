package demo.status;

import demo.CandyMachine;

public class HasCoinStatus extends Status {

    private CandyMachine candyMachine;

    public HasCoinStatus(CandyMachine candyMachine) {
        this.candyMachine = candyMachine;
    }


    //退出硬币
    @Override
    public void exitCoin() {
        candyMachine.setNowStatus(candyMachine.getNoCoinStatus());
        System.out.println("有个傻瓜退钱了，糖果机中掉落了一枚硬币...");
    }

    //转动手杆
    @Override
    public void turnHandle() {
        candyMachine.setNowStatus(candyMachine.getSoldStatus());
        System.out.println("有个傻瓜转动了糖果机的手杆");
    }
}
