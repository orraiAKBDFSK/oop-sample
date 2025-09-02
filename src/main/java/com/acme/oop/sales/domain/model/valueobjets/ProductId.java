package com.acme.oop.sales.domain.model.valueobjets;

import java.util.Objects;
import java.util.UUID;
/**
 * Value object representing a Product ID in the sales bounded context.
 * @param value the UUID value of the Product ID
 * @author Open-Source aplication develoment team
 * @version 1.0
 */
public record ProductId(UUID value) {
    /**
     * Constructs a ProductId with the given UUID value.
     * @param value the UUID value of the Product ID
     */
    public ProductId {
        if (Objects.isNull(value)) {
            throw new IllegalArgumentException("ProductId cannot be null");
        }
    }
    /**
     * Default constructor generating a random UUID.
     */

    public ProductId(){
        this(UUID.randomUUID());
    }
}
