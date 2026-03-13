public class Animal {
    private String animalName;
    private String ownerName;
    private int age;

    public Animal(String animalName, String ownerName, int age) {
        this.animalName = animalName;
        this.ownerName = ownerName;
        setAge(age);
    }

    public String getAnimalName() { return animalName; }
    public String getOwnerName() { return ownerName; }
    public int getAge() { return age; }

    public void setAnimalName(String animalName) { this.animalName = animalName; }
    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }
    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative: " + age);
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + animalName + ", Owner: " + ownerName + ", Age: " + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal other = (Animal) obj;
        return age == other.age &&
               animalName.equals(other.animalName) &&
               ownerName.equals(other.ownerName);
    }
}