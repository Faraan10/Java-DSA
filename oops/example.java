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

    

    void printDetails(){
        System.out.println("Name is "+ name + " roll No is "+ rollNo + " and marks are "+ marks);
    }
}

public class example {
    
    public static void main(String[] args){

        StudentInfo s1=new StudentInfo();

        s1.printDetails();
    }
}
