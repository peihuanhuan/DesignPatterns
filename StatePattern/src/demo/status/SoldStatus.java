package demo.status;

import demo.CandyMachine;

public class SoldStatus extends Status {

    private CandyMachine candyMachine;

    public SoldStatus(CandyMachine candyMachine) {
        this.candyMachine = candyMachine;
    }

    //发放糖果
    @Override
    public void dispense() {
        candyMachine.releaseBall();

        if (candyMachine.getCount() > 0) {
            //还有糖果
            candyMachine.setNowStatus(candyMachine.getNoCoinStatus());
        } else {
            //没有糖果
            candyMachine.setNowStatus(candyMachine.getSoldOutStatus());
        }
    }
}
