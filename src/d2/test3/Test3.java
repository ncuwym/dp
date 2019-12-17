package d2.test3;
//测试类
public class Test3 {
    public static void main(String[] args) {
        AntiVirus text,image,video,textFile;
        Folder parentFolder,childFolder;
        text = new TextFile();
        image = new ImageFile();
        video = new VideoFile();
        textFile = new TextFile();
        parentFolder = new Folder();
        childFolder = new Folder();
        //给子容器加叶子
        childFolder.add(video);
        childFolder.add(image);
        childFolder.add(text);
        //给父容器加叶子和子容器
        parentFolder.add(childFolder);
        parentFolder.add(textFile);
        parentFolder.scan();
    }
}
