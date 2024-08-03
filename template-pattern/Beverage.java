
public abstract class Beverage {
    protected abstract void brew();

    protected abstract void addCondiments();

    public void boilWater() {
        System.out.println("boiling water");
    }

    public void pourInCup() {
        System.out.println("pouring into cup");
    }

    public void makeBeverage() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
}
