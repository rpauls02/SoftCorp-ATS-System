package ticket;

import java.sql.Time;
import java.util.Date;

public class Itinerary {

	private String airline;
	private String flightNumber;
	private String departure;
	private Date departureDate;
	private Time departureTime;
	private String arrival;
	private Date arrivalDate;
	private Time arrivalTime;
	private String seatNumber;

	/**
	 * For each ticket created, an itinerary is required that will store the details of the customer's flight
	 * This has been designed according to the Initial Statement of Requirements provided by AirVia LTD
	 * @param airline Airline hosting flight
	 * @param flightNumber Number of flight hosted by airline
	 * @param departure Departure location
	 * @param departureDate Date of departure
	 * @param departureTime Time of departure
	 * @param arrival Arrival location
	 * @param arrivalDate Date of arrival
	 * @param arrivalTime Time of arrival
	 * @param seatNumber Customer's seat number on flight
	 */
	public Itinerary(String airline, String flightNumber, String departure, Date departureDate, Time departureTime,
					 String arrival, Date arrivalDate, Time arrivalTime, String outgoing, String incoming,
					 String seatNumber) {
		this.airline = airline;
		this.flightNumber = flightNumber;
		this.departure = departure;
		this.departureDate = departureDate;
		this.departureTime = departureTime;
		this.arrival = arrival;
		this.arrivalDate = arrivalDate;
		this.arrivalTime = arrivalTime;
		this.seatNumber = seatNumber;
	}

	/**
	 * Returns hosting airline of customer's flight
	 * @return Airline hosting customer's flight
	 */
	public String getAirline() {
		return airline;
	}

	/**
	 * Sets hosting airline of flight for customer's ticket
	 * @param airline Hosting airline
	 */
	public void setAirline(String airline) {
		this.airline = airline;
	}

	/**
	 * Returns flight number of customer's flight
	 * @return Flight number of a flight
	 */
	public String getFlightNumber() {
		return flightNumber;
	}

	/**
	 * Sets flight number for customer's ticket
	 * @param flightNumber Flight number for ticket
	 */
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	/**
	 * Returns departure location of customer's flight
	 * @return Departure location
	 */
	public String getDeparture() {
		return departure;
	}

	/**
	 * Sets location of departure
	 * @param departure Location of departure
	 */
	public void setDeparture(String departure) {
		this.departure = departure;
	}

	/**
	 * Returns departure date of a flight
	 * @return Date of departure of customer's flight
	 */
	public Date getDepartureDate() {
		return departureDate;
	}

	/**
	 * Sets departure date of flight
	 * @param departureDate Date of departure of flight
	 */
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	/**
	 * Returns departure time of a flight
	 * @return Time of departure of customer's flight
	 */
	public Time getDepartureTime() {
		return departureTime;
	}

	/**
	 * Sets departure time of flight
	 * @param departureTime Time of departure of flight
	 */
	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}

	/**
	 * Returns arrival location of customer's flight
	 * @return Arrival location
	 */
	public String getArrival() {
		return arrival;
	}

	/**
	 * Sets location of arrival
	 * @param arrival Location of arrival
	 */
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	/**
	 * Returns arrival date of a flight
	 * @return Time of arrival of customer's flight
	 */
	public Date getArrivalDate() {
		return arrivalDate;
	}

	/**
	 * Sets date of arrival for flight
	 * @param arrivalDate Arrival date of flight
	 */
	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	/**
	 * Returns arrival time of a flight
	 * @return Time of arrival of customer's flight
	 */
	public Time getArrivalTime() {
		return arrivalTime;
	}

	/**
	 * Sets time of arrival for flight
	 * @param arrivalTime Arrival time of flight
	 */
	public void setArrivalTime(Time arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	/**
	 * Returns seat number for customer during flight
	 * @return Customer seat number
	 */
	public String getSeatNumber() {
		return seatNumber;
	}

	/**
	 * Sets seat number during flight for customer
	 * @param seatNumber Number of seat
	 */
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
}