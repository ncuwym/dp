package d1.test4;

import d1.tools.XMLUtil;

//客户端类
public class Client {
    public static void main(String[] args) {
        DataBase db;
        Connection con;
        Statement stat;
        db = (DataBase)XMLUtil.getBean();
        con = db.createConnection();
        con.connect();
        stat = db.createStatement();
        stat.execute();
    }
}
