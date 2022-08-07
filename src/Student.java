public class Student {
    private int rating;
    private String name;

    static double allRating;
    static int studentCounter;

    public Student(String name) {
        this.name = name;
        studentCounter++;
    }

    public static double getAvgRating() {
        if (allRating == 0.00 || studentCounter == 0) {
            return 0.0;
        } else {
            return allRating / studentCounter;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
        allRating = allRating + rating;
    }

    public boolean betterStudent(Student student) {
        boolean result;
        if (rating > student.getRating()) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public void changeRating(int i) {
        allRating = allRating - this.rating;
        this.rating = i;
        allRating = allRating + i;

    }

    public static void removeStudent(Student student) {
        allRating = 0.00;
        studentCounter = 0;

    }

    @Override
    public String toString() {
        // TODO return String with name and rating of this student
        return "Student " + this.name + " has rating " + this.rating;
    }
}

