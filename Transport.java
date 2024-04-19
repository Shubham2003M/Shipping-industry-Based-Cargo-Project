
public class Transport {
	public String Name;
	public String city;
	public Integer noOfShips;


	public Transport(String Name,String city,Integer noOfShips) {
		// TODO Auto-generated constructor stub
		this.Name=Name;
		this.city=city;
		this.noOfShips=noOfShips;
	}


	public Transport() {
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public Integer getNoOfShips() {
		return noOfShips;
	}


	public void setNoOfShips(Integer noOfShips) {
		this.noOfShips = noOfShips;
	}
	

}
