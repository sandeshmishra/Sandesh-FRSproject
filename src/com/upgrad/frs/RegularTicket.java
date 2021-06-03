package com.upgrad.frs;


	public class RegularTicket extends Tickets {
		private String specialServices;

		public RegularTicket(String pnr, String from, String to, String departureDateTime,
		                     String arrivalDateTime, String seatNo, float price, boolean cancelled,
		                     Flight flight, Passengers passengers, String specialServices) {
			super(pnr, from, to, departureDateTime, arrivalDateTime, seatNo, price, cancelled,
					flight, passengers);
			this.specialServices = specialServices;
		}

		public String getSpecialServices() {
			return specialServices;
		}

		public void setSpecialServices(String specialServices) {
			this.specialServices = specialServices;
		}
	}



