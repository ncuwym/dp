package d1.test3;
//具体产品类，Jpg读取器
public class JpgReader extends ImageReader {
    public JpgReader() {
        System.out.println("Jpg读取器生产成功");
    }

    @Override
    public void read() {
        System.out.println("Jpg图片读取成功");
    }
}
