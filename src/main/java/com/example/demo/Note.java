package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="notes")
public class Note 
{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column
private int id;
@Column
private String notes;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNotes() {
	return notes;
}
public void setNotes(String notes) {
	this.notes = notes;
}

}
