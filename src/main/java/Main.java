import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getInstance();
        logger.log("Здравствуйте!");
        logger.log("Введите пожалуйста размер списка");
        int N = 0;
        try {
            N = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Введены нечисловые данные!");
        }
        logger.log("Введите пожалуйста верхнюю границу значений элементов в списке");
        int M = 0;
        try {
            M = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Введены нечисловые данные!");
        }
        List<Integer> source = logger.add(N, M);
        logger.log("Создаём и наполняем список. Вот случайный список: " + source);
        logger.log("Введите порог для фильтра: ");
        int F = scanner.nextInt();
        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(F);
        filter.filterOut(source);
        logger.log("Завершаем программу");
    }
}