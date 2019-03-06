package sanek.mysql.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlTransient;
import java.util.Objects;
import java.util.Set;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID", nullable = false)
    private Long userId;
    @Basic
    @Column(name = "NAME", nullable = false, length = 36)
    private String name;
    @Basic
    @Column(name = "PASSWORD", nullable = false, length = 128)
    private String password;
    @Basic
    @Column(name = "ENABLED", nullable = false)
    private Boolean enabled;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userId, user.userId) &&
                Objects.equals(name, user.name) &&
                Objects.equals(password, user.password) &&
                Objects.equals(enabled, user.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, name, password, enabled);
    }


    @JoinTable(name = "user_role", joinColumns = {
        @JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID")}, inverseJoinColumns = {
        @JoinColumn(name = "ROLE_ID", referencedColumnName = "ROLE_ID")})
    @ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    private Set<Role> roleSet;

    @Transient
    public Set<Role> getRoleSet() {
        return roleSet;
    }

    public void setRoleSet(Set<Role> roleSet) {
        this.roleSet = roleSet;
    }



}
