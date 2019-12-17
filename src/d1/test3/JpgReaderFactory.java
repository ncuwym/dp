package d1.test3;

//具体Jpg读取器工厂类，负责生产Jpg读取器
public class JpgReaderFactory extends ImageReaderFactory {

    public JpgReaderFactory() {
        System.out.println("Jpg读取器工厂创建成功");
    }

    @Override
    public ImageReader createImageReader() {
        return new JpgReader();
    }
}
