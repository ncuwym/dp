package d1.test4;

//Oracle数据库的Connection
public class OracleConnection extends Connection{
    @Override
    public void connect() {
        System.out.println("Oracle数据库连接成功");
    }
}
