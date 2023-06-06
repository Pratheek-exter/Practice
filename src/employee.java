//Encapsulation
class oopsConcept {
   static int empID = 2;
    int basicSal = 20000;
    int incentive = 200;
    void countSalaries(){
        System.out.println(basicSal+incentive);
    }
}

class Test{
    public static void main(String[] args) {
        Employee engineer = new Employee();
        System.out.println(engineer.empID);
    }
}
