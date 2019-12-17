package d3.test7;

//测试类
public class Test7 {
    public static void main(String[] args) {
        Player player = new Player("玩家1");

        player.setState(new Primary(player));
        call(player);
        player.setState(new Primary(player.getState()));
        call(player);
        player.setState(new Second(player.getState()));
    call(player);
        player.setState(new Profession(player.getState()));
    call(player);
        player.setState(new Final(player.getState()));
    call(player);
}

    public static void call(Player player) {
        player.play();
        player.doubleScore();
        player.change();
        player.peek();
    }
}
