package org.example;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;


class BusinessDayServiceTest {
    private final BusinessDayService service = new BusinessDayService();

    @Test
    public void testIsBusinessDay() {
    	BusinessDayService service = new BusinessDayService();
    	boolean actual = service.isBusinessDay(LocalDate.of(2022, 10, 20));

    	assertTrue(actual);

	}

    @Test
    public void testHolidayIsNotBusinessDay() {
    	BusinessDayService service = new BusinessDayService();
    	boolean actual = service.isBusinessDay(LocalDate.of(2022, 11, 3));
    	assertFalse(actual);
	}

    @Test
    private void testSaturdayIsNotBusinessDay() {
    	BusinessDayService service = new BusinessDayService();
    	// テスト対象のメソッドに、土曜日の日付を渡す
    	boolean actual = service.isBusinessDay(LocalDate.of(2022, 12,17));
    	// 土曜日は営業日ではないので、falseが返るはず
    	assertFalse(actual);

	}

    @Test
    private void testSundayIsNotBusinessDay () {
    	BusinessDayService service = new BusinessDayService();
    	boolean actual = service.isBusinessDay(LocalDate.of(2022, 12, 25));
    	assertFalse(actual);
    }


}
