package observer;

import java.util.LinkedList;
import java.util.List;

public class ConcreteSubject implements Subject {
    private List<Observer> observerList = new LinkedList<>();

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers(Message message) {
        for (Observer observer : observerList) {
            observer.update(new Message("test_message"));
        }
    }
}
