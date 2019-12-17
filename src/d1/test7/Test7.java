package d1.test7;

import d1.tools.XMLUtil;

//测试类
public class Test7 {
    public static void main(String[] args) {
        Builder builder = (Builder) XMLUtil.getBean();
        Director director = new Director();
        director.setBuilder(builder);
        Person p = director.construct();
        System.out.println(p.getHead() + ":" + p.getBody());
    }
}
