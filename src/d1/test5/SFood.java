package d1.test5;

public class SFood implements Canteen {

    @Override
    public Cooker Serve() {
        System.out.println("点南方菜");
        return new SCooker();
    }
}
