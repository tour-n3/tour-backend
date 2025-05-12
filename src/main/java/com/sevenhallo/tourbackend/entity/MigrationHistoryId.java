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
public class MigrationHistoryId implements Serializable {
    private static final long serialVersionUID = -7242327682782107454L;
    @Size(max = 150)
    @NotNull
    @Column(name = "migrationid", nullable = false, length = 150)
    private String migrationId;

    @Size(max = 300)
    @NotNull
    @Column(name = "contextkey", nullable = false, length = 300)
    private String contextKey;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        MigrationHistoryId entity = (MigrationHistoryId) o;
        return Objects.equals(this.migrationId, entity.migrationId) &&
                Objects.equals(this.contextKey, entity.contextKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(migrationId, contextKey);
    }

}
