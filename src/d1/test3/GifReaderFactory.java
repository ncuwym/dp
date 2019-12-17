package d1.test3;
//具体工厂类，Gif图片读取器工厂，负责生产Gif图片读取器
public class GifReaderFactory extends ImageReaderFactory {

    public GifReaderFactory() {
        System.out.println("Gif读取器工厂创建成功");
    }

    @Override
    public ImageReader createImageReader() {
        return new GifReader();
    }
}
