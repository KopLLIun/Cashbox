import java.util.List;
import java.util.concurrent.Semaphore;

public class Customer extends Thread {
    //numbers in queue
    private int customerId;
    private List<Product> products;
    //
    private Semaphore wait;
    private int numberCashbox;

    Customer() {}

    Customer(List<Product> products) {
        this.products = products;
    }

    Customer(int customerId, Semaphore wait, List<Product> products, int numberCashbox) {
        this.customerId = customerId;
        this.wait = wait;
        this.products = products;
        this.numberCashbox = numberCashbox;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int id) {
        this.customerId = customerId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Semaphore getWait() {
        return wait;
    }

    public void setWait(Semaphore wait) {
        this.wait = wait;
    }



    @Override
    public void run() {
        try {
            //Запрашиваем у семафора разрешение на выполнение
            wait.acquire();
            System.out.println("Customer " + (this.customerId + 1) + " in queue of " + (numberCashbox + 1) + " cashbox");
            //byu product
            sleep((int)(Math.random() * 1000));
            System.out.println("Products " + getProducts());

            System.out.println("Customer " + (this.customerId + 1) +  " bought product");
            wait.release();
        } catch (InterruptedException e) {
            System.out.println("Cashbox is closed");
        }
    }

}
