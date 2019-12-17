package d3.test8;
//测试类
public class Test8 {
    public static void main(String[] args) {
        ComputerStrategy computerStrategy = new ComputerStrategy();
        LanguageStrategy languageStrategy = new LanguageStrategy();
        NovelStrategy novelStrategy = new NovelStrategy();
        System.out.println(new SumPrice(computerStrategy).sum(100));
        System.out.println(new SumPrice(languageStrategy).sum(100));
        System.out.println(new SumPrice(novelStrategy).sum(110));
    }
}
