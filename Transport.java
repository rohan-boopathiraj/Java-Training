package Assingment6;

import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;

class CalculateArrival {
	int totalHours, totalHoursLeft, hoursLeft, daysLeft, holiday;
	LocalDateTime dateTime =  LocalDateTime.now();
	DayOfWeek dayOfWeek = dateTime.getDayOfWeek();
	DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");

	public CalculateArrival(LocalDateTime localDate) {
		this.dateTime = localDate;
	}

	boolean isHoliday(LocalDateTime holidayDateTime) {
		return (dateTime.getDayOfWeek() == DayOfWeek.SUNDAY
				|| (dateTime.getDayOfWeek() == DayOfWeek.SATURDAY)
						&& (dateTime.getDayOfMonth() > 7 && dateTime.getDayOfMonth() <= 15)
				|| (dateTime.getMonthValue() == 1 && dateTime.getDayOfMonth() == 26)
				|| (dateTime.getMonthValue() == 8 && dateTime.getDayOfMonth() == 15))
				|| (dateTime.getMonthValue() == 1 && dateTime.getDayOfMonth() == 1);
	}

	void getArrival(int distance, int speed) {
		totalHours = distance / speed;
		totalHoursLeft = totalHours % 8;
		hoursLeft = 23 - dateTime.getHour();
		if (hoursLeft < 8)
			System.out.println("Departure Date is:" + dateTime.plusDays(1).format(dateTimeFormat));
		else {
//			dateTime = dateTime.minusDays(1);
			System.out.println("Departure Date is:" + dateTime.format(dateTimeFormat));
		}

		while ((totalHours / 8 > daysLeft)) {
			

			if (isHoliday(dateTime))
				holiday++;
			daysLeft++;
			dateTime = dateTime.plusDays(1);
			
		}

		dateTime = dateTime.plusDays(holiday).plusHours(totalHoursLeft);
		System.out.println("Arrival Date is:" + dateTime.format(dateTimeFormat));

	}
}

public class Transport {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int speed;
		int distance;
		LocalTime localTime;
		LocalDate localDate;
		LocalDateTime dateTime;
		try {
			System.out.println("Enter the speed of the vehicle");
			speed = scanner.nextInt();
			
			System.out.println("Enter the distance to be covered");
			distance = scanner.nextInt();
			
			System.out.println("Enter the date of lorry's departure");
			localDate = LocalDate.parse(scanner.next());
			
			System.out.println("Enter the time of the departure");
			localTime = LocalTime.parse(scanner.next());
			
			dateTime = LocalDateTime.parse(localDate + "T" + localTime);

			CalculateArrival calArrival = new CalculateArrival(dateTime);
			calArrival.getArrival(distance, speed);
			
		} catch (Exception e) {
			System.out.println("Invalid input format");
		}
	}
}