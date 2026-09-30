package com.coding.leetcode.coding.Omnissa.dsa.practical;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;
import java.util.List;
import java.util.Optional;

/**
 * D19 | P1 | Complete a supplied service API for a small in-memory product catalog.
 * <p>Problem: Complete a supplied service API for a small in-memory product catalog.
 * <p>Contract: This illustrative service stores Products with nonblank unique IDs, nonblank names and nonnegative priceCents. add rejects duplicate IDs; findById returns Optional.empty() when missing. updatePrice returns the updated product or throws NoSuchElementException. remove returns whether a product existed. listProducts returns an independent snapshot in insertion order. Invalid fields throw IllegalArgumentException.
 * <p>Evidence: R S4 and related S1 service task establish supplied-method implementation only. Product catalog, fields and all contracts here are illustrative practice, not the original interview design. <a href="https://leetcode.com/discuss/post/6892873/">S4</a>, <a href="https://leetcode.com/discuss/post/8386158/omnissa-formerly-vmware-mts-2-bengaluru-7sb5a/">S1</a>
 * <p>This is an unsolved practice scaffold. Implement the TODO methods, then run main.
 */
public class ProductCatalogService {
    public record Product(String id, String name, long priceCents) { }

    public ProductCatalogService() {
        // TODO: initialize catalog state when implementing this exercise.
    }

    public void add(Product product) {
        throw new UnsupportedOperationException("TODO: implement add");
    }

    public Optional<Product> findById(String id) {
        throw new UnsupportedOperationException("TODO: implement findById");
    }

    public Product updatePrice(String id, long priceCents) {
        throw new UnsupportedOperationException("TODO: implement updatePrice");
    }

    public boolean remove(String id) {
        throw new UnsupportedOperationException("TODO: implement remove");
    }

    public List<Product> listProducts() {
        throw new UnsupportedOperationException("TODO: implement listProducts");
    }

    public static void main(String[] args) {
        Product sample = new Product("p1", "Keyboard", 2500L);
        ExampleRunner.run("D19 service operation sequence", "add p1 at 2500; update to 2000; find p1",
                "Optional[Product[id=p1, name=Keyboard, priceCents=2000]]", () -> {
                    ProductCatalogService service = new ProductCatalogService();
                    service.add(sample);
                    service.updatePrice("p1", 2000L);
                    return service.findById("p1");
                });
        String missingId = "missing";
        ExampleRunner.run("D19 missing product", missingId, "Optional.empty", () -> new ProductCatalogService().findById(missingId));
        ExampleRunner.run("D19 remove missing product", missingId, "false", () -> new ProductCatalogService().remove(missingId));
    }
}
