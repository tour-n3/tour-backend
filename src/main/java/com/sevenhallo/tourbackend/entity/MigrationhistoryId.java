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
public class MigrationhistoryId implements Serializable {
    private static final long serialVersionUID = -7242327682782107454L;
    @Size(max = 150)
    @NotNull
    @Column(name = "migrationid", nullable = false, length = 150)
    private String migrationid;

    @Size(max = 300)
    @NotNull
    @Column(name = "contextkey", nullable = false, length = 300)
    private String contextkey;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        MigrationhistoryId entity = (MigrationhistoryId) o;
        return Objects.equals(this.migrationid, entity.migrationid) &&
                Objects.equals(this.contextkey, entity.contextkey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(migrationid, contextkey);
    }

}