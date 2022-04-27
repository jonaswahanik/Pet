import java.time.LocalDate;

public class Pet {
    Type type;
    String breed;
    LocalDate dateOfBirth;
    String name;
    boolean needsRestraint;

    public enum Type {
        Dog,
        Cat,
        Chicken
    }
    public Pet(Pet.Type type, String breed, LocalDate dateOfBirth, String name, boolean needsRestraint) {
        this.type = type;
        this.breed = breed;
        this.dateOfBirth = dateOfBirth;
        this.name = name;
        this.needsRestraint = needsRestraint;
    }

    public Pet.Type getType() {
        return type;
    }

    public void setType(Pet.Type type) {
        this.type = type;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNeedsRestraint() {
        if (getAge() >= 13) {
            return false;
        }
        return needsRestraint;
    }

    public void setNeedsRestraint(boolean needsRestraint) {
        this.needsRestraint = needsRestraint;
    }

    public int getAge() {
        if (LocalDate.now().getMonthValue() - dateOfBirth.getMonthValue() >= 0) {
            return (LocalDate.now().getYear() - dateOfBirth.getYear());
        }
        return (LocalDate.now().getYear() - dateOfBirth.getYear()) - 1;

    }
}
