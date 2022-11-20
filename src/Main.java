import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 3;
        int z = 150;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt(); //Вводим с клавиатуры размер массива
        int [] array = new int[size]; //Создаем массив int с размером size
        System.out.println("Введите данные массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt(); //Заполняем массив с клавиатуры
        }
        for (int i = 0; i < size; i++) {
            if (array[i] == x | array[i] == y | array[i] == z) {
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }
    }
}