package d1.test6;

/**
 * 连接池管理类
 */
public class ConnectionPoolManager {
    //私有静态化成员变量
    private static ConnectionPoolManager connectionPoolManager = null;

    //私有构造方法
    private ConnectionPoolManager() {
    }

    //公开静态的实例化方法
    public static ConnectionPoolManager getConnectionPoolManager() {
        if (connectionPoolManager == null) {
            connectionPoolManager = new ConnectionPoolManager();
        }
        return connectionPoolManager;
    }

    //获取连接
    public static Connection getConnection() {
        return new Connection();
    }
}
