package d3.test7;
//骨灰玩家类
public class Final extends State {
    public Final(State state) {
        this.player = state.player;
        this.stateName = "骨灰";
    }
}
