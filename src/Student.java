import java.util.ArrayList;
import java.util.List;

public class Student {
  private int rating;
  private String name;

  public Student(String name) {
    this.name = name;
  }
  public static double getAvgRating(List<Student> students) {
    // TODO return average rating of all students
  double sum = 0d;
  for (int i=0; i<students.size(); i++){
  sum = sum + students.get(i).rating;
    System.out.println(students.get(i).rating);
  }
    double result = sum / students.size();
    System.out.println(result);
    return result;
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

  public void changeRating(int rating) {
    // TODO change this student's rating and average rating of all students
    rating = this.rating;
  }

  public static void removeStudent(Student student) {
    // TODO remove student
  }

  @Override
  public String toString() {
    // TODO return String with name and rating of this student
   String strResult = "Student " + name + " has rating " + getRating();
    return strResult;
  }
}

