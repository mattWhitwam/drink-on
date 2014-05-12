/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.co.dwarfsun.drink.on.domain;

import java.io.Serializable;
import javax.persistence.Embeddable;

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
}
