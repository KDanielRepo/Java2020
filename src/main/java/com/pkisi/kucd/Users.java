package com.pkisi.kucd;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "users")
@Data
public class Users {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;
    @Column(name = "nickname")
    private String nickname;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "users")
    List<UserPref> prefs;
    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    @JoinTable(name = "users_environment",joinColumns = {@JoinColumn(name = "users_id",referencedColumnName = "id")},inverseJoinColumns = {@JoinColumn(name = "environment_id",referencedColumnName = "id")})
    private List<Environment> environment;
}
