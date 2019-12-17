package d3.test1;

//客户端测试类
public class Test1 {
    public static void main(String[] args) {

        Leader zr = new ZR("z");
        Leader bmjl = new BMJL("x");
        Leader zjl = new ZJL("h");
        Leader meeting = new Meeting("d");

        //设置上级领导,用以形成职责链
        zr.setLeader(bmjl);
        bmjl.setLeader(zjl);
        zjl.setLeader(meeting);

        //把订单实例对象传递给处理链初始对象的主任实例
        MaterialList ml1 = new MaterialList(1000);
        zr.handleList(ml1);

        MaterialList ml2 = new MaterialList(5000);
        zr.handleList(ml2);

        MaterialList ml3 = new MaterialList(10000);
        zr.handleList(ml3);

        MaterialList ml4  = new MaterialList(20000);
        zr.handleList(ml4);
    }
}
