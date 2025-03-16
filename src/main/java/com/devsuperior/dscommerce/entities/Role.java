package com.devsuperior.dscommerce.entities;

import jakarta.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "tb_role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public String authority;

    public Role() {
    }

    public Role(long id, String authority) {
        this.id = id;
        this.authority = authority;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getAuthority() { return authority; }
    public void setAuthority(String authority) { this.authority = authority; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return Objects.equals(authority, role.authority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authority);
    }
}
