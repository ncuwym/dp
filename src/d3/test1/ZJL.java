package d3.test1;

//具体的审批者总经理类
public class ZJL extends Leader {
    public ZJL(String name) {
        super(name);
    }

    @Override
    public void handleList(MaterialList materialList) {
        if (materialList.getPrice() <= 10000) {
            System.out.println(name + "总经理审批" + materialList.getPrice());
        } else {
            if (leader != null) {
                this.leader.handleList(materialList);
            }
        }
    }
}
