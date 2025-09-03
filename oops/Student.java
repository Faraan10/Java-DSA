package oops;

public class Student {
    
    String name;
    String alias;
    int age;
    public void printDetails(){
        System.out.print("My name is "+ name+ " but you can call me "+alias+ " and my age is "+ age);
    }


    public static void main(String[] args){

        Student s1=new Student();

        s1.printDetails(); // it prints null null 0 at variables place as they are not defined 
        // it takes their data types default values
        System.out.println();

        s1.name="Goku";
        s1.alias="Kakarot";
        s1.age=38;

        s1.printDetails();
        System.out.println();
        s1.name="Vegeta";
        s1.alias="Prince of Saiyan Race";

        s1.printDetails();
    }
}
