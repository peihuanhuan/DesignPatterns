package demo.status;

public class Status {

    //投入硬币
    public void putCoins() throws Exception {
        throw new Exception("现在不能投入硬币");
    }
    //退出硬币
    public void exitCoin() throws Exception {
        throw new Exception("现在不能退出硬币");
    }
    //转动手杆
    public void turnHandle() throws Exception {
        throw new Exception("现在不能转动手杆");
    }
    //分发糖果
    public void dispense() throws Exception {
        throw new Exception("现在不能分发糖果");
    }

    //下面两个是我自己一开始写的，是错误的 ，应该是上面的方法
    //卖出去了
//    public void solded() throws Exception {
//        throw new Exception("不能做这事");
//    }
    //已售光
//    public void soldOut() throws Exception {
//        throw new Exception("不能做这事");
//    }

}
