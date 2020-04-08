import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Cashbox extends Thread {

    private int cashboxId;
    private Semaphore semaphore;
    private List<Customer> queue = new ArrayList<>();

    public Cashbox() {}

    public Cashbox(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    public int getCashboxId() {
        return cashboxId;
    }

    public void setCashboxId(int cashboxId) {
        this.cashboxId = cashboxId;
    }

    public Semaphore getSemaphore() {
        return semaphore;
    }

    public void setSemaphore(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    public List<Customer> getQueue() {
        return queue;
    }

    public void setQueue(List<Customer> queue) {
        this.queue = queue;
    }

    @Override
    public String toString() {
        return "Cashbox{" +
                "id=" + cashboxId +
                ", queue=" + queue +
                '}';
    }
}
