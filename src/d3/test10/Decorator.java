package d3.test10;
//装饰者类
public class Decorator implements Phone {
    private Phone phone;

    public Decorator(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void voice() {
        System.out.println("铃声");
    }
}
