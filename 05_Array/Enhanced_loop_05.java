// enhanced loop is "foreach" loop

class student {
    int rollno;
    String name;
    int marks;
}

public class Enhanced_loop_05 {
    public static void main(String[] args) {
        int num[] = new int[4];

        num[0] = 4;
        num[1] = 8;
        num[2] = 3;
        num[3] = 9;

        // for(int i = 0; i < num.length; i++) {
        //     System.out.println(num[i]);
        // }

        // this loop is jast for "array"
        for (int n : num) {
            System.out.println(n);
        }

        student s1 = new student();
        s1.rollno = 1;
        s1.name = "kushal";
        s1.marks = 313;
        
        student s2 = new student();
        s2.rollno = 2;
        s2.name = "om";
        s2.marks = 314;

        student s3 = new student();
        s3.rollno = 3;
        s3.name = "harshad";
        s3.marks = 312;

        student Stud[] = new student[3];
        Stud[0] = s1;
        Stud[1] = s2;
        Stud[2] = s3;

        // for(int i = 0; i < Stud.length; i++) {
        //     System.out.println(Stud[i].name + " : " + Stud[i].marks);
        // }
        
        // this loop is use in ony "array" 
        for (student std : Stud) {
            System.out.println(std.name + " -> " + std.marks);
        }
    }
}
