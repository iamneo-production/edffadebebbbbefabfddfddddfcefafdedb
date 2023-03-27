package testing;



import model.Flight;
import java.time.LocalDate;
import static org.junit.Assert.*;
import org.junit.Test;
public class Flight {

    private int noOfPersons;
    private String classType;
    private int rates;
    private LocalDate from;
    private LocalDate to;
    private String triptype;
    
    public Flight(int noOfPersons, int rates, LocalDate from, LocalDate to, String triptype) {
        this.noOfPersons = noOfPersons;
        this.rates = rates;
        this.from = from;
        this.to = to;
        this.triptype = triptype;
    }
    
    public int getNoOfPersons() {
        return noOfPersons;
    }
    
    public void setNoOfPersons(int noOfPersons) {
        this.noOfPersons = noOfPersons;
    }
    
    public String getClassType() {
        return classType;
    }
    
    public void setClassType(String classType) {
        this.classType = classType;
    }
    
    public int getRates() {
        return rates;
    }
    
    public void setRates(int rates) {
        this.rates = rates;
    }
    
    public LocalDate getFrom() {
        return from;
    }
    
    public void setFrom(LocalDate from) {
        this.from = from;
    }
    
    public LocalDate getTo() {
        return to;
    }
    
    public void setTo(LocalDate to) {
        this.to = to;
    }
    
    public String getTriptype() {
        return triptype;
    }
    
    public void setTriptype(String triptype) {
        this.triptype = triptype;
    }
    
}

public class extends TestFlight {
	LocalDate ld = LocalDate.of(2020, 02, 03);
	LocalDate ld1 = LocalDate.of(2020, 02, 05);
	Flight flight = new Flight(2, "economy", 10000, ld, ld1,"one-way");

	@Test
	public void testGetNoOfPersonMethod() {
		flight.setNoOfPersons(5);
		assertEquals(5, flight.getNoOfPersons());
		flight.setNoOfPersons(1);
		assertEquals(1, flight.getNoOfPersons());
		try {
			flight.setNoOfPersons(0);
			flight.setNoOfPersons(-5);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetRateMethod() {
		flight.setRates(12000);
		assertEquals(12000, flight.getRates());
		flight.setRates(8000);
		assertEquals(8000, flight.getRates());
		try {
			flight.setRates(0);
			flight.setRates(-500);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetClassType() {
		flight.setClassType("economy");
		assertEquals("economy", flight.getClassType());
		try {
			flight.setClassType(null);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testSetDate() {
		try {
			flight.setFrom(null);
			flight.setTo(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


