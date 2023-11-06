import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

//Creare 3 hashmap con 3 differenti metodi di inizializzazione e stampare il contenuto.

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> hashMap1 = new HashMap<>();
        hashMap1.put("Vicenza", "VI");
        hashMap1.put("Padova", "PD");
        hashMap1.put("Verona", "VR");
        System.out.println("hashMap1: " + hashMap1);


        HashMap<String, String> hashMap2 = new HashMap<>(Map.of("Vicenza", "VI", "Padova", "PD", "Verona", "VR"));
        System.out.println("hashMap2: " + hashMap2);

        HashMap<String, String> hashMap3 = new HashMap<>(Map.ofEntries(
                new AbstractMap.SimpleEntry<>("Vicenza", "VI"),
                new AbstractMap.SimpleEntry<>("Padova", "PD"),
                new AbstractMap.SimpleEntry<>("Verona", "VR")
        ));

        System.out.println("Hashmap3: " + hashMap3);
    }
}