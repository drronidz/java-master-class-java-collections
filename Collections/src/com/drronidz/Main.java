package com.drronidz;/*
    CREATED BY : ABD EL HALIM
    PROJECT NAME : {IntelliJ IDEA}
    CREATED ON : 4/22/2021 , 
    CREATED ON : 6:37 PM
*/

import com.drronidz.Theatre.Seat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);
        theatre.getSeats();

        if(theatre.reservedSeat("D12")) {
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Sorry, seat is taken");
        }

        if(theatre.reservedSeat("B13")) {
            System.out.println("Please pay for B13");
        } else {
            System.out.println("Sorry, seat is taken");
        }

        List<Theatre.Seat> reverseSeats = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00", 13.00));
        priceSeats.add(theatre.new Seat("A00", 13));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);
    }

    public static void printList(List<Seat> seats) {
        for (Seat seat: seats) {
            if(seat.getSeatNumber().contains("12")) {
                System.out.println();
            }
            System.out.print(" " + seat.getSeatNumber() + " $" + seat.getPrice());
        }
        System.out.println();
        System.out.println("===============================================================");
    }

}
