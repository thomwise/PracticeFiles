import java.util.ArrayList;

public class Section {

    private static int nextId = 50001;

    private int id;
    private String course;
    private String term;
    private String meetingDayAndTimes;
    private Faculty instructor;
    public ArrayList<Student> roster;
    private int capacity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getMeetingDayAndTimes() {
        return meetingDayAndTimes;
    }

    public void setMeetingDayAndTimes(String meetingDayAndTimes) {
        this.meetingDayAndTimes = meetingDayAndTimes;
    }

    public Faculty getInstructor() {
        return instructor;
    }

    public ArrayList<Student> getRoster() {
        return roster;
    }

    public void setInstructor(Faculty instructor) {
        this.instructor = instructor;
    }

    public Section(String course, String term, String meetingDayAndTimes) {
        this.id = nextId++;
        this.course = course;
        this.term = term;
        this.meetingDayAndTimes = meetingDayAndTimes;
        this.roster = new ArrayList<>();
        this.capacity = 3;
    }

    public static Section createCourse(String course, String term, String meetingDayAndTimes) {
        return new Section(course, term, meetingDayAndTimes);
    }

}
