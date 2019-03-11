package lesson3;

import lesson3.dictionary.Phonedir;

import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Map<String, Integer> hashMap = new HashMap<>();
        Phonedir phone = new Phonedir();

        String[] words = {"лоск", "пит", "моно", "пит", "молюск", "лоск", "моно", "молюск", "программирование", "кот",
                            "маша", "омар", "омар", "верти", "нефилим", "мика", "солид", "ментос", "ментос"};


        setValueForKey(words, hashMap);
        excludeDuplicates(list, hashMap);

        System.out.println("\n" + "Сколько раз повторилось слово в массиве: " + hashMap + "\n");
        System.out.println("Уникальные слова (без повторов): " + list);

        phone.put("Пуся", "89997774455");
        phone.put("Пуся", "87944546445");
        phone.put("Нуб", "98944655644");

        System.out.println("\n" + "Найдены номера по совпавшему ключу: " + phone.get("Пуся"));
    }

    private static void excludeDuplicates(ArrayList<String> list, Map<String, Integer> hashMap) {
        for (Map.Entry<String, Integer> index : hashMap.entrySet()) {
            if (index.getValue() == 1){
                list.add(index.getKey());
            }
        }
    }

    private static void setValueForKey(String[] words, Map<String, Integer> hashMap) {
        IntStream.range(0, words.length).forEach(i -> {
            if (hashMap.containsKey(words[i])) {
                hashMap.put(words[i], hashMap.get(words[i]) + 1);
            } else {
                hashMap.put(words[i], 1);
            }
        });
    }
}
