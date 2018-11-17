public class Test {
    public static void main(String[] args){

        //订一杯浓缩咖啡，不添加任何调料
        Beverage beverage=new Espresso();
        System.out.println(beverage.getDescription()+" 总计："+beverage.cost());

        //将咖啡添加摩卡、牛奶、奶泡
         beverage=new Mocha(beverage);
         beverage=new Mik(beverage);
         beverage=new Whip(beverage);

        System.out.println(beverage.getDescription()+" 总计："+beverage.cost());
    }
}
