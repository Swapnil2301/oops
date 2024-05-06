public class Student {
    int age;
    String name;
    int id;
    public Student(int age, String name, int id) {
        this.name =name;
        this.age=age;
        this.id =id;
    }
    public void setname(String name){
        this.name = name;
    }
    public void setage(int age){
        this.age= age;
    }
    public void setid(int id){
        this.id = id;
    }
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }

    public static void main(String[] args) {
        Student swapnil =new Student(22,"Swapnil",33);
        System.out.println(swapnil.getage());
        System.out.println(swapnil.getname());
        System.out.println(swapnil.getid());
    }

}
