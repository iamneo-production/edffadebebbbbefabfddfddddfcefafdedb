package testing;


import model.Hotel;
import java.time.LocalDate;
import static org.junit.Assert.*;
import org.junit.Test;
public class Hotel {

    private int noOfPersons;
    private String roomType;
    private int rates;
    private String occupancy;
    private LocalDate fromdate;
    private LocalDate todate;
    
    public Hotel(int noOfPersons, String roomType, int rates, String occupancy, LocalDate fromdate, LocalDate todate) {
        this.noOfPersons = noOfPersons;
        this.roomType = roomType;
        this.rates = rates;
        this.occupancy = occupancy;
        this.fromdate = fromdate;
        this.todate = todate;
    }
    
    public int getNoOfPersons() {
        return noOfPersons;
    }
    
    public void setNoOfPersons(int noOfPersons) {
        this.noOfPersons = noOfPersons;
    }
    
    public String getRoomType() {
        return roomType;
    }
    
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
    
    public int getRates() {
        return rates;
    }
    
    public void setRates(int rates) {
        this.rates = rates;
    }
    
    public String getOccupancy() {
        return occupancy;
    }
    
    public void setOccupancy(String occupancy) {
        this.occupancy = occupancy;
    }
    
    public LocalDate getFromdate() {
        return fromdate;
    }
    
    public void setFromdate(LocalDate fromdate) {
        this.fromdate = fromdate;
    }
    
    public LocalDate getTodate() {
        return todate;
    }
    
    public void setTodate(LocalDate todate) {
        this.todate = todate;
    }
    
}
public class extends TestHotel {
	LocalDate ld1 = LocalDate.of(2020, 02, 03);
	LocalDate ld2 = LocalDate.of(2020, 02, 07);
	Hotel hotel = new Hotel(2, "nonac", 20000, "single", ld1, ld2);

	@Test
	public void testGetNoOfPersonMethod() {
		hotel.setNoOfPersons(5);
		assertEquals(5, hotel.getNoOfPersons());
		hotel.setNoOfPersons(1);
		assertEquals(1, hotel.getNoOfPersons());
		try {
			hotel.setNoOfPersons(0);
			hotel.setNoOfPersons(-5);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetRateMethod() {
		hotel.setRates(12000);
		assertEquals(12000, hotel.getRates());
		hotel.setRates(8000);
		assertEquals(8000, hotel.getRates());
		try {
			hotel.setRates(0);
			hotel.setRates(-500);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetRoomType() {
		hotel.setRoomType("ac");
		assertEquals("ac", hotel.getRoomType());
		try {
			hotel.setRoomType(null);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testSetDate() {
		try {
			hotel.setFromdate(null);
			hotel.setTodate(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

