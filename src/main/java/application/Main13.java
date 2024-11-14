package application;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main13 {
    public static void main(String[] args) {
        Map<String, String> cookies = new HashMap<>();

        cookies.put("username", "John");
        cookies.put("email", "j@email.com");
        cookies.put("phone", "99711122");

        cookies.remove("email");
        cookies.put("phone", "997110000");

        System.out.println("Contains 'phone': " + cookies.containsKey("phone"));
        System.out.println("Email: " + cookies.get("email"));

        System.out.println("ALL COOKIES");

        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
