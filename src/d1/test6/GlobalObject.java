package d1.test6;

public class GlobalObject {
    private static ConnectionPoolManager connectionPoolManager = null;

    public GlobalObject() {
        connectionPoolManager = ConnectionPoolManager.getConnectionPoolManager();
    }

    public static ConnectionPoolManager getConnectionPoolManager() {
        if (connectionPoolManager == null) {
            connectionPoolManager = ConnectionPoolManager.getConnectionPoolManager();
            System.out.println("连接池创建成功");
            System.out.println("---------------");
        }
        return connectionPoolManager;
    }
}

