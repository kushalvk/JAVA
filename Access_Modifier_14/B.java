import Other.A;

public class B {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.marks); // if 'marks' not public you can not use outsid the pakage
        obj.show();

        C obj1 = new C();
        System.out.println(obj1.mk); // you can access 'mk' in same pakages 
    }
}

//  Access Location             |  public | private | protected | friendly(default) | private Protected
//                              |         |         |           |                   |
//  Same Class                  |   Yes   |   Yes   |   Yes     |        Yes        |       Yes
//  Sub class in same pakage    |   Yes   |   No    |   Yes     |        Yes        |       Yes
//  other class in same pakage  |   Yes   |   No    |   Yes     |        Yes        |       No
//  Sub class in other pakage   |   Yes   |   No    |   Yes     |        No         |       Yes
//  other class in other pakage |   Yes   |   No    |   No      |        No         |       No