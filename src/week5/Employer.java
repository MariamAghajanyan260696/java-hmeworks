package week5;

public class Employer {
    private int age ;
    private String name;

    public  Employer(){

    }
    public Employer(int age,String name){

        this.age=age;
        this.name= name;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        if (name.isBlank()) {
            System.out.println("invalid name");
        } else {
            this.name = name;
        }
    }

    public  void setAge(int age){
        if (age>0){
            this.age =age;
        }
        else{
            System.out.println("invalid age ");
        }
    }
    public int getAge(){
        return age;
    }
    public void printInfo(){
        System.out.println(name + " " +age);
    }

}
