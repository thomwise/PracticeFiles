import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Database database = new Database(2019);

    public static void main(String[] args) {

        studentMenu();


    }

    private static void studentMenu() {
        boolean quit = false;
        printActions();
        while (!quit) {
            System.out.println("\nEnter action: (8 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nExiting program...");
                    quit = true;
                    break;
                case 1:
                    database.printStudents();
                    break;
                case 2:
                    addNewStudent();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    removeStudent();
                    break;
                case 5:
                    queryStudent();
                    break;
                case 6:
                    enrollStudent();
                    break;
                case 7:
                    administratorMenu();
                    break;
                case 8:
                    printActions();
                    break;
            }
        }
    }

    private static void administratorMenu() {

        boolean quit = false;
        printAdminActions();
        while(!quit) {
            System.out.println("\nEnter Action: ");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 1:
                    addCourse();
                    break;
                case 2:
                    modifyCourse();
                    break;
                case 3:
                    removeCourse();
                    break;
                case 4:
                    displayRoster();
                    break;
                case 5:
                    quit = true;
                    break;
            }
        }
    }

    private static void displayRoster() {
        System.out.println("Enter course title to display roster: ");
        String title = scanner.nextLine();
        Section existingCourse = database.queryCourse(title);
        if(existingCourse == null) {
            System.out.println("Course not found");
            return;
        } else if(existingCourse.getRoster() == null) {
            System.out.println("No students registered for course.");
        }
            System.out.println(existingCourse.getRoster());
    }

    private static void addCourse() {
        System.out.println("Enter course title: ");
        String title = scanner.nextLine();
        System.out.println("Enter course term: ");
        String term = scanner.nextLine();
        System.out.println("Enter meeting days and times: \n" +
                            "(Format: MWF 8:00AM");
        String meetingDaysAndTimes = scanner.nextLine();
        Section newCourse = Section.createCourse(title, term, meetingDaysAndTimes);
        if(database.addNewCourse(newCourse)) {
            System.out.println( "New course added:\n" +
                                "Title: " + title +
                                "\nSection ID: " + newCourse.getId() +
                                "\nTerm: " + term +
                                "\nMeeting Days/Time: " + meetingDaysAndTimes);
        }
    }

    private static void modifyCourse() {
        System.out.println("Enter existing course title: ");
        String title = scanner.nextLine();
        Section existingCourse = database.queryCourse(title);
        if(existingCourse == null) {
            System.out.println("Course not found");
            return;
        }

        System.out.println("Change course title to: ");
        String newTitle = scanner.nextLine();
        System.out.println("Change term to: ");
        String newTerm = scanner.nextLine();
        System.out.println("Change meeting days and times to: ");
        String newMeetingDaysAndTimes = scanner.nextLine();
        Section modifiedCourse = Section.createCourse(newTitle, newTerm, newMeetingDaysAndTimes);
        if(database.updateCourse(existingCourse, modifiedCourse)) {
            System.out.println("Successfully updated " + newTitle);
        }

    }

    private static void removeCourse() {
        System.out.println("Enter existing course name: ");
        String name = scanner.nextLine();
        Section existingCourse = database.queryCourse(name);
        if(existingCourse == null) {
            System.out.println("Course not found.");
            return;
        }

        if(database.removeCourse(existingCourse)) {
            System.out.println(existingCourse + " successfully deleted.");
        } else {
            System.out.println("Error deleting course.");
        }
    }

    private static void addNewStudent() {
        System.out.println("Enter new student name: ");
        String name = scanner.nextLine();
        System.out.println("Enter new student major: ");
        String major = scanner.nextLine();
        System.out.println("Enter new student gpa: ");
        double gpa = scanner.nextDouble();
        scanner.nextLine();
        Student newStudent = Student.createStudent(name, major, gpa);
        if (database.addNewStudent(newStudent)) {
            System.out.println("New student added: \nName = " + name +
                    "\nID# = " + newStudent.getId() +
                    "\nMajor = " + major +
                    "\nGPA = " + gpa);
        }

    }

    private static void updateStudent() {
        System.out.println("Enter existing student name: ");
        String name = scanner.nextLine();
        Student existingStudent = database.queryStudent(name);
        if (existingStudent == null) {
            System.out.println("Student not found");
            return;
        }

        System.out.println("Change name to: ");
        String newName = scanner.nextLine();
        System.out.println("Change major to: ");
        String newMajor = scanner.nextLine();
        System.out.println("Change gpa to: ");
        double newGpa = scanner.nextDouble();
        scanner.nextLine();
        Student modifiedStudent = Student.createStudent(newName, newMajor, newGpa);
        if (database.updateStudent(existingStudent, modifiedStudent)) {
            System.out.println("Successfully updated student " + newName + "!");
        } else {
            System.out.println("Error updating student.");
        }

    }

    private static void removeStudent() {
        System.out.println("Enter existing student name: ");
        String name = scanner.nextLine();
        Student existingStudent = database.queryStudent(name);
        if (existingStudent == null) {
            System.out.println("Student not found");
            return;
        }

        if (database.removeStudent(existingStudent)) {
            System.out.println("Student successfully deleted.");
        } else {
            System.out.println("Error deleting student.");
        }
    }

    private static void queryStudent() {
        System.out.println("Enter existing student name: ");
        String name = scanner.nextLine();
        Student existingStudent = database.queryStudent(name);
        if (existingStudent == null) {
            System.out.println("Student not found");
            return;
        }

        System.out.println("Name: " + existingStudent.getName() +
                "\nID#: " + existingStudent.getId() +
                "\nMajor: " + existingStudent.getMajor() +
                "\nGPA: " + existingStudent.getGpa());
    }

    private static void enrollStudent() {
        System.out.println("Enter existing student name: ");
        String name = scanner.nextLine();

        //  Pre-Populated Sections
        Section potions = new Section("POT 420", "Spring 2019", "MWF 10:30AM");
        Section defense = new Section("DADA 101",
                "Spring 2019", "TTH 9:00AM");

        //      Pre-Populated Faculty
        Faculty dumbledore = new Faculty();
        dumbledore.name = "Dumbledore";
        Faculty snape = new Faculty();
        snape.name = "Snape";

        //      Setting Instructors for Classes
        potions.setInstructor(snape);
        defense.setInstructor(dumbledore);


        Student existingStudent = database.queryStudent(name);
        if (existingStudent == null) {
            System.out.println("Student not found");
            return;
        }
        System.out.println( "To enroll student in potions input 1\n" +
                            "To enroll student in defense against the dark arts input 2");
        int action = scanner.nextInt();
        switch(action) {
            case 1:
                System.out.println("Enrolling student in potions class.");
                existingStudent.enroll(potions);
                break;
            case 2:
                System.out.println("Enrolling student in defense against the dark arts class.");
                existingStudent.enroll(defense);
                break;

        }
        System.out.println(existingStudent.toString());
    }

    private static void printActions() {
        System.out.println("\nAvailable Actions:\npress");
        System.out.println( "0 - to shutdown program\n" +
                            "1 - to print list of students\n" +
                            "2 - to add a new student\n" +
                            "3 - to update existing student info\n" +
                            "4 - to remove a student\n" +
                            "5 - to search for and display student info\n" +
                            "6 - to enroll student in a class\n" +
                            "7 - to enter in administrative menu");
    }

    private static void printAdminActions() {
        System.out.println("\nAvailable Administrative Actions:\npress");
        System.out.println( "1 - to add a course\n" +
                            "2 - to modify a course\n" +
                            "3 - to remove a course\n" +
                            "4 - to display roster for a course\n" +
                            "5 - to exit program");
    }
}