package d1.test4;

//抽象数据库类
public abstract class DataBase {
        public abstract Connection createConnection();
        public abstract Statement createStatement();
}
