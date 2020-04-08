import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Semaphore;

//https://github.com/SergiiShapoval/EpamCourses/tree/master/src/ua/epam/sergiishapoval/homework/hw9
public class Main {
    public static void main(String[] args) {
        List<Cashbox> cashboxes = Arrays.asList(new Cashbox(new Semaphore(1)),new Cashbox(new Semaphore(1)));
        List<Customer> customers = new ArrayList<>();
        Customer customer1 = new Customer(Arrays.asList(new Product("product1")));
        Customer customer2 = new Customer(Arrays.asList(new Product("product2")));
        Customer customer3 = new Customer(Arrays.asList(new Product("product3")));
        Customer customer4 = new Customer(Arrays.asList(new Product("product4")));
        Customer customer5 = new Customer(Arrays.asList(new Product("product5")));
        Customer customer6 = new Customer(Arrays.asList(new Product("product6")));
        Customer customer7 = new Customer(Arrays.asList(new Product("product7")));
        Customer customer8 = new Customer(Arrays.asList(new Product("product8")));
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);
        customers.add(customer6);
        customers.add(customer7);
        customers.add(customer8);
/*        for (int customerIndex = 0; customerIndex < customers.size(); customerIndex++) {
            for (int cashboxNumber = 0; cashboxNumber < cashboxes.size(); cashboxNumber++) {
//                if ()
*//*            cashboxes[index].getQueue().add(new Customer(index, cashboxes[index].getSemaphore(), Arrays.asList(new Product("asd"), new Product("s"))));
            cashboxes[index].getQueue().get(0).start();*//*

            }
        }*/
        //cashboxes.get(j).size()
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {

            }
        }
    }
}
