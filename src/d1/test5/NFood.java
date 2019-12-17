package d1.test5;

public class NFood implements Canteen {
    @Override
    public Cooker Serve() {
        System.out.println("在北系餐厅点菜");
        return new NCooker();
    }
}
