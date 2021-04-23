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

        if(theatre.reserveSeatBinarySearch("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }

        if(theatre.reservedSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }

        System.out.println("****************************************************************");

        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
        printList(seatCopy);

        seatCopy.get(1).reserve();
        if(theatre.reservedSeat("A02")) {
            System.out.println("Please pay for A02");
        } else {
            System.out.println("Seat already reserved");
        }

        Collections.reverse(seatCopy);
        System.out.println("Printing seatCopy (Reversed version) ");
        printList(seatCopy);

        System.out.println("Printing theatre.seat (Normal Version) ");
        printList(theatre.seats);

        System.out.println("Printing seatCopy (Shuffle version) ");
        Collections.shuffle(seatCopy);
        printList(seatCopy);

        Seat minSeat = Collections.min(seatCopy);
        System.out.println("Min seat number is " +minSeat.getSeatNumber());

        Seat maxSeat = Collections.max(seatCopy);
        System.out.println("Min seat number is " +maxSeat.getSeatNumber());

        sortList(seatCopy);
        System.out.println("Printing seatCopy (sorted version) ");
        printList(seatCopy);
    }

    public static void printList(List<Seat> seats) {
        for (Seat seat: seats) {
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("===============================================================");
    }
    
    public static void sortList(List<? extends Seat> seats){
        for (int i = 0 ; i < seats.size() - 1 ; i++) {
            for (int j = i+1 ; j < seats.size() ; j++) {
                if(seats.get(i).compareTo(seats.get(j)) >0) {
                    Collections.swap(seats, i, j);
                }
            }
        }
    }
}
