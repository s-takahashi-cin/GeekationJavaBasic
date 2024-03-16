package objectExercise;

public class Property {
    private String propertyName;
    private String landLord;
    private String propertyType;
    private int price;

    public Property(String propertyName, String landLord, String propertyType, int price) {
        this.propertyName = propertyName;
        this.landLord = landLord;
        this.propertyType = propertyType;
        this.price = price;
    }
    //物件
    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    //所有者名
    public String getLandLord() {
        return landLord;
    }

    public void setLandLord(String landLord) {
        this.landLord = landLord;
    }
    //物件種別
    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }
    
    //価格
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public void information() {
        System.out.println("===============================");
        System.out.println("物件名:" + this.propertyName);
        System.out.println("物件所有者名:" + this.landLord);
        System.out.println("物件種別:" + this.propertyType);
        System.out.println("物件価格:" + this.price + "円");


    }
}