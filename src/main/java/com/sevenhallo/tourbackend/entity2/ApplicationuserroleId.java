package com.sevenhallo.tourbackend.entity2;

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
public class ApplicationuserroleId implements Serializable {
    private static final long serialVersionUID = -2334796226749870673L;
    @Size(max = 128)
    @NotNull
    @Column(name = "roleid", nullable = false, length = 128)
    private String roleid;

    @Size(max = 128)
    @NotNull
    @Column(name = "userid", nullable = false, length = 128)
    private String userid;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ApplicationuserroleId entity = (ApplicationuserroleId) o;
        return Objects.equals(this.roleid, entity.roleid) &&
                Objects.equals(this.userid, entity.userid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleid, userid);
    }

}