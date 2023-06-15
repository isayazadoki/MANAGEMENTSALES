package com.example.selesmanagement.ENTITY;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class SalesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(name = "ProductName")
    private String ProductName;
    @Column(name = "Location")
    private String Location;
    @Column(name = "Email")
    private String Email;
    @Column(name = "Cost")
    private int cost;

}
