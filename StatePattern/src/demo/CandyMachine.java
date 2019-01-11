package demo;

import demo.status.HasCoinStatus;
import demo.status.NoCoinStatus;
import demo.status.SoldOutStatus;
import demo.status.SoldStatus;
import demo.status.Status;

/**
 * 糖果机
 */
public class CandyMachine {
    private Status noCoinStatus;
    private Status hasCoinStatus;
    private Status soldStatus;
    private Status soldOutStatus;

    //当前状态
    private Status nowStatus;
    //剩余糖果数
    private int count;

    public CandyMachine(int count) {

        noCoinStatus = new NoCoinStatus(this);
        hasCoinStatus = new HasCoinStatus(this);
        soldStatus = new SoldStatus(this);
        soldOutStatus = new SoldOutStatus(this);

        this.count = count;
        if (count > 0) {
            nowStatus = noCoinStatus;
        } else {
            nowStatus = soldOutStatus;
        }
    }

    //发放糖果
    public void releaseBall() {
        if (count > 0) {
            System.out.println("糖果机中掉落了一粒糖果...");
            count--;
        }
    }

    //投入硬币
    public void putCoins() throws Exception {
        nowStatus.putCoins();
    }
    //退出硬币
    public void exitCoin() throws Exception {
        nowStatus.exitCoin();
    }
    //转动手杆
    public void turnHandle() throws Exception {
        nowStatus.turnHandle();
        nowStatus.dispense();
    }


    public void setNowStatus(Status nowStatus) {
        this.nowStatus = nowStatus;
    }


    public Status getNoCoinStatus() {
        return noCoinStatus;
    }

    public Status getHasCoinStatus() {
        return hasCoinStatus;
    }

    public Status getSoldStatus() {
        return soldStatus;
    }

    public Status getSoldOutStatus() {
        return soldOutStatus;
    }

    public int getCount() {
        return count;
    }

    public void setSoldStatus(Status soldStatus) {
        this.soldStatus = soldStatus;
    }

    @Override
    public String toString() {
        return "当前状态：" + nowStatus.getClass().getSimpleName() + "  糖果数量：" + count;
    }
}
