import java.util.*;
/*Напишите код, с помощью которого можно напечатать только нечетные числа в консоль.
        Код должен работать с любой последовательностью и объемом списка чисел.
        В качестве отладочной информации можете использовать список чисел

        Напишите код, с помощью которого можно напечатать только четные числа без повторений в порядке возрастания.
Код должен работать с любой последовательностью и объемом списка чисел.
В качестве отладочной информации можете использовать список чисел

 */

public class Main {
    static int a;
    public static void outputOfEvenNumbers(List<Integer> numbers){ // выводит нечетные числа в консоль
        Integer x = 0;
        for (int i = 0; i < numbers.size(); i++) {
           x = numbers.get(i);
           if (x % 2 != 0){
               System.out.print(x + " ,");
           }
        }
    }

 //   }



    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(99,88, 1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        outputOfEvenNumbers(nums);
        System.out.println();
        Collections.sort(nums);
        for (int i = 0; i < nums.size(); i++) {
        }
            Set<Integer>set = new LinkedHashSet<>(nums);
            System.out.println(set);
        List<String> words = new ArrayList<>(Arrays.asList("ФФ","АА","DD","DD","SS","АА"));
        System.out.println(words);
        Set<String>set2 = new LinkedHashSet<>(words);
        System.out.println(set2);

        Set<String>set3 = new LinkedHashSet<>(words);
        System.out.println(words.size() - set2.size());

            }

        }







