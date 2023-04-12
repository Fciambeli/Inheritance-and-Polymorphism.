package aula11;
public class Aula11 {
    public static void main(String[] args) {
     /*Person p = new Person(); - Can not be done, because this is an
        object of abstract class
     */
     
     Visitor v = new Visitor();
     v.setName("Fábio");
     v.setAge(30);
     v.setSex("M");
        System.out.println(v.toString());
    
    Student s = new Student();
    s.setName("Stone Heart");
    s.setEnrollment(1237);
    s.setCourse("Administration");
    s.setAge(26);
    s.setSex("M");
    s.monthlyPayment();
    
     Scholar c = new Scholar();
     c.setEnrollment(1238);
     c.setName("Peter");
     c.setScholarship(12.5f);
     c.setSex("M");
     c.monthlyPayment();
     
     
     
    }
    
}
