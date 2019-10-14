package com.infy.basic.example.model;

import javax.validation.constraints.NotNull;

import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.stereotype.Component;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;

@Component
@Document
public class Topic {

	@Id
	private String Id;
	
	@Field
	@NotNull
	private String name;
	
	@Field
	@NotNull
	private String description;

	public Topic() {
		super();
	}	
	
	public Topic(String id, String name, String description) {
		super();
		Id = id;
		this.name = name;
		this.description = description;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
