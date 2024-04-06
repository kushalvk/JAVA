package Access_Modifier_14;

public class C {
    int mk;

    protected void abc() { // you can not use the protected in outside the pakage to non sub class
        System.out.println("Hii! Protected");
    }
}
