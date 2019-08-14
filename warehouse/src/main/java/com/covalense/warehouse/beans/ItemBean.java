package com.covalense.warehouse.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="items")
public class ItemBean {

	@Id
	int item_id ;
	String item_name;
	String description;
	double cost;
	 int quantity ;
}
