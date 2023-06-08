package com.finall.spring.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

import org.springframework.hateoas.RepresentationModel;

import jakarta.persistence.*;


@Entity
@Table(name= "TB_PRODUCTS")
public class ProductModel extends RepresentationModel<ProductModel> implements Serializable{
    
private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private UUID idProduct;
private String name;
private BigDecimal value;


public static long getSerialversionuid() {
    return serialVersionUID;
}


public UUID getIdProduct() {
    return idProduct;
}


public void setIdProduct(UUID idProduct) {
    this.idProduct = idProduct;
}


public String getName() {
    return name;
}


public void setName(String name) {
    this.name = name;
}


public BigDecimal getValue() {
    return value;
}


public void setValue(BigDecimal value) {
    this.value = value;
}


@Override
public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((idProduct == null) ? 0 : idProduct.hashCode());
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + ((value == null) ? 0 : value.hashCode());
    return result;
}


@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (!super.equals(obj))
        return false;
    if (getClass() != obj.getClass())
        return false;
    ProductModel other = (ProductModel) obj;
    if (idProduct == null) {
        if (other.idProduct != null)
            return false;
    } else if (!idProduct.equals(other.idProduct))
        return false;
    if (name == null) {
        if (other.name != null)
            return false;
    } else if (!name.equals(other.name))
        return false;
    if (value == null) {
        if (other.value != null)
            return false;
    } else if (!value.equals(other.value))
        return false;
    return true;
}



}
