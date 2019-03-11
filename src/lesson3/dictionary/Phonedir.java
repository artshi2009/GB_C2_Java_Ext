package lesson3.dictionary;

import java.util.*;

public class Phonedir implements IMultiMap {
    private Map<String, HashSet<String>> hashMap;

    public Phonedir() {
        this.hashMap = new HashMap<>();
    }

    @Override
    public void put(String key, String value) {
        HashSet<String> numbers;
        if (hashMap.containsKey(key)) {
            numbers = hashMap.get(key);
        } else {
            numbers = new HashSet<>();
        }
        numbers.add(value);
        hashMap.put(key, numbers);
    }

    @Override
    public Set<String> get(String lastName) {
        return hashMap.get(lastName);
    }
}
