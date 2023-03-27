package testing;


import model.Bus;
import java.time.LocalDate;
import static org.junit.Assert.*;
import org.junit.Test;
public class Bus {
    private int noOfPersons;
    private String busType;
    private int rates;
    private LocalDate date;

    public Bus(int noOfPersons, String busType, int rates, LocalDate date) {
        this.noOfPersons = noOfPersons;
        this.busType = busType;
        this.rates = rates;
        this.date = date;
    }

    public int getNoOfPersons() {
        return noOfPersons;
    }

    public void setNoOfPersons(int noOfPersons) {
        this.noOfPersons = noOfPersons;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public int getRates() {
        return rates;
    }

    public void setRates(int rates) {
        this.rates = rates;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}

public class extends TestBus {
	LocalDate ld = LocalDate.of(2020, 02, 03);
	Bus bus = new Bus(2, "acsleeper", 1500, ld);

	@Test
	public void testGetNoOfPersonMethod() {
		bus.setNoOfPersons(5);
		assertEquals(5, bus.getNoOfPersons());
		bus.setNoOfPersons(1);
		assertEquals(1, bus.getNoOfPersons());
		try {
			bus.setNoOfPersons(0);
			bus.setNoOfPersons(-5);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetRateMethod() {
		bus.setRates(1300);
		assertEquals(1300, bus.getRates());
		bus.setRates(800);
		assertEquals(800, bus.getRates());
		try {
			bus.setRates(0);
			bus.setRates(-500);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetBusType() {
		bus.setBusType("ACsleeper");
		assertEquals("ACsleeper", bus.getBusType());
		try {
			bus.setBusType(null);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testSetDate() {
		try {
			bus.setDate(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


