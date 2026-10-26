import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FirstMain {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> resultList = new ArrayList<>();

        //Фильтруем положительные числа
        for (Integer x : intList) {
            if (x > 0) {
                resultList.add(x);
            }
        }

        //Оставляем только чётные
        List<Integer> evenList = new ArrayList<>();
        for (Integer x : resultList) {
            if (x % 2 == 0) {
                evenList.add(x);
            }
        }

        //Сортировка по возрастанию
        Collections.sort(evenList);

        //Выводим результат
        for (Integer x : evenList) {
            System.out.print(x + " ");
        }
    }
}
