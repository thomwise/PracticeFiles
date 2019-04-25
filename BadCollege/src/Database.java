import java.util.ArrayList;

public class Database {
    private int year;
    private ArrayList<Student> students;
    private ArrayList<Section> sections;
    private ArrayList<Faculty> faculty;
    private Section roster;

    public Database(int year) {
        this.year = year;
        this.students = new ArrayList<Student>();
        this.sections = new ArrayList<Section>();
        this.faculty = new ArrayList<Faculty>();
    }

    public boolean addNewCourse(Section course) {
        if(findCourse(course.getCourse()) >= 0) {
            System.out.println("Course is already on file.");
            return false;
        }
        sections.add(course);
        return true;
    }

    public String queryCourse(Section course) {
        if(findCourse(course) >= 0) {
            return course.getCourse();
        }
        return null;
    }

    public Section queryCourse(String title) {
        int position = findCourse(title);
        if(position >= 0) {
            return this.sections.get(position);
        }
        return null;
    }

    public boolean updateCourse(Section oldCourse, Section newCourse) {
        int foundPosition = findCourse(oldCourse);
        if(foundPosition < 0) {
            System.out.println(oldCourse.getCourse() + " not found.");
            return false;
        }
        this.sections.set(foundPosition, newCourse);
        System.out.println(oldCourse.getCourse() + " was replaced with " + newCourse.getCourse());
        return true;
    }

    public boolean showRoster(Section course) {
        int foundPosition = findCourse(course);
        if(foundPosition < 0) {
            System.out.println(course.getCourse() + " not found.");
            return false;
        }
        this.roster.getRoster();
        return true;
    }

    private int findCourse(Section course) {
        return this.sections.indexOf(course);
    }

    private int findCourse(String courseName) {
        for(int i=0; i < this.sections.size(); i++) {
            Section course = this.sections.get(i);
            if(course.getCourse().equals(courseName)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeCourse(Section course) {
        int foundPosition = findCourse(course);
        if(foundPosition < 0) {
            System.out.println(course.getCourse() + ", was not found.");
            return false;
        }
        this.sections.remove(foundPosition);
        System.out.println(course.getCourse() + ", was successfully deleted.");
        return true;
    }

    public boolean addNewStudent(Student student) {
        if(findStudent(student.getName()) >= 0) {
            System.out.println("Student is already on file.");
            return false;
        }
        students.add(student);
        return true;
    }

    public boolean updateStudent(Student oldStudent, Student newStudent) {
        int foundPosition = findStudent(oldStudent);
        if(foundPosition < 0) {
            System.out.println(oldStudent.getName() + ", was not found.");
            return false;
        }
        this.students.set(foundPosition, newStudent);
        System.out.println(oldStudent.getName() + ", was replaced with " + newStudent.getName());
        return true;
    }

    public boolean removeStudent(Student student) {
        int foundPosition = findStudent(student);
        if(foundPosition < 0) {
            System.out.println(student.getName() + ", was not found.");
            return false;
        }
        this.students.remove(foundPosition);
        System.out.println(student.getName() + ", was successfully deleted.");
        return true;
    }

    private int findStudent(Student student) {
        return this.students.indexOf(student);
    }

    private int findStudent(String studentName) {
        for(int i=0; i < this.students.size(); i++) {
            Student student = this.students.get(i);
            if(student.getName().equals(studentName)) {
                return i;
            }
        }
        return -1;
    }

    public String queryStudent(Student student) {
        if(findStudent(student) >= 0) {
            return student.getName();
        }
        return null;
    }

    public Student queryStudent(String name) {
        int position = findStudent(name);
        if(position >= 0) {
            return this.students.get(position);
        }
        return null;
    }

    public void printStudents() {
        System.out.println("List of Students");
        for(int i=0; i < this.students.size(); i++) {
            System.out.println((i+1) + ". " + this.students.get(i).getName() +
                                " - ID: " + this.students.get(i).getId() +
                                " - GPA: " + this.students.get(i).getGpa() +
                                " - Major: " + this.students.get(i).getMajor());
        }
    }



}
