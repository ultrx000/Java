package work1;
import java.util.*;

public class Myarray {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите длинну масива");


        int[] Array = new int[input.nextInt()];

        Random random = new Random();

        for (int i = 0; i < Array.length; i++) {

            Array[i] = random.nextInt(100);

        }
        System.out.println("Заполняем массив случайными числами");
        System.out.println(Arrays.toString(Array));
        Peak(Array);
    }

    private static void Peak(int[] Array) {
        int number = -1;
        System.out.println("Выберите, что нужно сделать с массивом:");
        System.out.println("1 - Поиск элемента.");
        System.out.println("2 - Удаление элемента.");
        System.out.println("3 - Добавление элемента.");
        System.out.println("4 - Выйти из программы.");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        switch (number) {
            case 4:
               System.out.println("До свидания!");
                break;
            case 1:
                Search_in_array(Array);
            case 2:
                deleted(Array);
            case 3:
                added(Array);
            default:
                System.out.println("Ошибка ввода. Пожалуйста, введите цифру 1, 2 или 3 и повторите попытку.");
        }
    }


    public static int Search_in_array(int[] array) {
        System.out.println("Введите элемент массива для поиска");
        int search = input.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (search == array[i]) {
                System.out.println("Элемент найден, его номер - " + ++i);
                Peak(array);
                return i;
            }

        }
        System.out.println("Элемент не найден");
        Peak(array);
    return -1;
    }
    public static int deleted(int[] array) {
        System.out.println("Выберите число для удаления");
        int[] newarray = new int[array.length];
        int removenum = 0;
        int numberdelete = input.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (numberdelete != array[i]) {
                newarray[i - removenum] = array[i];

            } else {
                removenum++;
            }
        }
        System.out.println(Arrays.toString(newarray));
        Peak(array);
        return removenum;
    }
    public static int added(int[] array) {
        System.out.println("Введите число которое хотите вставить");
        int add = input.nextInt();
        int[] newarray = new int[array.length];
        System.out.println("Выберите число вставки");
        int numberadd = input.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (numberadd == array[i]) {
                array[i]=newarray[i];
                newarray[i] = add;

            } else {
                newarray[i]=array[i];
            }
        }
        System.out.println(Arrays.toString(newarray));
        Peak(array);
        return 0;

    }
}


