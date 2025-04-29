public class student {

    String name;
    int usn;
    String course;

    student(String name , int usn , String course){
        this.name = name;
        this.usn = usn;
        this.course = course;
    }

    public void display(){
        System.out.println("Stuent Details");
        System.out.println("Student Name :"+name);
        System.out.println("Student USN :"+usn);
        System.out.println("Course :"+course);
    }

    public static void main(String[] args) {
        
        student s1 = new student("Komal", 305, "BCA");
        student s2 = new student("Akshay", 244, "E&C");

        s1.display();
        s2.display();
    }
    
}
