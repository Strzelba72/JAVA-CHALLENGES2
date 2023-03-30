public class HealthyBurger extends Hamburger{

    public HealthyBurger(String meat, double price) {
        super("HealthyBurger", meat, price, "Brown rye roll");
    }

    private String healthyExtra1Name,healthyExtra2Name;
    private double healthyExtra2Price, healthyExtra1Price;

    public void addHealthyAddition1(String healthyExtra1Name,double healthyExtra1Price)
    {
        this.healthyExtra1Price=healthyExtra1Price;
        this.healthyExtra1Name=healthyExtra1Name;
    }
    public void addHealthyAddition2(String healthyExtra2Name,double healthyExtra2Price)
    {
        this.healthyExtra2Price=healthyExtra2Price;
        this.healthyExtra2Name=healthyExtra2Name;
    }
    @Override
    public double itemizeHamburger() {
        return healthyExtra1Price+healthyExtra2Price+super.itemizeHamburger();
    }
}
