package aula11;
public class Scholar extends Student {
    //Attibutes
    private float scholarship;
    
    //Method
    public void renewScholarship(){
        System.out.println("Scholarship Renewed! " + this.name);
    }
    
    @Override
    public void monthlyPayment(){
        System.out.println(this.name + " has a scholarship! Payment OK!");
    }
    
    //Getter and Setter Methods
    public float getScholarship() {
        return scholarship;
    }

    public void setScholarship(float scholarship) {
        this.scholarship = scholarship;
    }
    
    
   
    
}

