package com.upgrad.frs;
import java.time.LocalDateTime;
	public abstract class Tickets {
		private String pnr;
		private String from;
		private String to;
		private String departureDateTime;
		private String arrivalDateTime;
		private String seatNo;
		private float price;
		private boolean cancelled;
		private Flight flight;
		private Passengers passengers;

		public Tickets(String pnr, String from, String to, String departureDateTime,
		              String arrivalDateTime, String seatNo, float price, boolean cancelled,
		              Flight flight, Passengers passenger) {
			this.pnr = pnr;
			this.from = from;
			this.to = to;
			this.departureDateTime = departureDateTime;
			this.arrivalDateTime = arrivalDateTime;
			this.seatNo = seatNo;
			this.price = price;
			this.cancelled = cancelled;
			this.flight = flight;
			this.passengers = passengers;
		}

		public String checkStatus() {
			return cancelled ? "Cancelled" : "Confirmed";
		}

		public int getFlightDuration() {
			LocalDateTime departureLocalDateTime = LocalDateTime.parse(departureDateTime);
			LocalDateTime arrivalLocalDateTime = LocalDateTime.parse(arrivalDateTime);
			return (arrivalLocalDateTime.getDayOfMonth() - departureLocalDateTime.getDayOfMonth()) * 24 +
					(arrivalLocalDateTime.getHour() - departureLocalDateTime.getHour());
		}

		public void cancel() {
			cancelled = true;
		}

		public String getPnr() {
			return pnr;
		}

		public void setPnr(String pnr) {
			this.pnr = pnr;
		}

		public String getFrom() {
			return from;
		}

		public void setFrom(String from) {
			this.from = from;
		}

		public String getTo() {
			return to;
		}

		public void setTo(String to) {
			this.to = to;
		}

		public String getDepartureDateTime() {
			return departureDateTime;
		}

		public void setDepartureDateTime(String departureDateTime) {
			this.departureDateTime = departureDateTime;
		}

		public String getArrivalDateTime() {
			return arrivalDateTime;
		}

		public void setArrivalDateTime(String arrivalDateTime) {
			this.arrivalDateTime = arrivalDateTime;
		}

		public String getSeatNo() {
			return seatNo;
		}

		public void setSeatNo(String seatNo) {
			this.seatNo = seatNo;
		}

		public float getPrice() {
			return price;
		}

		public void setPrice(float price) {
			this.price = price;
		}

		public boolean isCancelled() {
			return cancelled;
		}

		public void setCancelled(boolean cancelled) {
			this.cancelled = cancelled;
		}

		public Flight getFlight() {
			return flight;
		}

		public void setFlight(Flight flight) {
			this.flight = flight;
		}

		public Passengers getPassengers() {
			return passengers;
		}

		public void setPassengers(Passengers passengers) {
			this.passengers = passengers;
		}
	}


