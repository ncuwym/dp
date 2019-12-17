package d3.test3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList();
        list.add(new Student(1, "wang"));
        list.add(new Student(2, "li"));
        list.add(new Student(3, "xiao"));
        list.add(new Student(4, "huang"));
        Collections.sort(list);  //使用Student的comparTo的规则进行排序
        Iterator iterator = list.iterator();  //获取迭代器
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
