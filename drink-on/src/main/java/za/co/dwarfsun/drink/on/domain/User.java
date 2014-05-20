/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.co.dwarfsun.drink.on.domain;

import java.io.Serializable;
import java.util.List;
//import java.util.List;
//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;

/**
 *
 * @author Matt
 */
@Entity
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique=true)
    private String nick;
    @Column(unique = true)
    private String email;
    @Embedded
    private UserDetails details;
    @OneToMany(mappedBy = "usr")
    private List<RecipeRating> recipeRatings;

    public User() {
    }
    
    private User(Builder builder) {
        id = builder.id;
        nick = builder.nick;
        email = builder.email;
        details = builder.details;
    }
    
    public static class Builder {
        private Long id;
        private String nick;
        private String email;
        private UserDetails details;
    }    

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public String getNick() {
        return nick;
    }

    public String getEmail() {
        return email;
    }

    public UserDetails getDetails() {
        return details;
    }
    
    
}
