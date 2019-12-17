package d3.test7;

//新手状态类
public class Primary extends State {
    //初始化
    public Primary(Player player) {
        this.player = player;
        this.stateName = "新手";
    }
    //状态转换时的初始化
    public Primary(State state) {
        this.player = state.player;
        this.stateName = "新手";
    }
    public void doubleScore() {
        System.out.println(player.getState().stateName + player.getName() + "：不允许双倍积分");
    }
    public void change() {
        System.out.println(player.getState().stateName + player.getName() + "：不允许换牌");
    }
    public void peek() {
        System.out.println(player.getState().stateName + player.getName() + "：不允许偷看");
    }
}
