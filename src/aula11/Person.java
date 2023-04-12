package aula11;
public abstract class Person {
    //Attributes
    protected String name;
    protected  int age;
    protected  String sex;

    //Method
    public void birthDay(){
        this.age++; //this.age = this.age + 1
    }
    
    //Getter and Setter Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    //toString Method
    @Override
    public String toString() {
        return "Name = " + name + "\nAge = " + age + "\nSex = " + sex;
    }

}
