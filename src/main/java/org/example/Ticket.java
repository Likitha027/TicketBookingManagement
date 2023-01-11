package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter@Getter@NoArgsConstructor@AllArgsConstructor
public class Ticket
{
    String Source;
    String Destination;
    Integer NumOfTickets;
    String ModeOfTransportation;
}
