package Exam1;

/**
 *
 * @author Administrator
 */
public class Mobliephone extends Telephone{

    public Mobliephone(String brand, String Number) {
        super(brand, Number);
    }
    private String network;
    private double CalledTime;

    public Mobliephone(String network, String brand, String Number) {
        super(brand, Number);
        this.network = network;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public double getCalledTime() {
        return CalledTime;
    }

    public void setCalledTime(double CalledTime) {
        this.CalledTime = CalledTime;
    }

    @Override
    public double Callcost() {
        double reslut;
        reslut=(super.getTime()+CalledTime/2)*super.getPrice();
        return reslut;
    }

    @Override
    public void display() {
        System.out.println("Brand:"+super.getBrand());
        System.out.println("Number:"+super.getNumber());
        System.out.println("Time:"+super.getTime());
        System.out.println("Network:"+this.getNetwork());
        System.out.println("CalledTime:"+this.getCalledTime());
        System.out.println("The total price is："+this.Callcost());
    }
}