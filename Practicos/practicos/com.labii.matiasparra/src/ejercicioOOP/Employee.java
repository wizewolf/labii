package ejercicioOOP;

/**
 * Created by WIZERWOLF on 15/09/2016.
 */
public class Employee {
    private int id,salary;
    private String firsName,lastName;
    //constructor
    public Employee(int id, int salary, String firsName, String lastName) {
        this.id = id;
        this.salary = salary;
        this.firsName = firsName;
        this.lastName = lastName;
    }
    //get y set de cada atributo
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //metodos
    public String getName(){
        return firsName+" "+lastName;
    }
    public int getAnnualSalary(){
        return salary*12;
    }
    public int raiseSalary(int percent){
        return (int) salary+(salary*percent/100);
    }

    @Override
    public String toString() {
        return "Employee[" +
                "id=" + id +
                ", salary=" + salary +
                ", firsName=" + firsName+
                ", lastName=" + lastName+
                ']';
    }
}
