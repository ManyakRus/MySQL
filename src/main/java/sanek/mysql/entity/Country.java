package sanek.mysql.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Country {
    @Id
    @Column(name = "Code", nullable = false, length = 3)
    private String code;
    @Basic
    @Column(name = "Name", nullable = false, length = 52)
    private String name;
    @Basic
    @Column(name = "Continent", nullable = false)
    private String continent;
    @Basic
    @Column(name = "Region", nullable = false, length = 26)
    private String region;
    @Basic
    @Column(name = "SurfaceArea", nullable = false, precision = 2)
    private Double surfaceArea;
    @Basic
    @Column(name = "IndepYear", nullable = true)
    private Short indepYear;
    @Basic
    @Column(name = "Population", nullable = false)
    private Integer population;
    @Basic
    @Column(name = "LifeExpectancy", nullable = true, precision = 1)
    private Double lifeExpectancy;
    @Basic
    @Column(name = "GNP", nullable = true, precision = 2)
    private Double gnp;
    @Basic
    @Column(name = "GNPOld", nullable = true, precision = 2)
    private Double gnpOld;
    @Basic
    @Column(name = "LocalName", nullable = false, length = 45)
    private String localName;
    @Basic
    @Column(name = "GovernmentForm", nullable = false, length = 45)
    private String governmentForm;
    @Basic
    @Column(name = "HeadOfState", nullable = true, length = 60)
    private String headOfState;
    @Basic
    @Column(name = "Capital", nullable = true)
    private Integer capital;
    @Basic
    @Column(name = "Code2", nullable = false, length = 2)
    private String code2;

    @Transient
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "countryCode")
    private Collection<City> cityCollection;

    @Transient
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "country")
    private Collection<CountryLanguage> countryLanguageCollection;



    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Double getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(Double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public Short getIndepYear() {
        return indepYear;
    }

    public void setIndepYear(Short indepYear) {
        this.indepYear = indepYear;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Double getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(Double lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    public Double getGnp() {
        return gnp;
    }

    public void setGnp(Double gnp) {
        this.gnp = gnp;
    }

    public Double getGnpOld() {
        return gnpOld;
    }

    public void setGnpOld(Double gnpOld) {
        this.gnpOld = gnpOld;
    }

    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    public String getGovernmentForm() {
        return governmentForm;
    }

    public void setGovernmentForm(String governmentForm) {
        this.governmentForm = governmentForm;
    }

    public String getHeadOfState() {
        return headOfState;
    }

    public void setHeadOfState(String headOfState) {
        this.headOfState = headOfState;
    }

    public Integer getCapital() {
        return capital;
    }

    public void setCapital(Integer capital) {
        this.capital = capital;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(code, country.code) &&
                Objects.equals(name, country.name) &&
                Objects.equals(continent, country.continent) &&
                Objects.equals(region, country.region) &&
                Objects.equals(surfaceArea, country.surfaceArea) &&
                Objects.equals(indepYear, country.indepYear) &&
                Objects.equals(population, country.population) &&
                Objects.equals(lifeExpectancy, country.lifeExpectancy) &&
                Objects.equals(gnp, country.gnp) &&
                Objects.equals(gnpOld, country.gnpOld) &&
                Objects.equals(localName, country.localName) &&
                Objects.equals(governmentForm, country.governmentForm) &&
                Objects.equals(headOfState, country.headOfState) &&
                Objects.equals(capital, country.capital) &&
                Objects.equals(code2, country.code2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, continent, region, surfaceArea, indepYear, population, lifeExpectancy, gnp, gnpOld, localName, governmentForm, headOfState, capital, code2);
    }

    public Collection<City> getCityCollection() {
        return cityCollection;
    }

    public void setCityCollection(Collection<City> cityCollection) {
        this.cityCollection = cityCollection;
    }

    public Collection<CountryLanguage> getCountryLanguageCollection() {
        return countryLanguageCollection;
    }

    public void setCountryLanguageCollection(Collection<CountryLanguage> countryLanguageCollection) {
        this.countryLanguageCollection = countryLanguageCollection;
    }
}
