package d2.test5;
//外观类
public class MainFrame {
    private Memory memory;
    private CPU cpu;
    private HardDisk hardDisk;
    private OS os;

    public MainFrame() {
       memory = new Memory();
       cpu = new CPU();
       hardDisk = new HardDisk();
       os = new OS();
    }

    public boolean on() {
        memory.check();
        cpu.run();
        hardDisk.read();
        os.load();
        return true;
    }
}
