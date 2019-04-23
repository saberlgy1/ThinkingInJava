package charpterEight;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-15 11:24
 **/

class AlertStatus {
    public void alert() {}
}

class NormalAlert extends AlertStatus {
    public void alert() { System.out.println("AlertStatus Normal"); }
}

class HighAlert extends AlertStatus {
    public void alert() { System.out.println("AlertStatus High"); }
}

class MaximumAlert extends AlertStatus {
    public void alert() { System.out.println("AlertStatus Maximum"); }
}

class Starship {
    private AlertStatus alertStatus = new NormalAlert();
    public void normalAlert() { alertStatus = new NormalAlert(); }
    public void highAlert() { alertStatus = new HighAlert(); }
    public void maximumAlert() { alertStatus = new MaximumAlert(); }
    public void checkAlertStatus() { alertStatus.alert(); }
}

public class Transmogrify {
    public static void main(String[] args) {
        Starship ss = new Starship();
        ss.checkAlertStatus();
        ss.highAlert();
        ss.checkAlertStatus();
        ss.maximumAlert();
        ss.checkAlertStatus();
        ss.normalAlert();
        ss.checkAlertStatus();
    }
}
