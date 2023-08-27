public class MasterStudentBuilder extends StudentBuilder{
  List<String> courses = new ArrayList<>();
  courses.add("Management 101");
  courses.add("Advance Physics 101");
  courses.add("Advance Chemistry 101");
  courses.add("Advance Biology 101");
  courses.add("Advance English 101");

  @Override
  public StudentBuilder setCourses(courses){
    this.courses = courses;
    return this;
  }


}
