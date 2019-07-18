package com.aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.model.entities.Reservation;

public class Main {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Room number: ");
		int roomNumber = sc.nextInt();
		System.out.println("Check in (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.println("Check out (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());

		if (checkIn.after(checkOut)) {
			System.out.println("Check-out date must be after check-in date");

		} else {
			Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println(reservation);
			System.out.println("=======================================");
			System.out.println("Enter data to update reservation: ");
			System.out.println("Check in (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.println("Check out (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			reservation.updateDates(checkIn, checkOut);
			System.out.println(reservation);
		}
		sc.close();
	}

}
