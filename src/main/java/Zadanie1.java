import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 4 ciagi: ");
        List<String> strings = new ArrayList<>();

        for (int i=0; i < 4; i++){
            strings.add(scanner.nextLine());
        }

        System.out.println(strings);
        strings.sort((a, b) -> b.length() - a.length());
        System.out.println(strings);
    }
}
