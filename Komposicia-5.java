// Класс Engine (Двигатель)
class Engine {
    int horsePower;  // Мощность двигателя
    String type;     // Тип двигателя

    // Конструктор для создания двигателя
    public Engine(int horsePower, String type) {
        this.horsePower = horsePower;
        this.type = type;
    }

    // Метод для получения мощности двигателя
    public int getHorsePower() {
        return horsePower;
    }

    // Метод для получения типа двигателя
    public String getType() {
        return type;
    }
}

// Класс Car (Машина)
class Car {
    Engine engine;

    // Конструктор машины, который создает двигатель
    public Car(int horsePower, String type) {
        this.engine = new Engine(horsePower, type);
    }

    // Метод для запуска машины, который выводит мощность двигателя
    public void start() {
        System.out.println("Машина с двигателем типа " + engine.getType() + " c мощностью " + engine.getHorsePower() + "л.с. запущена.");
    }
}
public class Main {
    public static void main(String[] args) {
        // Создаем машину с двигателем (мощность 150,бензиновый двигатель)
        Car car = new Car(150, "Бензиновый");

        // Запуск машины
        car.start();  // Вывод информации о запуске машины и мощность двигателя
    }
}
