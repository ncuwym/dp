package d3.test3;

//Student类，实现Comparable接口，重写compareTo方法
public class Student implements Comparable<Student> {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student stu) {
        if (this.id > stu.id) {
            return -1;
        } //大id放前面
        else if (this.id < stu.id) {
            return 1;
        }//小id放后面
        else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return id + ":" + name;
    }
}
