package d3.test6;
//具体的观察者，老师类
public class Teacher implements Observer {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Subject subject) {
        //输出老师姓名与对应专业
        System.out.println(name + ":" +
                ((MySubject) subject).getDepartment());
    }
}
