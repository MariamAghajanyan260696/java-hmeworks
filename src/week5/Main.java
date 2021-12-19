package week5;

public class Main {
    public static void main(String[] args) {
        Employer employer = new Employer();

        employer.setAge(2);
        employer.setName("Mariam");

        Employer newEmployer= new Employer(22, "Ani");
        System.out.println(employer);
        employer.printInfo();
        newEmployer.printInfo();

    }
}
