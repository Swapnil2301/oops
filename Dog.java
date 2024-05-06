public class Dog {
    String breed;
    int age;
    int weight;
    public Dog(String breed,int age,int weight){
        this.breed =breed;
        this.age =age;
        this.weight = weight;
    }
    public int dogage(int humanage){
        humanage = age*7;
        return humanage;
    }

    public static void main(String[] args) {
        Dog sam = new Dog("DOG",15,30);
        System.out.println("Dog age in Human year is " + sam.dogage(15));
        System.out.println("Dog breed is "+sam.breed);
        System.out.println("Dog Weight is " + sam.weight);
        System.out.println("Dog age is " + sam.age);
    }
}
