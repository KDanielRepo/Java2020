package com.pkisi.kucd;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "userpref")
public class UserPref {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "userID")
    private Integer userId;
    @Column(name = "color")
    private String color;
    @Column(name = "type")
    private String type;
    @ManyToOne
    @JoinColumn(name = "userID",insertable = false, updatable = false)
    @JsonBackReference
    private Users users;
}
