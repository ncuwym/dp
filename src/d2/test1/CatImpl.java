package d2.test1;
//具体的Cat
public class CatImpl implements ICat {
    @Override
    public void catchMouse() {
        System.out.println("抓老鼠");
    }
}
