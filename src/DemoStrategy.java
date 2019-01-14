import Director.Director;
import builders.CarBuilder;
import builders.CarManualBuilder;
import cars.Car;
import cars.Manual;

public class DemoStrategy {
    public static void main(String[] args) {

        // Директор получает объект конкретного строителя от клиента
        // (приложения). Приложение само знает какой строитель использовать,
        // чтобы получить нужный продукт.
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();

        director.constructSportsCar(carBuilder);

        // Директор получает объект конкретного строителя от клиента
        // (приложения). Приложение само знает какой строитель использовать,
        // чтобы получить нужный продукт.
        Car car = carBuilder.getResult();

        System.out.println("Car built:\\n" + car.getType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Директор может знать больше одного рецепта строительства.

        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}

