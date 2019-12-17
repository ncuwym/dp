package d3.test6;

//测试类
    public class Test6 {
        public static void main(String[] args) {
            Subject mySubject = new MySubject();
            mySubject.addObserver(new Teacher("w"));
            mySubject.addObserver(new Teacher("x"));
            mySubject.addObserver(new Student("y"));
            mySubject.addObserver(new Student("z"));
            ((MySubject) mySubject).setDepartment("cs");
            ((MySubject) mySubject).setDepartment("ne");
            ((MySubject) mySubject).setDepartment("ms");
        }
}
