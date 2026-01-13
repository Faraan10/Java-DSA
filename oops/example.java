package oops;

// class ListNode{

//     int data;
//     ListNode next;

//     ListNode(int x){
//         data=x;
//         next=null;
//     }
// }

class StudentInfo{

    String name;
    int rollNo;
    int marks;

    StudentInfo(){ // this is default constructor without parameters
        name="Faraan";
        rollNo=10;
        marks=85;
    }

    StudentInfo(String name, int rollNo, int marks){ // this is parameterized constructor
        this.name=name;
        this.rollNo=rollNo;
        this.marks=marks;
    }

    void printDetails(){
        System.out.println("Name is "+ name + " roll No is "+ rollNo + " and marks are "+ marks);
    }
}

public class example {
    
    public static void main(String[] args){

        StudentInfo s1=new StudentInfo(); // creating object with default constructor

        StudentInfo s2=new StudentInfo("Goku", 100, 99); // creating object with parameterized constructor

        s1.printDetails(); // 
        s2.printDetails();
    }
}
