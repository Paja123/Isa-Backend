package rs.ac.uns.ftn.informatika.jpa.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @OneToMany(mappedBy="company",fetch = FetchType.EAGER)
    private List<Equipment> equipment;
    @Column
    private String description;

    @OneToOne
    private Location location;
    @Column
    private Date openingTime;

    @Column
    private Date closingTime;

    @Column
    private Double averageScore;

    public Company() {
    }

    public Company(Integer id, String name, String description, Date openingTime, Date closingTime, Double averageScore) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.averageScore = averageScore;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(Date openingTime) {
        this.openingTime = openingTime;
    }

    public Date getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(Date closingTime) {
        this.closingTime = closingTime;
    }

    public Double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(Double averageScore) {
        this.averageScore = averageScore;
    }
}
