package com.example.customermicroservice.entities;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

@Entity
public class Customer {

    @GeneratedValue
    @Id
    private Long id;

    private String name;

    private LocalDate createdDate;

    @ElementCollection
    private Set<Long> products;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public Set<Long> getProducts() {
        return products;
    }

    public void setProducts(Set<Long> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        String str="id="+id+"-"+"name="+name+" data="+createdDate.toString();
        return str;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
