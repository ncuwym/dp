package d3.test7;

public class Profession extends State {
    public Profession(State state) {
        this.player = state.player;
       this.stateName = "高手";
    }

    public void peek() {
        System.out.println(player.getState().stateName + player.getName() + "：不允许偷看");
    }
}
