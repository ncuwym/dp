package d3.test9;
//具体观察者类VIP
public class VIP implements Observer {
    private String id;
    public VIP(String id) { this.id = id; }

    @Override
    public void update(Product product) {
        System.out.println(id + ((Fruit) product).getName() +
                ((Fruit) product).getPrice());
    }
}
