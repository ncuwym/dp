package d1.test6;

public class QueryFunctions {
    public static void findStudentByName(String name) {
        ConnectionPoolManager connectionPoolManager = GlobalObject.getConnectionPoolManager();
        Connection connection = ConnectionPoolManager.getConnection();
        System.out.println(connectionPoolManager);  //输出连接池地址
        System.out.println(connection);  //输出连接的地址
        System.out.println("查询成功");
        System.out.println("-------------");
    }
}
