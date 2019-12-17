package d1.test3;
//具体产品Gif读取器类
public class GifReader extends ImageReader {

    public GifReader() {
        System.out.println("Gif读取器生产成功");
    }
    @Override
    public void read() {
        System.out.println("Gif图片读取成功");
    }
}
