package com.sevenhallo.tourbackend.entity2;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class UserpreviouspasswordId implements Serializable {
    private static final long serialVersionUID = -2546080030604914407L;
    @Size(max = 128)
    @NotNull
    @Column(name = "passwordhash", nullable = false, length = 128)
    private String passwordhash;

    @Size(max = 128)
    @NotNull
    @Column(name = "userid", nullable = false, length = 128)
    private String userid;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        UserpreviouspasswordId entity = (UserpreviouspasswordId) o;
        return Objects.equals(this.passwordhash, entity.passwordhash) &&
                Objects.equals(this.userid, entity.userid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passwordhash, userid);
    }

}