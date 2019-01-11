package demo;

public class Test {

    public static void main(String[] args) {
        CandyMachine candyMachine = new CandyMachine(10);
        try {
            candyMachine.putCoins();
            candyMachine.turnHandle();
            System.out.println(candyMachine.toString() + "\n");
            candyMachine.putCoins();
            candyMachine.exitCoin();
            candyMachine.putCoins();
            candyMachine.turnHandle();
            System.out.println(candyMachine.toString() + "\n");
            candyMachine.putCoins();
            candyMachine.turnHandle();
            System.out.println(candyMachine.toString() + "\n");
            candyMachine.putCoins();
            candyMachine.turnHandle();
            System.out.println(candyMachine.toString() + "\n");
            candyMachine.putCoins();
            candyMachine.turnHandle();
            System.out.println(candyMachine.toString() + "\n");
            candyMachine.putCoins();
            candyMachine.turnHandle();
            System.out.println(candyMachine.toString() + "\n");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
