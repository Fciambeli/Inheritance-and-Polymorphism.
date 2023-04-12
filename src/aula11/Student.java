package aula11;

/*For example, if I write the following code:
    public final class Student extends Person{
}
    The Scholar class can't be created, because the code above describes
   a final class. The final class concept is:
    It cannot be inherited by another class.
*/
public class Student extends Person {
    //Attibutes
    private int enrollment;
    private String course;
    
    //Method
    public void monthlyPayment(){
        System.out.println("Monthly Payment, OK! " + this.getName());
    }
    
    //Getter and Setter Methods
    public int getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(int enrollment) {
        this.enrollment = enrollment;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String curso) {
        this.course = curso;
    }
    
}
