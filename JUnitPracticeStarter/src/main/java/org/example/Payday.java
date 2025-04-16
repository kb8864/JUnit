package org.example;

import java.time.LocalDate;

public class Payday {
	private LocalDate date;
	private final int PAYDAY_TIME = 25;

//	LocalDate を引数に持つコンストラクタを作成し、引数で受け取った LocalDate をフィールドの
//	date に設定
	public Payday(LocalDate date) {
		this.date = date;
	}

	//	デフォルトコンストラクタ
	public Payday(){
//		this.date = LocalDate.now();
		this(LocalDate.now());
	}


	public int getNextPayday(){
		int today = date.getDayOfMonth();
		if(today > PAYDAY_TIME) {
			return date.getMonth().maxLength() - today + PAYDAY_TIME;
		} else {
			return PAYDAY_TIME - today;
		}
	}
}
