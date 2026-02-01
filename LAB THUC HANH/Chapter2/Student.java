public class Student {
    private String id;
    private String name;
    private double point;
    private boolean isId(String id){
        char idArray[] = id.toCharArray();
        for(int i=0; i < idArray.length; i++){
            if ( idArray[i] < '0' || idArray[i] > '9' )
                return false;
        }
        return true;
    }
    public Student(){
        this("0", "Unknown", 0);
    }
    public Student(String id, String name){
        this(id, name, 0);
    }
    public Student(String id){
        this(id,"Unknown", 0);
    }
    public Student(String id, String name, double point){
        if(id == null || id.isEmpty()){
            throw new IllegalArgumentException("ID of student must not be null or empty");
        }
        if(isId(id) == false){
            throw new IllegalArgumentException("ID of student must not have character and negative digit");
        }
        if(name == null || name.isEmpty() == true){
            throw new IllegalArgumentException("Name of student must not be null or empty");
        }
        if(point < 0 || point > 10){
            throw new IllegalArgumentException("Point of student must be positive and smaller than 10");
        }
        this.id = id;
        this.name = name;
        this.point = point;
    }
    public void displayInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Point: " + this.point);
    }
}
