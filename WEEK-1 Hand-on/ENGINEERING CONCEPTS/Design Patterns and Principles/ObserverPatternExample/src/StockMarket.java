import java.util.*;

public class StockMarket implements Stock {
    private List<Observer> observers = new ArrayList<>();
    private float price;

    public void register(Observer o) { observers.add(o); }
    public void deregister(Observer o) { observers.remove(o); }
    public void notifyObservers() {
        for (Observer o : observers)
            o.update(price);
    }

    public void setPrice(float price) {
        this.price = price;
        notifyObservers();
    }
}

