package com.nitish.blog.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_table")
public class User {
	
   @Id
   @GeneratedValue
   private int id;
   
   @Column (name = "user_name", nullable = false, length = 100)
   private String name;
   
   private String email;
   private String password;
   private String about;
   
}
