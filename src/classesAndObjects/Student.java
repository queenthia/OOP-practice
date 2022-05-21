package classesAndObjects;

public class Student {
    //attributes
    public String studentName;
    public String studentNumber;
    public  String registrationNumber;
    public int age;
    public double tuitionAmount;

    //All Args constructor
    public Student(String studentName, String studentNumber, String registrationNumber,int age, double tuitionAmount){
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.registrationNumber = registrationNumber;
        this.age = age;
        this.tuitionAmount = tuitionAmount;
    }

    //Nor args constructor
    public Student(){}

    //constructor with only two arguments
    public Student(String studentName, double tuitionAmount){
        this.studentName = studentName;
        this.tuitionAmount = tuitionAmount;
    }

    public static void main(String[] args) {

        //create the object using a default constructor

        Student student1 = new Student();
        student1.studentName = "Olga Queen";
        student1.registrationNumber = "12/U/190966";
        student1.studentNumber ="226770987";
        student1.age = 21;
        student1.tuitionAmount = 2000000.00;


        System.out.println("The First Student's name is "+ student1.studentName);
        System.out.println("The First Student's registrationNumber is "+ student1.registrationNumber);
        System.out.println("The First Student's studentNumber is "+ student1.studentNumber);
        System.out.println("The First Student's age is "+ student1.age);
        System.out.println("The First Student's tuitionAmount is "+ student1.tuitionAmount);


        // create object using an all args constructor

        Student student2 = new Student("Alex","216004565","16/U/10344/EVE",28,1800000);
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("The Second Student's name is "+ student2.studentName);
        System.out.println("The Second Student's registrationNumber is "+ student2.registrationNumber);
        System.out.println("The Second Student's studentNumber is "+ student2.studentNumber);
        System.out.println("The Second Student's age is "+ student2.age);
        System.out.println("The Second Student's tuitionAmount is "+ student2.tuitionAmount);


        // create object using a constructor with two args

        Student student3 = new Student("Jenny", 1900000);
        student3.registrationNumber = "reg/98989898";
        System.out.println("---------------------------------------------------");
        System.out.println("The Third Student's name is "+ student3.studentName);
        System.out.println("The Third Student's registrationNumber is "+ student3.registrationNumber);
        System.out.println("The Third Student's studentNumber is "+ student3.studentNumber);
        System.out.println("The Third Student's age is "+ student3.age);
        System.out.println("The Third Student's tuitionAmount is "+ student3.tuitionAmount);
    }
}
