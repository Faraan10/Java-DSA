package oops;

public class ParameterizedData {
    
    String name;
    String alias;
    int age;

    // parameterized constructor
    // this.name is the above name and RHS name is the parameter which is passed by the user
    ParameterizedData(String n, String s, int a){
        name=n;
        alias=s;
        age=a;
    }

    public void printDetails(){
        System.out.println(name+" "+ alias+" "+ age);
    }

    public static void main(String[] args){

        ParameterizedData pd=new ParameterizedData("Faraan", "MD", 25);

        pd.printDetails();
    }
}
