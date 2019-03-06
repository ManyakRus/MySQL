package sanek.mysql.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "Name", nullable = false, length = 35)
    private String name;
    @Basic
    @Column(name = "CountryCode", nullable = false, length = 3)
    private String countryCode;
    @Basic
    @Column(name = "District", nullable = false, length = 20)
    private String district;
    @Basic
    @Column(name = "Population", nullable = false)
    private Integer population;

    @Transient
    @ManyToOne
    @JoinColumn(name = "CountryCode", referencedColumnName = "Code", nullable = false)
    private Country country;
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getCountryCode() {
//        return countryCode;
//    }
//
//    public void setCountryCode(String countryCode) {
//        this.countryCode = countryCode;
//    }
//
//    public String getDistrict() {
//        return district;
//    }
//
//    public void setDistrict(String district) {
//        this.district = district;
//    }
//
//    public Integer getPopulation() {
//        return population;
//    }
//
//    public void setPopulation(Integer population) {
//        this.population = population;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        City city = (City) o;
//        return Objects.equals(id, city.id) &&
//                Objects.equals(name, city.name) &&
//                Objects.equals(countryCode, city.countryCode) &&
//                Objects.equals(district, city.district) &&
//                Objects.equals(population, city.population);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name, countryCode, district, population);
//    }
//
//    public Country getCountry() {
//        return country;
//    }
//
//    public void setCountry(Country countryByCountryCode) {
//        this.country = countryByCountryCode;
//    }
//
}
