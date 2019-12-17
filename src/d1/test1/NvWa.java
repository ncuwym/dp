package d1.test1;
/**
 * 核心工厂类,用new的方式创建对象，一旦出错，影响整个系统
 *
 * (优点)实现对象创建和使用的分离，将对象的创建交给专门的工厂类负责
 * (缺点)工厂类不灵活，每增加一个类，修改一次工厂，类太多，工厂判断逻辑会变复杂
 *
 */

//工厂类NvWa，负责具体对象的创建
public class NvWa {

    //静态工厂方法
    public static Person createPerson(String type) {
        if (type.equalsIgnoreCase("man")) {
            return new Man();

        } else if (type.equalsIgnoreCase("robot")) {
            return new Robot();

        } else {
            return null;

        }
    }

}
