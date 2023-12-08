package hus.oop.design_patterns.builderPattern;
public class SmartHome {
    private final String name;
    private final int serialNumber;
    private final String addressName;
    private final String city;
    private final String country;
    private final String postalCode;
    private final int light1PortNum;
    private final int light2PortNum;
    private final int door1PortNum;
    private final int door2PortNum;
    private final int microwavePortNum;
    private final int tvPortNum;
    private final int waterHeaterPortNum;

    SmartHome(String name, int serialNumber, String addressName, String city, String country, String postalCode,
              int light1PortNum, int light2PortNum, int door1PortNum, int door2PortNum,
              int microwavePortNum, int tvPortNum, int waterHeaterPortNum) {
        this.name = name;
        this.serialNumber = serialNumber;
        this.addressName = addressName;
        this.city = city;
        this.country = country;
        this.postalCode = postalCode;
        this.light1PortNum = light1PortNum;
        this.light2PortNum = light2PortNum;
        this.door1PortNum = door1PortNum;
        this.door2PortNum = door2PortNum;
        this.microwavePortNum = microwavePortNum;
        this.tvPortNum = tvPortNum;
        this.waterHeaterPortNum = waterHeaterPortNum;
    }

    public String toString() {
        return "SmartHome{" +
                "name='" + name + '\'' +
                ", serialNumber=" + serialNumber +
                ", addressName='" + addressName + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", light1PortNum=" + light1PortNum +
                ", light2PortNum=" + light2PortNum +
                ", door1PortNum=" + door1PortNum +
                ", door2PortNum=" + door2PortNum +
                ", microwavePortNum=" + microwavePortNum +
                ", tvPortNum=" + tvPortNum +
                ", waterHeaterPortNum=" + waterHeaterPortNum +
                '}';
    }
}