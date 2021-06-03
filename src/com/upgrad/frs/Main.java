package com.upgrad.frs;

public class Main {

    public static void main(String[] args) {
        Tickets regularTicket = new RegularTicket("123456", "Agra",
                "Punjab", "DepartureDateTime", "ArrivalDateTime",
                "10B", 5000, false, null, null, "lunch");

        Tickets touristTicket = new TouristTicket("87598", "Singapore", "Australia",
                "DepartureDateTime", "ArrivalDateTIme",
                "10Y", 90000, false, null, null,
                "Australian Hotel", new String[]{""});

        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }

    public static void printTicketDetails(Tickets tickets) {
        System.out.println(tickets.getPnr());
    }

}
