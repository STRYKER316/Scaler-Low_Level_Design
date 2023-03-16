package designPatterns.prototype;

import java.util.HashMap;
import java.util.Map;

// consider making the registry class a singleton
public class StudentRegistry {
    Map<String, Student> registryMap = new HashMap<>();

//    register a student prototype
    public void registerPrototype(String key, Student student) {
        registryMap.put(key, student);
    }

//    get the requested prototype
    public Student getPrototype(String key) {
        return registryMap.get(key);
    }
}

