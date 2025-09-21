interface Laptop { // интерфейс для ноутбуков
    void run(); // метод запуска
}
class MacBook implements Laptop { // макбук класс
    public void run() {
        System.out.println("Running macOS on MacBook");
    }
}
class GalaxyBook implements Laptop { // галакси бук класс
    public void run() {
        System.out.println("Running Windows on GalaxyBook");
    }
}
interface TechFactory { // общий интерфейс для фабрик (телефон + ноут)
    Phone createPhone();  // создаем тел
    Laptop createLaptop(); // создаем ноут
}
class AppleFactory implements TechFactory { // фабрика яблок
    public Phone createPhone() {
        return new IPhone(); // делаем айфон
    }
    public Laptop createLaptop() {
        return new MacBook(); // делаем макбук
    }
}
class SamsungFactory implements TechFactory { // фабрика самсунгов
    public Phone createPhone() {
        return new SamsungPhone(); // делаем самсунг
    }
    public Laptop createLaptop() {
        return new GalaxyBook(); // делаем галакси бук
    }
}
