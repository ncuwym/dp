package d1.test4;

/**
 * Mysql数据库的Connection操作
 */
public class MysqlConnection extends Connection {
    @Override
    public void connect() {
        System.out.println("Mysql数据库连接成功");
    }
}
