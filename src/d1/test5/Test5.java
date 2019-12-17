package d1.test5;

import d1.tools.XMLUtil;
public class Test5 {
    public static void main(String[] args) {
        Canteen canteen;
        Cooker cooker;
        canteen = (Canteen) XMLUtil.getBean();
        canteen.Serve().cook();
    }
}

