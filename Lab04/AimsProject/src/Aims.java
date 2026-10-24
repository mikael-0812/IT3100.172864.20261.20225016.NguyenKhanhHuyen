
public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc(
                "The Lion King", "Animation",
                "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);


		DigitalVideoDisc dvd2 = new DigitalVideoDisc(
		        "Science Fiction", "Star Wars", 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc(
		        "Animation", "Aladin", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);


        System.out.println("Cart before removing:");
        anOrder.printCart();

        anOrder.removeDigitalVideoDisc(dvd2);

        System.out.println("Cart after removing:");
        anOrder.printCart();
        

		DigitalVideoDisc dvd4 = new DigitalVideoDisc(
		        "Action", "Avengers", 29.99f);
		
		DigitalVideoDisc dvd5 = new DigitalVideoDisc(
		        "Drama", "Titanic", 15.50f);
		
		DigitalVideoDisc dvd6 = new DigitalVideoDisc(
		        "Animation", "Frozen", 12.99f);
		
		DigitalVideoDisc[] dvdList = {dvd4, dvd5};
		
		anOrder.addDigitalVideoDisc(dvdList);
		anOrder.addDigitalVideoDisc(dvd6, dvd4);
		
		System.out.println("Cart after overloading:");
		anOrder.printCart();

		System.out.println("DVD 1 ID: " + dvd1.getId());
		System.out.println("DVD 2 ID: " + dvd2.getId());
		System.out.println("DVD 3 ID: " + dvd3.getId());
		
		System.out.println("Total DVDs created: "
		        + DigitalVideoDisc.getNbDigitalVideoDiscs());


    }
}
