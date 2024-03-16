package objectExercise;

public class Apartment extends Property {
	private String layout;
	
    Apartment (String propertyName, String landLord, String propertyType, int price, String layout) {
    	super(propertyName, landLord, propertyType, price); 
    	this.layout = layout;
    }
    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    @Override
    public void information() {
        super.information();
        System.out.println("間取り:" + this.layout);
        System.out.println("===============================");
    }

}