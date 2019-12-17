package d3.test7;
//熟练玩家类
public class Second extends State {
    public Second(State state) {
        this.player = state.player;
        this.stateName = "熟练";
    }
    public void change() {
        System.out.println(player.getState().stateName + player.getName() + "：不允许换牌");
    }
    public void peek() {
        System.out.println(player.getState().stateName + player.getName() + "：不允许偷看");
    }
}
