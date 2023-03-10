package calendar01;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateTime07 {

	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		
		LocalDateTime startDT = LocalDateTime.of(2023,02,8,9,30,0);
		LocalDateTime endDT = LocalDateTime.of(2023,07,20,18,20,30);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd a hh:mm:ss");
		
		System.out.println("시작일 : " + startDT.format(dtf));
		System.out.println("종료일 : " + startDT.format(dtf));
		
		if(today.isBefore(endDT)) {
			System.out.println("진행 중 입니다");
		} else if(today.isEqual(endDT)) {	// equals도 사용가능
			System.out.println("종료합니다");
		} else if(today.isAfter(endDT)) {
			System.out.println("종료했습니다");
		}
		
		// 날짜만 가능
		LocalDate today2 = LocalDate.now();
		LocalDate endToday = LocalDate.of(2023,07,20);
		Period period = today2.until(endToday);
		System.out.printf("%d개월 %d일 남음\n", period.getMonths(), period.getDays());
		System.out.println();
		
		// 시간에서만 사용
		LocalTime endTime = LocalTime.of(18, 20, 30);
		LocalTime now = LocalTime.now();
		
		Duration duration = Duration.between(now, endTime);
		System.out.println(duration.getSeconds());
		
		// 날짜 시간 모두 가능
		System.out.println("오늘 종료시간까지 " + now.until(endTime, ChronoUnit.HOURS) + "시간 남음");
		System.out.println("----------------------------");
		
		System.out.println("종료일까지 " + today.until(endDT, ChronoUnit.MONTHS) + "개월 남음");
		System.out.println("종료일까지 " + today.until(endDT, ChronoUnit.DAYS) + "일 남음");
		System.out.println("종료일까지 " + today.until(endDT, ChronoUnit.HOURS) + "시간 남음");
		System.out.println("----------------------------");
		
		System.out.println(today.plusYears(1).format(dtf));
		System.out.println(today.plusMonths(3).format(dtf));
		System.out.println(today.plusDays(15).format(dtf));
		System.out.println("----------------------------");

		System.out.println(today.minusYears(1).format(dtf));
		System.out.println(today.minusMonths(3).format(dtf));
		System.out.println(today.minusDays(15).format(dtf));
		System.out.println(today.minusSeconds(30).format(dtf));
	}
}
