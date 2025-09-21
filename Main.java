public class Main {
    public static void main(String[] args) {
        // обычная фабрика (только телефоны)
        Phone myPhone = PhoneFactory.createPhone("iPhone"); // создаем айфон
        myPhone.call(); // звоним

        Phone mySamsung = PhoneFactory.createPhone("Samsung"); // создаем самсунг
        mySamsung.call(); // звоним

        // абстрактная фабрика (телефон + ноут)
        TechFactory appleFactory = new AppleFactory(); // берем фабрику apple
        Phone applePhone = appleFactory.createPhone(); // создаем айфон
        Laptop appleLaptop = appleFactory.createLaptop(); // создаем макбук
        applePhone.call(); // юзаем айфон
        appleLaptop.run(); // юзаем макбук

        TechFactory samsungFactory = new SamsungFactory(); // берем фабрику samsung
        Phone samsungPhone = samsungFactory.createPhone(); // создаем самсунг
        Laptop samsungLaptop = samsungFactory.createLaptop(); // создаем ноут
        samsungPhone.call(); // звоним с самсунга
        samsungLaptop.run(); // запускаем ноут
    }
}
