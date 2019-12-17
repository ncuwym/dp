package d2.test8;
//适配器类Adapter
public class Adapter extends DrawCircle {
    private DrawAngle drawAngle;

    public Adapter(DrawAngle drawAngle) {
        this.drawAngle = drawAngle;
    }

    @Override
    public void drawCircle() {
        drawAngle.drawAngle();
        super.drawCircle();
    }
}
