public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Command turnOn = new LightOnCommand(light);
        Command turnOff = new LightOffCommand(light);

        RemoteControl remote = new RemoteControl();

        // Устанавливаем команду включения света и выполняем ее
        remote.setCommand(turnOn);
        remote.pressButton();

        // Устанавливаем команду выключения света и выполняем ее
        remote.setCommand(turnOff);
        remote.pressButton();
    }
}