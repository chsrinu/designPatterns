package creational.factory;

public class TvFactory {
    public Television getTelevision(String type){
        switch(type){
            case "TvWithWebCam":
            case "TvWithOTTApps":
            case "TvWithMaxSize":
                return new SmartTv("Hello world.","XIAOMI",64);
            default:
                return new PortableTv("BPL","BPL",24);
        }
    }
}
