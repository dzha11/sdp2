interface Phone { // интерфейс для всех телефонов
    void call(); // метод для звонка
}
class IPhone implements Phone {// айфон класс
    public void call() {
        System.out.println("Calling from iPhone");
    }
}
class SamsungPhone implements Phone { // самсунг класс
    public void call() {
        System.out.println("Calling from Samsung Galaxy");
    }
}
class PhoneFactory { // фабрика для телефонов
    public static Phone createPhone(String type) {
        return switch (type.toLowerCase()) {         // смотрим че попросили
            case "iphone" -> new IPhone(); // если айфон
            case "samsung" -> new SamsungPhone(); // если самсунг
            default -> throw new IllegalArgumentException("Unknown phone type: " + type); // если фигня
        };
    }
}
