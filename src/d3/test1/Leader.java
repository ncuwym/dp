package d3.test1;

//抽象领导类Leader
public abstract class Leader {
    //姓名
    protected String name;
    //上级领导
    protected Leader leader;
    //有参构造
    public Leader(String name) {
        this.name = name;
    }
    //设置上级领导
    public void setLeader(Leader leader) {
        this.leader = leader;
    }
    //操作单子的抽象方法
    public abstract void handleList(MaterialList materialList);
}
