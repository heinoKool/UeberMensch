public class UeberMensch {
    String name;
    String lastName;
    String userName;
    String birthday;
    int strength;
    int healthPoints;

    // Add constructors here
    // Default constructor (automatisch vorhanden)
    // verschwindet, wenn andere Konstuktoren hinzugefügt werden
    UeberMensch() {
    }

    // Aufgabe 1
    // this keyword für Zugriff auf Instanz-/Objekt-Variablen
    UeberMensch(String name, String lastName, String userName, String birthday, int strength, int healthPoints) {
        this.name = name;
        this.lastName = lastName;
        this.userName = userName;
        this.birthday = birthday;
        this.strength = strength;
        this.healthPoints = healthPoints;
    }

    // Aufgabe 2
    // `this` keyword für Zugriff auf Instanz-/Objekt-Variablen
    UeberMensch(String name, String lastName, String userName, String birthday) {
        this.name = name;
        this.lastName = lastName;
        this.userName = userName;
        this.birthday = birthday;
        this.strength = 50;
        this.healthPoints = 50;
    }

    // Parameter können vertauscht werden, falls Reihenfolge der datentypen sich ändert
    UeberMensch(int strength, int healthPoints, String name, String lastName, String userName, String birthday) {
        this.name = name;
        this.lastName = lastName;
        this.userName = userName;
        this.birthday = birthday;
        this.strength = 50;
        this.healthPoints = 50;
    }

    public String getName() {
        return name;
    }
    void shout() {
        System.out.println("Hello I am " + userName + " an UeberMensch");
    }

    void jump() {
        System.out.println(name + " is jumping around");
    }

    void smashing(UeberMensch enemy) {
        System.out.println(userName + " is smashing " + enemy.userName);
        enemy.healthPoints--;
    }

    void showProfile() {
        System.out.println("=== UeberMensch Profile ===");
        System.out.println("Name: " + name + " " + lastName);
        System.out.println("Username: " + userName);
        System.out.println("Birthday: " + birthday);
        System.out.println("Strength: " + strength);
        System.out.println("Health: " + healthPoints);
        System.out.println("============================");
    }
}