import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        int sizeList = -1;
        int filterNum = -1;
        logger.log("Запускаем программу");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите размер списка: ");
            sizeList = Integer.parseInt(scanner.nextLine());
            if (sizeList > 0) {
                break;
            } else {
                System.out.println("Введите корректный размер списка > 0");
            }
        }

        while (true) {
            System.out.println("Введите порог для фильтра: ");
            filterNum = Integer.parseInt(scanner.nextLine());
            if (filterNum > 0) {
                break;
            } else {
                System.out.println("Введите корректное число >= 0");
            }
        }
    }
}
