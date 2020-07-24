package com.lucas.practice.api.entities;

import java.time.LocalDateTime;

public class BaseModel {
	protected LocalDateTime CreatedAt;
	protected LocalDateTime UpdatedAt;
	
	
	public LocalDateTime getCreatedAt() { return this.CreatedAt; }
	public void setCreatedAt(LocalDateTime date) { this.CreatedAt = date; }
	
	public LocalDateTime getUpdatedAt() { return this.UpdatedAt; }
	public void setUpdatedAt(LocalDateTime date) { this.UpdatedAt = date; }
	
	public BaseModel() 
	{
		this.setUpdatedAt(LocalDateTime.now());
		
		if(this.CreatedAt != null) 
		{
			this.setCreatedAt(this.CreatedAt);
		}
		else 
		{
			this.setCreatedAt(LocalDateTime.now());
		}
	
	}
}
