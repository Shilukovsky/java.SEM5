import java.util.*;

public class Dz1 
{
   

    public static void main (String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Иванов", "+7 (111) 111-11-11 и +7 (222) 222-22-22");
        phoneBook.put("\nПетров", "+7 (444) 444-44-44");
        phoneBook.put("\nСидоров", "+7 (666) 666-66-66");
        System.out.println(phoneBook);
    }
}

