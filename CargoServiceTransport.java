public class CargoServiceTransport extends Transport {
    private Integer noOfcargoUnitsperflight;
    private Integer noOfFlights;

    public CargoServiceTransport(String name, String city, Integer noOfShips, Integer noOfFlights, Integer noOfcargoUnitsperflight) {
        super(name, city, noOfShips);
        this.noOfFlights = noOfFlights;
        this.noOfcargoUnitsperflight = noOfcargoUnitsperflight;
    }

	public Integer getNoOfcargoUnitsperflight() {
		return noOfcargoUnitsperflight;
	}

	public void setNoOfcargoUnitsperflight(Integer noOfcargoUnitsperflight) {
		this.noOfcargoUnitsperflight = noOfcargoUnitsperflight;
	}

	public Integer getNoOfFlights() {
		return noOfFlights;
	}

	public void setNoOfFlights(Integer noOfFlights) {
		this.noOfFlights = noOfFlights;
	}
	public Integer calculatenoOfCargounits() {
        return getNoOfShips() * getNoOfcargoUnitsperflight();
    }


	

}
