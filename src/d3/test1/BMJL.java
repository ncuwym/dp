package d3.test1;

public class BMJL extends Leader {

    public BMJL(String name) {
        super(name);
    }

    @Override
    public void handleList(MaterialList materialList) {
        if (materialList.getPrice() <= 5000) {
            System.out.println(name + "部门经理审批" + materialList.getPrice());
        } else {
            if (leader != null) {
                this.leader.handleList(materialList);
            }
        }
    }
}
