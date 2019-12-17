package d1.test2;

import d1.tools.XMLUtil;

public class Test2 {
    public static void main(String[] args) {
        try {
            GraphFactory factory;
            Graph graph;
            factory = (GraphFactory) XMLUtil.getBean();
            graph = factory.produceGraph();
            graph.draw();
            graph.erase();
        } catch (Exception e) {
            System.out.println();
        }
    }
}
