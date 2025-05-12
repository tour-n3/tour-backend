package com.sevenhallo.tourbackend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
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
public class UserPreviousPasswordId implements Serializable {
    private static final long serialVersionUID = -2546080030604914407L;
    @Size(max = 128)
    @NotNull
    @Column(name = "passwordhash", nullable = false, length = 128)
    private String passwordHash;

    @Size(max = 128)
    @NotNull
    @Column(name = "userid", nullable = false, length = 128)
    private String userId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        UserPreviousPasswordId entity = (UserPreviousPasswordId) o;
        return Objects.equals(this.passwordHash, entity.passwordHash) &&
                Objects.equals(this.userId, entity.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passwordHash, userId);
    }
}
