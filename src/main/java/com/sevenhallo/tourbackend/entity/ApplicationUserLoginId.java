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
public class ApplicationUserLoginId implements Serializable {
    private static final long serialVersionUID = 8495847662801381904L;
    @Size(max = 128)
    @NotNull
    @Column(name = "userid", nullable = false, length = 128)
    private String userId;

    @Size(max = 128)
    @NotNull
    @Column(name = "loginprovider", nullable = false, length = 128)
    private String loginProvider;

    @Size(max = 128)
    @NotNull
    @Column(name = "providerkey", nullable = false, length = 128)
    private String providerKey;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ApplicationUserLoginId entity = (ApplicationUserLoginId) o;
        return Objects.equals(this.loginProvider, entity.loginProvider) &&
                Objects.equals(this.userId, entity.userId) &&
                Objects.equals(this.providerKey, entity.providerKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loginProvider, userId, providerKey);
    }

}
