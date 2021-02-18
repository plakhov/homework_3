import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
//        firstTask();
//        secondTask();
        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE_TIME.toString());
    }

    private static void secondTask() {
        Phonebook phonebook = new Phonebook();
        phonebook.add("asdas", "23423");
        phonebook.add("asdas", "23423435345");
        phonebook.add("asdasafsdg", "2342343534523");
        phonebook.add("dbgbd", "2342343534523");
        phonebook.add("eygu", "2342343534523");
        phonebook.add("fjdgyer", "2342343534523");
        phonebook.add("asdas", "23423435345");
        phonebook.add("eygu", "2342343534523");

        System.out.println("Print zero phoneNumber");
        System.out.println(phonebook.get("44444"));
        System.out.println("Print some phoneNumbers");
        System.out.println(phonebook.get("asdas"));
    }

    private static void firstTask() {
        List<String> array = new ArrayList<>();
        array.add("asdasdsa");
        array.add("asdasdsa");
        array.add("sdf");
        array.add("sdfafsd");
        array.add("sdfafsdsdvf");
        array.add("sdfafsdsdvfewre");
        array.add("sdfafsdsdvfewre");
        array.add("sdfafsdsdvfewre");
        array.add("sdfafsdsdvfewre232");
        array.add("sdxcvcxvxc");
        array.add("sdxcvcxvxccvxcxd");
        array.add("sdxcvcxvxccvxcxdawew");
        array.add("sdxcvcxvxccvxcxdawew");
        array.add("sdxcvcxvxccvxcxdawew");
        array.add("jlkjhhbk");
        array.add("2364trgywue");
        array.add("2364trgywueghdfi");
        array.add("2364trgywueghdfiskjhdgfygjr");
        array.add("2364trgywueghdfiskjhdgfygjrsgjkhdfk");


        System.out.println("All words+++++++++++++++++++++");
        printArray(array);
        System.out.println("Unique words++++++++++++++++++");
        printArray(uniqueWords(array));
        System.out.println("Quantity unique words++++++++++++++++++");
        for (Map.Entry<String, Integer> entry : quantityRepeatWord(array).entrySet()) {
            System.out.println("Word: "+ entry.getKey()+" quantity: "+entry.getValue());
        }
    }

    public static Collection<String> uniqueWords(Collection<String> words) {
        return new LinkedHashSet<>(words);
    }

    public static void printArray(Collection<String> words) {
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static Map<String, Integer> quantityRepeatWord(Collection<String> words){
        Map<String, Integer> result = new HashMap<>();
        for (String word : words) {
            result.computeIfPresent(word, (key, value) -> ++value);
            result.putIfAbsent(word, 1);
        }
        return result;
    }
}
