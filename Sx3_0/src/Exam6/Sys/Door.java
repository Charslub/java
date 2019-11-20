package Exam6.Door;

public class Door {
    public final static String DoorOpen="门已开启";
    public final static String DoorClose="门已关闭";
    private String Gate="Close";
    private boolean Ring=false;

    public String getGate() {
        return Gate;
    }

    public void setGate(String gate) {
        Gate = gate;
    }

    public boolean isRing() {
        return Ring;
    }

    public void setRing(boolean ring) {
        Ring = ring;
    }

    public Door() {
        this.setGate("Close");
    }//关闭电子门

    public void Open(){
        this.setGate("Open");
    }//开启电子门


}
