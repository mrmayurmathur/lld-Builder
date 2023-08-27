
public abstract class StudentBuilder{
  String name;
  String fathersName;
  String mothersName;
  int age;
  int rollNumber;
  List<String> courses;

  public StudentBuilder setName(String name){
    this.name = name
    return this;
  }

  public StudentBuilder setFathersName(String name){
    this.fathersName = name;
    return this
  }
  public StudentBuilder setName(String name){
    this.mothersName = name;
    return this
  }
  public StudentBuilder setName(int age){
    this.age = age
    return this
  }
    public StudentBuilder setName(int rollNumber){
    this.rollNumber = rollNumber
      return this
  }
  public abstract StudentBuilder setcourses (List<String> courses){
  }  
}
