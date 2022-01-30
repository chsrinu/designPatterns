package creational.factory;

public class PortableTv implements Television{

    private final String welcomeMessage;
    private final String brandName;
    private final int sizeInInches;

    protected PortableTv(String welcomeMessage, String brandName, int sizeInInches){
        this.welcomeMessage = welcomeMessage;
        this.brandName = brandName;
        this.sizeInInches = sizeInInches;
    }
    @Override
    public String powerOn() {
        return this.welcomeMessage;
    }

    @Override
    public String getBrandName() {
        return this.brandName;
    }

    @Override
    public Integer getSizeInInches() {
        return this.sizeInInches;
    }

    @Override
    public String toString(){
        return String.format("Power-on message:%s, brandName:%s, sizeInInches:'%s",this.welcomeMessage,this.brandName,
                this.sizeInInches);
    }
}
