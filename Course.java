import java.util.UUID;

public class Course {
    private String courseId;
    private String name;
    private double price;
    private double moneyEarned;
    private Teacher teacher;

    public Course(String name, double price) {
        this.courseId = UUID.randomUUID().toString();
        this.name = name;
        this.price = price;
        this.moneyEarned = 0.0;
        this.teacher = null;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMoneyEarned() {
        return moneyEarned;
    }

    public void addMoneyEarned(double amount) {
        this.moneyEarned += amount;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}

