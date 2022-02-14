import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");

        int sizeList = -1;
        int filterNum = -1;
        Scanner scanner = new Scanner(System.in);

        logger.log("Просим пользователя ввести входные данные для списка");

        while (true) {

            System.out.println("Введите размер списка: ");
            sizeList = Integer.parseInt(scanner.nextLine());
            if (sizeList > 0) {
                break;
            } else {
                logger.log("Пользователь ввел некорректный размер списка: " + sizeList);
                System.out.println("Введите корректный размер списка > 0");
            }
        }

        while (true) {
            System.out.println("Введите порог для фильтра: ");
            filterNum = Integer.parseInt(scanner.nextLine());
            if (filterNum > 0) {
                break;
            } else {
                logger.log("Пользователь ввел некорректное число для фильтра: " + filterNum);
                System.out.println("Введите корректное число >= 0");
            }
        }

        Random random = new Random();
        List<Integer> source = new ArrayList<>();

        for (int i = 0; i < sizeList; i++) {
            source.add(random.nextInt(sizeList));
        }

        logger.log("Запускаем фильтрацию");

        Filter filter = new Filter(filterNum);
        List<Integer> result =  filter.filterOut(source);

        logger.log("Выводим результат на экран");
        System.out.println("Начальный список: " + source);
        System.out.println("Отфильтрованный список: " + result);
    }
}
