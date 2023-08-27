
public class Main{

public static void main(String args[]){
  StudentCreator studentCreator1 = new StudentCreator(new BachelorStudentBuilder()); 
  StudentCreator studentCreator2 = new StudentCreator(new MasterStudentBuilder()); 

  Student engineerStudent = studentCreator1.createStudent();
  Student mbaStudent = studentCreator2.createStudent();

}
  
}
