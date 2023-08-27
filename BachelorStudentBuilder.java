public class BachelorStudentBuilder extends StudentBuilder{
  List<String> courses = new ArrayList<>();
  courses.add("Math 101");
  courses.add("Physics 101");
  courses.add("Chemistry 101");
  courses.add("Biology 101");
  courses.add("English 101");

  @Override
  public StudentBuilder setCourses(courses){
    this.courses = courses;
    return this;
  }


}
