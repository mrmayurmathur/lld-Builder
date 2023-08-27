
public class Creator{

  StudentBuilder studentBuilder;

  Creator( StudentBuilder studentBuilder){
    this.studentBuilder = studentBuilder;
  }

  public Student createStudent(){
    if(studentBuilder instanceof MasterStudentBuilder){
      return createMasterStudent();
    }
    else if(studentBuilder instanceof BachelorStudentBuilder){
      return createBachelorStudent();
    }
    return null;
  }
  private Student createMasterStudent(){
    return studentBuilder.setRollNumber(1).setAge(22).setName("MM1").setSubjects().build();
  }
    private Student createMasterStudent(){
    return studentBuilder.setRollNumber(21).setAge(24).setName("RS1").setSubjects().build();
  }
}
