package d2.test6;

import java.util.HashMap;

//棋子工厂，用hashMap存储两个棋子对象，工厂为单例
public class ChessFactory {
    private static ChessFactory chessFactory;
    private static HashMap<String,AbstractChess> map = new HashMap();
    private ChessFactory() {
        map.put("black", new BlackChess());
        map.put("white", new WhiteChess());
    }
    public static ChessFactory getSingleFactory() {
        if (chessFactory == null) {
            chessFactory = new ChessFactory();
            return chessFactory;
        } else { return null; }
    }
    public AbstractChess getChess(String color) { return map.get(color); }
}
