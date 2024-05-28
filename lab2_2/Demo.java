// Основной класс для запуска программы
public class Demo {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Component decoratedComponent = new ConcreteDecorator(component);

        component.operation();
        System.out.println("-----");
        decoratedComponent.operation();
    }
}