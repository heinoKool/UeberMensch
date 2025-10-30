public class UeberMensch {
    String name;
    String lastName;
    String userName;
    String birthday;
    int strength;
    int healthPoints;

    // Add constructors here

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