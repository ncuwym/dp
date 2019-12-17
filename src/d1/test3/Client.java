package d1.test3;

import d1.tools.XMLUtil;

//客户端类
public class Client {
    public static void main(String[] args) {
        ImageReaderFactory imageReaderFactory;
        ImageReader imageReader;
        imageReaderFactory = (ImageReaderFactory) XMLUtil.getBean();
        imageReader = imageReaderFactory.createImageReader();
        imageReader.read();
    }
}
