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
public class ApplicationUserTokenId implements Serializable {
    private static final long serialVersionUID = -8052748444781178821L;
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
    @Column(name = "name", nullable = false, length = 128)
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ApplicationUserTokenId entity = (ApplicationUserTokenId) o;
        return Objects.equals(this.loginProvider, entity.loginProvider) &&
                Objects.equals(this.name, entity.name) &&
                Objects.equals(this.userId, entity.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loginProvider, name, userId);
    }

}
