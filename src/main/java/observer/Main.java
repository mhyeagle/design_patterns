package observer;

public class Main {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        concreteSubject.registerObserver(new ConcreteObserverA());
        concreteSubject.registerObserver(new ConcreteObserverB());

        concreteSubject.notifyObservers(new Message("hello"));
    }
}
