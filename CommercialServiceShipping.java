
public class CommercialServiceShipping extends Transport {
    private Integer noOfPassengers;

    public CommercialServiceShipping(String name, String city, Integer noOfShips, Integer noOfPassengers) {
        super(name, city, noOfShips);
        this.noOfPassengers = noOfPassengers;
    }

   

	public Integer getNoOfPassengers() {
		return noOfPassengers;
	}

	public void setNoOfPassengers(Integer noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}
	Integer calculatenoOfPassengers() {
		return getNoOfShips() * getNoOfPassengers();
		
		
	}

}
