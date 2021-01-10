import java.util.HashMap;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {
        Map <String, String> cityFamily= new HashMap<>();
        cityFamily.put("Москва", "Ивановы");
        cityFamily.put("Киев", "Петровы");
        cityFamily.put("Лондон", "Абрамовичи");

        System.out.println(cityFamily.get("Лондон"));
    }
}
