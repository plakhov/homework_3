import java.util.*;

public class Phonebook {

    private Map<String, List<String>> phonebook = new HashMap<>();

    public void add(String lastName, String phoneNumber){
        phonebook.computeIfPresent(lastName, (k, v) -> {
            v.add(phoneNumber);
            return v;
        });
        phonebook.putIfAbsent(lastName, new ArrayList<>(Collections.singletonList(phoneNumber)));
    }

    public List<String> get(String lastName){
        return phonebook.getOrDefault(lastName, Collections.emptyList());
    }
}
