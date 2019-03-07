package lesson3.dictionary;

import java.util.*;

public class Phonedir implements IMultiMap {
    private Map<String, HashSet<String>> map;

    public Phonedir() {
        this.map = new HashMap<>();
    }

    @Override
    public void put(String key, String value) {
        HashSet<String> numbers;
        if (map.containsKey(key)) {
            numbers = map.get(key);
        } else {
            numbers = new HashSet<>();
        }
        numbers.add(value);
        map.put(key, numbers);
    }

    @Override
    public Set<String> get(String lastName) {
        return map.get(lastName);
    }
}
