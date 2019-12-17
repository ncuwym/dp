package d3.test4;

//测试类
public class Test4 {
    public static void main(String[] args) {

        WTO wto = new WTO();
        China china = new China();
        American american = new American();
        //中美加入wto
        china.setUnitedNation(wto);
        american.setUnitedNation(wto);
        //设值注入，对wto中的China，American实例赋值
        wto.setChina(china);
        wto.setAmerican(american);

        china.sendMessage("中方请求合作发展");
        american.sendMessage("美方抵制华为");

    }
}
