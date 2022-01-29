package creational.builder;

/* Immutable class */
public class User {
    //mandatory param**
    private String firstName;
    private String middleName;
    //mandatory param**
    private String lastName;
    private String cityName;
    private String state;
    private String houseNumber;
    private String pinNumber;
    private String country;

    private User(UserBuilder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.middleName = builder.middleName;
        this.cityName = builder.cityName;
        this.state = builder.state;
        this.houseNumber = builder.houseNumber;
        this.pinNumber = builder.pinNumber;
        this.country = builder.country;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCityName() {
        return cityName;
    }

    public String getState() {
        return state;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getPinNumber() {
        return pinNumber;
    }

    public String getCountry() {
        return country;
    }

    public String toString(){
        return String.format("firstName:%s, lastName:%s, " +
                "middleName:%s, houseNumber:%s, city:%s, state:%s, pinNumber:%s, country:%s",firstName,lastName,middleName,
                houseNumber,cityName,state,pinNumber,country);
    }
    /*Builder helps in maintaining user object's immutability while ensuring no monstrous constructor or constructor
    * methods explosiion happens */
    public static class UserBuilder{
            private String firstName;
            private String middleName;
            private String lastName;
            private String cityName;
            private String state;
            private String houseNumber;
            private String pinNumber;
            private String country;
            private User user;

            public UserBuilder(String firstName,String lastName){
                this.firstName = firstName;
                this.lastName = lastName;
            }

            public UserBuilder setMiddleName(String middleName) {
                this.middleName = middleName;
                return this;
            }

            public UserBuilder setCityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            public UserBuilder setState(String state) {
                this.state = state;
                return this;
            }

            public UserBuilder setHouseNumber(String houseNumber) {
                this.houseNumber = houseNumber;
                return this;
            }

            public UserBuilder setPinNumber(String pinNumber) {
                this.pinNumber = pinNumber;
                return this;
            }

            public UserBuilder setCountry(String country) {
                this.country = country;
                return this;
            }

            public User build() {
                return new User(this);
            }
    }
}
