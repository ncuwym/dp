package d3.test1;

//具体的审批者主任类ZR
public class ZR extends Leader {

    public ZR(String name) {
        super(name);
    }

    @Override
    public void handleList(MaterialList materialList) {
        if (materialList.getPrice() <= 1000) {
            System.out.println(name + "主任审批" + materialList.getPrice());
        } else {
            if (leader != null) {
                this.leader.handleList(materialList);
            }
        }
    }
}
