package com.mma.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Profile {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String username;
    private LocalDate dob;

    @ElementCollection
    @CollectionTable(name = "fight_style", joinColumns = @JoinColumn(name = "id"))
    @Column(name="fightstyle")
    private List<String> fightStyle;

    @Embedded
    private Country country;

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public List<String> getFightStyle() {return fightStyle;}

    public void setFightStyle(List<String> fightStyle) { this.fightStyle = fightStyle; }

    public Country getCountry() { return country; }

    public void setCountry(Country country) { this.country = country; }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", dob=" + dob +
                ", fightStyle=" + fightStyle +
                ", country=" + country +
                '}';
    }
}
