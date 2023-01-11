package org.example;

public class Main {
    public static void main(String[] args) {

        Ticket T= new Ticket();
        T.setSource("Bangalore");
        T.setDestination("New Delhi");
        T.setNumOfTickets(5);
        T.setModeOfTransportation("Train");

        System.out.println("Enter Source:" +T.getSource());
        System.out.println("Enter Destination:" +T.getDestination());
        System.out.println("Number Of Tickets:" +T.getNumOfTickets());
        System.out.println("Mode Of Transportation:" +T.getModeOfTransportation());
        System.out.println("");

        Ticket T1= new Ticket();
        T1.setSource("Mangalore");
        T1.setDestination("Bangalore");
        T1.setNumOfTickets(3);
        T1.setModeOfTransportation("Bus");

        System.out.println("Enter Source:" +T1.getSource());
        System.out.println("Enter Destination:" +T1.getDestination());
        System.out.println("Number Of Tickets:" +T1.getNumOfTickets());
        System.out.println("Mode Of Transportation:" +T1.getModeOfTransportation());
    }
}