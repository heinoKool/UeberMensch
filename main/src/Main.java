public class Main {
    public static void main(String[] args) {

        UeberMensch max = new UeberMensch();
        max.name = "Max";
        max.lastName = "Mixer";
        max.userName = "MaMi";
        max.birthday = "12.12.22";
        max.strength = 20;
        max.healthPoints = 80;
        UeberMensch moritz = new UeberMensch();
        moritz.name = "Moritz";
        moritz.lastName = "Lichter";
        moritz.userName = "Moe";
        moritz.birthday = "11.11.11";
        moritz.strength = 60;
        moritz.healthPoints = 40;

        max.showProfile();
        moritz.showProfile();

        max.smashing(moritz);

        max.showProfile();
        moritz.showProfile();
    }
}
