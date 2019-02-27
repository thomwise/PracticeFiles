import java.util.ArrayList;

public class Student {

    private String name;
    private int id;
    private int creditsEarned;
    private String major;
    private double gpa;
    public ArrayList<Section> schedule;
    //public Grades[] transcript;

    private static int nextId = 1000001;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCreditsEarned() {
        return creditsEarned;
    }

    public void setCreditsEarned(int creditsEarned) {
        this.creditsEarned = creditsEarned;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Student(String name, String major) {
        this.name = name;
        this.major = major;
        this.id = nextId++;
        this.creditsEarned = 0;
        this.gpa = 4.0;
        this.schedule = new ArrayList<Section>();
    }

    @Override
    public String toString() {

        String sched = "Schedule\n========================\n";
        for(Section s : this.schedule) {
            sched = sched + s.getCourse() + ", " + s.getMeetingDayAndTimes()
                    + ", " + s.getInstructor().name + "\n";
        }
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", creditsEarned=" + creditsEarned +
                ", major='" + major + '\'' +
                ", gpa=" + gpa +
                ", schedule=" + schedule +
                "}\n" + sched;
    }

    public boolean enroll(Section course) {
        if(course.roster.size() >= course.getCapacity()) {
            System.out.println(course.getCourse() + " is full. Enrollment failed for student " + this.name + ".");
            return false;
        } else {
            this.schedule.add(course);
            course.roster.add(this);
            System.out.println(this.name + " successfully enrolled in class " +  course.getCourse() + ".");
            return true;
        }

    }
}
