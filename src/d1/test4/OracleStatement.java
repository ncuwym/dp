package d1.test4;

//Oracle数据库的Statement
public class OracleStatement extends Statement {
    @Override
    public void execute() {
        System.out.println("Oracle数据库操作成功");
    }
}
