import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> people = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);

            Person person = new Person(name,age);
            people.add(person);
        }
        people.stream().filter(p -> p.getAge() > 30).forEach( p -> System.out.printf("%s -> %d%n",p.getName(), p.getAge()));

    }
}
