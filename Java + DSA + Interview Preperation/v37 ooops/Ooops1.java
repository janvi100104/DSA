

public class Ooops1 {
    public static void main(String[] args) {
        
        Student s1=new Student("kunal",1,188.0f);
        // s1.greeting();
        Student s2 = new Student(s1);
        System.out.println(s2.name);
        System.out.println(s2.roll_no);
        System.out.println(s2.fee);
        //final keyword on object
        final Student s3=new Student("kunnu",2,199.0f);
        s3.name="changed name";//allowed
        // s3=new Student("new obj",3,299.0f);//not allowed
    }
   
}
class Student{
    int roll_no;
    String name = "Unknown";
    float fee;

    Student(Student other){
        this.name=other.name;
        this.roll_no=other.roll_no;
        this.fee=other.fee;
    }
    
    void greeting(){
        System.out.println("Hello my name is "+ this.name);
    }
 //we need to add the properties of above participants object by object
 //we need one object to access the object

    // Student(){
    //     //call this as reference variable like s1 here 
    //     this.name="Aditya";
    //     this.roll_no=10;
    //     this.fee=19.9f;
    // }


    Student(){
        //default constructor
        //this is you can call a constructor inside another constructor
        this("unknown",1,0.0f);
    }
    Student(String naam, int roll_no, float fee){
        //if arguments have different name clas than class there is nno need of this keyword
        name=naam;
        this.roll_no=roll_no;
        this.fee=fee;
    }
}