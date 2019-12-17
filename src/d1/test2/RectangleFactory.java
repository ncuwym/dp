package d1.test2;

public class RectangleFactory implements GraphFactory {
    @Override
    public Graph produceGraph() {
        System.out.println("矩形工厂正在创建矩形");
        return new Rectangle();
    }
}
