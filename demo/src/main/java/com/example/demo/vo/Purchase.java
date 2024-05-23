package com.example.demo.vo;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class Purchase {
	
	private String category_value;
	private String product_name;
	private String boxcode;
	private int purchase_count;
	private int purchase_quantity;
	private int store_price;
	private String account_value;
	private Date purchase_date;
	
	// 박스
	private String boxname;
	private int boxcount;

}
