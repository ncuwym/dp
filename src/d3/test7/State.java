package d3.test7;

//玩家状态类
public abstract class State {
    protected Player player;
    protected String stateName;
    public void play() {
        System.out.println(player.getState().stateName + player.getName() + "：玩游戏");
    }
    public void doubleScore() {
        System.out.println(player.getState().stateName + player.getName() + "：双倍积分");
    }
    public void change() {
        System.out.println(player.getState().stateName + player.getName() + "：换牌");
    }
    public void peek() {
        System.out.println(player.getState().stateName + player.getName() + "：偷看");
    }
}
