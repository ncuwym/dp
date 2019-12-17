package d2.test3;

import java.util.ArrayList;

//具体的文件夹扫描类
public class Folder extends AntiVirus {
    private ArrayList<AntiVirus> fileList = new ArrayList();

    @Override
    public void scan() {
        for (AntiVirus file : fileList) {
            file.scan();
        }
    }

    public void add(AntiVirus file) {
        fileList.add(file);
    }
}
