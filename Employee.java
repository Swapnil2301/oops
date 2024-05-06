public class Employee {
    String name;
    int id;
    int salary;
    public Employee(String name,int id,int salary){
        this.name =name;
        this.id= id;
        this.salary = salary;
    }
    public void setname(String name){
        this.name = name;
    }
    public void setid(int id){
        this.id = id;
    }
    public void setsalary(int salary){
        this.salary= salary;
    }
    public String getname(){
        return name;
    }
    public int getid(){
        return id;
    }
    public int getsalary(){
        return salary;
    }

    public static void main(String[] args) {
        Employee Swapnil = new Employee("Swapnil",33,30000);
        System.out.println("Employee name is " + Swapnil.name);
        System.out.println("Employee id is " + Swapnil.id);
        System.out.println("Employee salary is "+Swapnil.salary);

    }
}
