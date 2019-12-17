package d3.test6;

//具体目标类，定义属性的set，get方法
    public class MySubject extends Subject {

        private String department;

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
            notifyObserver();
        }
}
