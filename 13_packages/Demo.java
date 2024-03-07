import java.util.ArrayList; // by default package

import tools.AdvCalc_02; // create package
import tools.Calc_01;

// import 13_package --> // this is import a import a folder in this folder(tools) not an Calc_01 & AdvCalc_02

public class Demo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        Calc_01 obj = new Calc_01();
        AdvCalc_02 obj1 = new AdvCalc_02();
    }
}
