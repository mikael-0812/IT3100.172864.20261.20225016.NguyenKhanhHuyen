
public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;

    private DigitalVideoDisc[] itemsOrdered =
            new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is full!");
            return;
        }

        itemsOrdered[qtyOrdered] = disc;
        qtyOrdered++;

        System.out.println("The disc has been added.");

        if (qtyOrdered == MAX_NUMBERS_ORDERED - 1) {
            System.out.println("The cart is almost full.");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }

                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;

                System.out.println("The disc has been removed.");
                return;
            }
        }

        System.out.println("The disc was not found.");
    }

    public float totalCost() {
        float total = 0;

        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }

        return total;
    }

	public void printCart() {
	    for (int i = 0; i < qtyOrdered; i++) {
	        System.out.printf("%d. %s - %.2f%n",
	                i + 1,
	                itemsOrdered[i].getTitle(),
	                itemsOrdered[i].getCost());
	    }
	
	    System.out.printf("Total Cost is: %.2f%n", totalCost());
	}

//	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
//	    for (DigitalVideoDisc dvd : dvdList) {
//	        addDigitalVideoDisc(dvd);
//	    }
//	}
	

	public void addDigitalVideoDisc(DigitalVideoDisc... dvds) {
	    for (DigitalVideoDisc dvd : dvds) {
	        addDigitalVideoDisc(dvd);
	    }
	}

	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
	    addDigitalVideoDisc(dvd1);
	    addDigitalVideoDisc(dvd2);
	}


}
