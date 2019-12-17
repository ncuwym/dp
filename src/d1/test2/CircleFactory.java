package d1.test2;

public class CircleFactory implements GraphFactory {
    @Override
    public Graph produceGraph() {
        System.out.println("圆形工厂正在生产圆形");
        return new Circle();
    }
}
