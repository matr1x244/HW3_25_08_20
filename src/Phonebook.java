import java.util.HashMap;
import java.util.HashSet;

public class Phonebook {

    HashMap<String, HashSet<String>> bk;

    public Phonebook() {
        this.bk = new HashMap<>();
    }

    public void addContact(String name, String surname, String phone) {
        HashSet<String> book = bk.getOrDefault(surname, new HashSet<>());
        book.add(phone);
        bk.put(surname, book);
    }


    public void getFind(String surname) {
        System.out.println("Контакт: " + surname + ": номер телефона " + bk.getOrDefault(surname, new HashSet<>()));
        }

    }
