class student {
    int rollno;
    String name;
    int marks;
}

public class Array_of_Object_04 {
    public static void main(String[] args) {
        // int num[] = new int[6];

        // num[0] = 4;
        // num[1] = 8;
        // num[2] = 3;
        // num[3] = 9;

        // for(int i = 0; i < num.length; i++) {
        //     System.out.println(num[i]);
        // }

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

        
        // System.out.println(s2.name + " : " + s2.rollno + " -> " + s2.marks);
        // System.out.println(s3.name + " : " + s3.rollno + " -> " + s3.marks);

        for(int i = 0; i < Stud.length; i++) {
            System.out.println(Stud[i].name + " : " + Stud[i].marks);
        }
    }
}
