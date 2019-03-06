package sanek.mysql.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class CountryLanguagePK implements Serializable {
    @Column(name = "CountryCode", nullable = false, length = 3)
    @Id
    private String countryCode;
    @Column(name = "Language", nullable = false, length = 30)
    @Id
    private String language;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountryLanguagePK that = (CountryLanguagePK) o;
        return Objects.equals(countryCode, that.countryCode) &&
                Objects.equals(language, that.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryCode, language);
    }
}
