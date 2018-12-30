package e16;

public class Starship {
    private AlertStatus status = new GreenAlert();

    public void setStatus(AlertStatus alertStatus) {
        status = alertStatus;
    }

    public String toString() {
        return status.getStatus();
    }
}
