// Реализуйте структуру телефонной книги с помощью HashMap, 
// учитывая, что 1 человек может иметь несколько телефонов.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class dz5_1 {
    public static void main(String[] args) {
        Map<Integer, ArrayList<String>> phoneBook = new HashMap<Integer, ArrayList<String>>();
        Map<Integer, String> nameBook = new HashMap<Integer, String>();
        nameBook.put(0, "Иванов А.А.");
        nameBook.put(1, "Петров С.А.");
        nameBook.put(2, "Иванов А.Ю.");
        nameBook.put(3, "Сидоров А.К.");
        for (int i=0;i< nameBook.size();i++){
        if (phoneBook.get(i)==null){
            phoneBook.put(i, new ArrayList<String>()); 
            phoneBook.get(i).add("8-912-565-00-"+i+i+"; "+"8-922-102-01-"+i+i);
        }
        System.out.println("Телефонные номера"+" "+nameBook.get(i)+" :"+phoneBook.get(i));
        
        }
               
    }
}