package d3.test6;

public class Student implements Observer {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(Subject subject) {
        //输出学生姓名和对应的专业，
        System.out.println(name + ":" + ((MySubject) subject).getDepartment());
    }
}
