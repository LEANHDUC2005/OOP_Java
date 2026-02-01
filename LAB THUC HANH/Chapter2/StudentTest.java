public class StudentTest {
    public static void main(String arg[]){
        Student s1 = new Student();
        s1.displayInfo();
        Student s2 = new Student("27900121","Le Anh Duc");
        s2.displayInfo();
        Student s3 = new Student("23701131");
        s3.displayInfo();
        Student s4 = new Student("31484852", "Nguyen Van Minh", 5.4);
        s4.displayInfo();
        try{
            new Student("-13412334", "Doan Van Trung", 3.0);
            System.out.println("Failed: Id was negative");
        }catch(IllegalArgumentException ex1){
            System.out.println("Catched: Positive Id");
        }

        try{
            new Student("dafg sfs$", "Doan Van Trung", 3.0);
            System.out.println("Failed: Id has character");
        }catch(IllegalArgumentException ex2){
            System.out.println("Catched: Charactor Id");
        }

        try{
            new Student(null, "Doan Van Trung", 5.0);
            System.out.println("Failed: Id was NULL");
        }catch(IllegalArgumentException ex3){
            System.out.println("Catched: NULL Id");
        }

        try{
            new Student("", "Doan Van Trung", 5.2);
            System.out.println("Failed: Id was empty");
        }catch(IllegalArgumentException ex4){
            System.out.println("Catched: Empty ID");
        }

        try{
            new Student("21123443", null , 5.4);
            System.out.println("Failed: Name was null");
        }catch(IllegalArgumentException ex5){
            System.out.println("Catched: NULL Name");
        }

        try{
            new Student("23111133", "", 8.4);
            System.out.println("Failed: Name was empty");
        }catch(IllegalArgumentException ex6){
            System.out.println("Catched: Empty Name");
        }

        try{
            new Student("11234324", "Phan Tan Trung", -1);
            System.out.println("Failed: Point was negative");
        }catch(IllegalArgumentException ex7){
            System.out.println("Catched: Negative point");
        }

        try{
            new Student("224324234", "Phan Tan Trung", 13);
            System.out.println("Failed: Point greater than 10");
        }catch(IllegalArgumentException ex8){
            System.out.println("Catched: Point > 10");
        }
    }
}
