package com.kineteco;

import com.kineteco.model.ProductInventory;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/products")
public class GreetingResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String hello() {
        return "Products inventory Nini up!";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("KE180")
    public ProductInventory getBySku() {
        ProductInventory productInventory = new ProductInventory();
        productInventory.setSku("KE180");
        productInventory.setName("K-Eco 180");
        return productInventory;
    }
}
