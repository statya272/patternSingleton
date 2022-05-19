import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        int maxVal;
        int f;
        Random random = new Random();
        List<Integer> mainList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        while (true) {
            try {
                System.out.println("Введите размер списка: ");
                size = Integer.parseInt(scanner.nextLine());
                if (size < 1) {
                    logger.log("Введен некорректный размер списка");
                    continue;
                }
                System.out.println("Введите верхнюю границу для значений: ");
                maxVal = Integer.parseInt(scanner.nextLine());
                if (size < 1) {
                    logger.log("Введено некорректное значение границы");
                    continue;
                }
                break;
            } catch (Exception e) {
                logger.log("Ошибка ввода данных");
                continue;
            }
        }
        logger.log("Создаём и наполняем список");
        for (int i = 0; i < size; i++) {
            mainList.add(random.nextInt(maxVal));
        }
        logger.log("Список случайных чисел:");
        System.out.println(mainList);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра: ");
        f = scanner.nextInt();
        Filter filter = new Filter(f);
        System.out.println("Отфильтрованный список: " + filter.filterOut(mainList));
        logger.log("Завершаем программу");

    }
}
