package d1.test8;

import d1.tools.XMLUtil;

public class Test8 {
    public static void main(String[] args) {
        ModelBuilder modelBuilder = (ModelBuilder) XMLUtil.getBean();
        Show show = new Show();
        show.setModelBuilder(modelBuilder);
        SoftWare softWare = show.construct();
        System.out.println(softWare.getWindow());
        System.out.println(softWare.getControl());
        System.out.println(softWare.getMenu());
        System.out.println(softWare.getList());
    }
}
