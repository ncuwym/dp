package d1.test5;

/**
 * 美式餐窗口
 */
public class AFood implements Canteen {
    @Override
    public Cooker Serve() {
        System.out.println("在美式餐厅点餐");
        return new ACooker();
    }
}
