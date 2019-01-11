package componets;

public class GPSNavigator {

    private String rout;

    public GPSNavigator() {
        this.rout = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }

    public GPSNavigator(String manualRout) {
        this.rout = manualRout;
    }

    public String getRout(){
        return rout;
    }
}
