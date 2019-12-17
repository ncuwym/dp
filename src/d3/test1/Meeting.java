package d3.test1;

public class Meeting extends Leader {
    public Meeting(String name) {
        super(name);
    }
    @Override
    public void handleList(MaterialList materialList) {
        if (materialList.getPrice() > 10000) {
            System.out.println(name + "会议审批" + materialList.getPrice());
        } else {
            if (leader != null) {
                this.leader.handleList(materialList);
            }
        }
    }
}
