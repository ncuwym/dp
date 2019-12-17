package d1.test2;

public class TriangleFactory implements GraphFactory {
    @Override
    public Graph produceGraph() {
        System.out.println("三角形工厂正在生产三角形");
        return new Triangle();
    }
}
