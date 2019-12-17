package d1.test1;

import java.util.Scanner;


//不用修改客户端
//不用记具体类名，输入参数即可使用对象

//客户端类，无需修改
public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Person person = NvWa.createPerson(input);

        //拓展，调用抽象产品类中的静态工厂方法
//        Person.createPerson(input);

//        person.move();
    }
}
