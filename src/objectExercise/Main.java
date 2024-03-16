package objectExercise;

public class Main {
    public static void main(String[] args){
        Apartment place1 = new Apartment("いい感じアパートメント", "山田 マンション太郎", "マンション", 50000000, "3LDK");

        place1.information();
        
       Land place2 = new Land("いい感じ土地", "土地太郎", "土地", 8000000, 105.2);
        
        place2.information();
    }
}