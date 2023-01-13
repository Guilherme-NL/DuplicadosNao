import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> arr1 = new ArrayList<>();
        arr1.add("Manga");
        arr1.add("Uva");
        arr1.add("Acerola");
        arr1.add("Morango");
        List<String> arr2 = new ArrayList<>();
        arr2.add("Pêra");
        arr2.add("Caju");
        arr2.add("Morango");
        arr2.add("Kiwi");
        for(int i = 0; i < arr1.size(); i++) {
            if(arr2.contains(arr1.get(i))) {
               System.out.println(arr1.get(i)); 
            }
        }
    }
}
