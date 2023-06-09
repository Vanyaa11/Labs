package Lab07;
import java.util.HashMap;
import java.util.Map;

public class PhoneList {


    public static void main(String[] args) {
        HashMap<String, String> numbers = new HashMap<>();
        numbers.put("John", "+3512948753");
        numbers.put("Merry", "+3518388482");
        numbers.put("Vlad", "+35901002932");
        numbers.put("Hanna", "+380994459202");
        numbers.put("Kein", "+3512667392");
        numbers.put("Serhiy", "+3808388482");
        numbers.put("Merry", "+3418314882");
        numbers.put("Adda", "+53902894933");
        numbers.put("Roman", "+38099445042");
        numbers.put("Roksana", "+38099554041");

        for (String key : numbers.keySet()) {
            System.out.println(key + " - " + numbers.get(key));
        }

        System.out.println(numbers.get("Roman"));
        String surname = "Roksana";
        if (numbers.containsKey(surname)) {
            String phoneNumber = numbers.get(surname);
            System.out.println("Номер телефону " + surname + " - " + phoneNumber);
        } else {
            System.out.println("У книзі відсутній такий абонент");
        }
        numbers.remove("Adda");
        System.out.println("Кількість записів у книзі: " + numbers.size());

    }
}



