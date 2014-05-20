/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.co.dwarfsun.drink.on.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Matt
 */
@Entity
public class Recipe implements Serializable {
    @OneToMany(mappedBy = "recipe")
    private List<RecipeRating> recipeRatings;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String title;
    private String dsc;
    @Temporal(javax.persistence.TemporalType.DATE)
    private final Date dtAdded;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="id")
    List<RecipeLine> line;
    @OneToOne
    private ImageFile img;

    public Recipe() {
        dtAdded = new Date();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDsc() {
        return dsc;
    }

    public void setDsc(String dsc) {
        this.dsc = dsc;
    }

    public List<RecipeLine> getLine() {
        return line;
    }

    public void setLine(List<RecipeLine> line) {
        this.line = line;
    }

    public ImageFile getImg() {
        return img;
    }

    public void setImg(ImageFile img) {
        this.img = img;
    }
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Recipe)) {
            return false;
        }
        Recipe other = (Recipe) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.co.dwarfsun.drink.on.domain.Recipe[ id=" + id + " ]";
    }
    
}
