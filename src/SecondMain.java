import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondMain {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        String result = intList.stream()
                .filter(x -> x > 0)                 // Только положительные
                .filter(x -> x % 2 == 0)            // Выборка чётных
                .sorted(Comparator.naturalOrder())         // По возрастанию
                .map(String::valueOf)                      // Преобразуем числа в строку
                .collect(Collectors.joining(" "));// Добавим разделитель, при
                                                          // необходимости можем изменить легко
        // Немного изменил метод для более красивого вывода не в столбик а в строку
        // Если в старом .forEach(System.out::println); сделать print то вывод будет
        // в одну сполшную стороку без разделителя
        System.out.println(result);
    }
}

