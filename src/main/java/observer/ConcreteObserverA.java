package observer;

public class ConcreteObserverA implements Observer {
    @Override
    public void update(Message message) {
        System.out.println("concreteObserverA get " + message.getMsg());
    }
}
