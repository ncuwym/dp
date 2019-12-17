package d1.test4;

/**
 * Mysql数据库的Statement操作
 */
public class MysqlStatement extends Statement {
    @Override
    public void execute() {
        System.out.println("Mysql数据库操作成功");
    }
}
