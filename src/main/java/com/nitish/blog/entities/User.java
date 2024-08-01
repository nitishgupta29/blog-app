package com.nitish.blog.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

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

   @OneToMany(mappedBy = "user" ,cascade = CascadeType.ALL, fetch=FetchType.LAZY)
   private List<Post> posts=new ArrayList<>();
   
}
