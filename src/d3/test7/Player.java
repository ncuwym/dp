package d3.test7;

//玩家实体类
public class Player {
    private State state;
    private String name;
    public Player(String name) {
        this.name = name;
        this.state = new Primary(this);
    }
    public void play() {
        state.play();
    }
    public void doubleScore() {
        state.doubleScore();
    }
    public void change() {
        state.change();
    }
    public void peek() {
        state.peek();
    }
    public State getState() {
        return state;
    }
    public void setState(State state) {
        this.state = state;
    }
    public String getName() {
        return name;
    }
}
