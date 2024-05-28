// Main.java
public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver("Наблюдатель 1");
        Observer observer2 = new ConcreteObserver("Наблюдатель 2");

        subject.registerObserver(observer1);
        subject.registerObserver(observer2);

        subject.notifyObservers("Новое сообщение для всех наблюдателей!");
    }
}