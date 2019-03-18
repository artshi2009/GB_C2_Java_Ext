package lesson3.dictionary;

import java.util.Set;

public interface IMultiMap {
    void put(String key, String value);
    Set<String> get(String key);
}
