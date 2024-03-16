package objectExercise;

public class Land extends Property {
	private double space;
	
    Land (String propertyName, String landLord, String propertyType, int price, double space) {
    	super(propertyName, landLord, propertyType, price); 
    	this.space = space;
    }
    public double getSpace() {
        return space;
    }

    public void setSpace(double space) {
        this.space = space;
    }

    @Override
    public void information() {
        super.information();
        System.out.println("広さ:" + this.space + "㎡");
        System.out.println("===============================");
    }

}