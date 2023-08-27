
public class Student{
  String name;
  String fathersName;
  String mothersName;
  int age;
  int rollNumber;
  List<String> courses;

  public Student(StudentBuilder builder){
    this.name = builder.name;
    this.fathersName = builder.fathersName;
    this.mothersName = builder.mothersName;
    this.age = builder.age;
    this.rollNumber = builder.rollNumber;
    this.courses = builder.courses;
  }
  
}
