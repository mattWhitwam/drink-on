/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.co.dwarfsun.drink.on.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;

/**
 *
 * @author Matt
 */
@Embeddable
public class UserDetails implements Serializable{
    private String firstname;
    private String lastname;
    private String phoneNum;
    private String faxNum;
    private int age;
    private char gender;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtJoined;

    public UserDetails() {
        dtJoined = new Date();
    }
    
}
