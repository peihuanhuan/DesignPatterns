package demo.status;

import demo.CandyMachine;

public class SoldOutStatus extends Status {

    private CandyMachine candyMachine;

    public SoldOutStatus(CandyMachine candyMachine) {
        this.candyMachine = candyMachine;
    }
}
