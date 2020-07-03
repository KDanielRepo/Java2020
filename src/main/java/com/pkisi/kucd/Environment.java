package com.pkisi.kucd;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "environment")
public class Environment {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "cost")
    private float cost;
    @ManyToMany(mappedBy = "environment")
    @JsonBackReference
    private List<Users> users;
}
