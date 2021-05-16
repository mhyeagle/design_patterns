package observer;

public class ConcreteObserverB implements Observer {
    @Override
    public void update(Message message) {
        System.out.println("concreteObserverB get " + message.getMsg());
    }
}
