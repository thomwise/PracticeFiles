public class Main {

    public static void main(String[] args) {
        Faculty dumbledore = new Faculty();
        dumbledore.name = "Dumbledore";
        Faculty snape = new Faculty();
        snape.name = "Snape";


        Section potions = new Section("POT 420", "Spring 2019", "MWF 10:30AM");
        Section defense = new Section("DADA 101",
                "Spring 2019", "TTH 9:00AM");
        Student a = new Student("Harry Potter", "Auroring");
        Student b = new Student("Hermione Granger", "Potions");
        Student c = new Student("Ron Weasley", "Undecided");
        Student d = new Student("Draco Malfoy", "Death Eating");

        potions.setInstructor(snape);
        defense.setInstructor(dumbledore);

        a.enroll(defense);
        b.enroll(defense);
        c.enroll(defense);
        d.enroll(defense);
        d.enroll(potions);
        b.enroll(potions);

        System.out.println(b.toString());
    }
}
