package demo;

public class Test {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Tea tea = new Tea();

        System.out.println("\n~~~~~~~~~~准备制咖啡~~~~~~~~~~~~");
        coffee.prepareRecipe();
        System.out.println("\n~~~~~~~~~~准备制作茶~~~~~~~~~~~~");
        tea.prepareRecipe();
    }
}
