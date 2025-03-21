package RevisingHashMap;

import java.util.*;

// class User {
//     int rollno;
//     String name;

//     User(int num, String name) {
//         this.rollno = rollno;
//         this.name = name;
//     }
// }

public class HashMapRevision {
    public static void main(String[] args) {

        //// basic map and its functions
        // Map<Integer, String> map = new HashMap<>();
        // map.put(1, "Piyush");
        // map.put(2, "Vijay");
        // System.out.println(map);
        // System.out.println(map.get(2));
        // System.out.println(map.containsKey(1));
        // System.out.println(map.isEmpty());
        // System.out.println(map.keySet());
        // System.out.println(map.size());

        // created custom user class and stored user object as values in hashmap
        // HashMap<Integer, User> map = new HashMap<>();
        // User u1 = new User(26, "Vijay");
        // User u2 = new User(20, "Aman");
        // map.put(100, u1);
        // map.put(200, u2);
        // System.out.println(map.get(100).name);

        // first non repeated character in a string str= "a green apple";
        String str = "A Green Apple";
        HashMap<Character, Integer> map = new HashMap<>();

        // int count[] = new int[26];
        // for (char ch : str.toCharArray()) {
        // if (!Character.isLetterOrDigit(ch))continue;
        // count[Character.toLowerCase(ch) - 'a']++;
        // }

        // for (int i = 0; i < 26; i++) {
        // if (count[i] == 1) {
        // System.out.println((char)('a'+i));
        // }
        // }

        // for (char ch : str.toCharArray()) {
        // map.put(Character.toLowerCase(ch),
        // map.getOrDefault(Character.toLowerCase(ch), 0) + 1);
        // }

        // System.out.println(map);

        // for (char ch : str.toCharArray()) {
        // if (map.get(Character.toLowerCase(ch))==1) {
        // System.out.println(ch);
        // break;
        // }
        // }

        // fir repeating character in string
        for (char ch : str.toCharArray()) {
            map.put(Character.toLowerCase(ch), map.getOrDefault(Character.toLowerCase(ch), 0) + 1);
        }
        for (char ch : str.toCharArray()) {
            if (map.get(Character.toLowerCase(ch)) > 1) {
                System.out.println(ch);
                break;
            }
        }

    }

}
