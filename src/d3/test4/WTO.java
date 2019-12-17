package d3.test4;

//具体中介者类，实现
public class WTO extends UN {
    private China china;
    private American american;

    public void setChina(China china) {
        this.china = china;
    }

    public void setAmerican(American american) {
        this.american = american;
    }

    @Override
    public void sendMessage(String message, Country country) {
        if (country == china) {
            american.getMessage(message);
        } else {
            china.getMessage(message);
        }
    }
}
