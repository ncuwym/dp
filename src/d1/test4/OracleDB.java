package d1.test4;

//具体数据库类OracleDB
public class OracleDB extends DataBase {
    @Override
    public Connection createConnection() {
        return new OracleConnection();
    }

    @Override
    public Statement createStatement() {
        return new OracleStatement();
    }
}
