import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet (Pet.Type.Dog, "alwyn", LocalDate.of(2007, Month.APRIL, 1),"hayden", true);
        System.out.println(pet.getAge());
        System.out.println(pet.getType());
        System.out.println(pet.isNeedsRestraint());
        System.out.println(pet.getDateOfBirth());
        System.out.println(pet.getType());
        System.out.println(pet.getName());
        System.out.println(pet.getBreed());
    }
}
