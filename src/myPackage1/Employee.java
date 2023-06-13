package myPackage1;

public class Employee{
    String name;
    int age;
    String address;

    public Employee(String name, int age, String address){    //Constructor
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setName(String name){
        this.name = name;
    }


    public void setAddress(String address){
        this.address = address;
    }

    public String getName() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String toString() {
        return ("Employee name is" + this.getName() + ", age is: " + this.getAge() + ", address is: " + getAddress());
    }

    public static void main(String[] args) {

    }
}

