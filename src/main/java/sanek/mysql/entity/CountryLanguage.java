package sanek.mysql.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@IdClass(CountryLanguagePK.class)
public class CountryLanguage {
    @Id
    @Column(name = "CountryCode", nullable = false, length = 3)
    private String countryCode;
    @Id
    @Column(name = "Language", nullable = false, length = 30)
    private String language;
    @Basic
    @Column(name = "IsOfficial", nullable = false)
    private String isOfficial;
    @Basic
    @Column(name = "Percentage", nullable = false, precision = 1)
    private Double percentage;

    @Transient
    @ManyToOne
    @JoinColumn(name = "CountryCode", referencedColumnName = "Code", nullable = false)
    private Country country;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Object getIsOfficial() {
        return isOfficial;
    }

    public void setIsOfficial(String isOfficial) {
        this.isOfficial = isOfficial;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountryLanguage that = (CountryLanguage) o;
        return Objects.equals(countryCode, that.countryCode) &&
                Objects.equals(language, that.language) &&
                Objects.equals(isOfficial, that.isOfficial) &&
                Objects.equals(percentage, that.percentage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryCode, language, isOfficial, percentage);
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country countryByCountryCode) {
        this.country = countryByCountryCode;
    }

}
