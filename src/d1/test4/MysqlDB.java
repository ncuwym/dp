package d1.test4;

/**
 * 具体的Mysql数据库
 */
public class MysqlDB extends  DataBase{
    @Override
    public Connection createConnection() {
        return new MysqlConnection();
    }
    @Override
    public Statement createStatement() {
        return new MysqlStatement();
    }
}
