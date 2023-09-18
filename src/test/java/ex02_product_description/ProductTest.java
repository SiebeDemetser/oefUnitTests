package ex02_product_description;

import ex02.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void productDescription_happyflow() {
        Product product = new Product("name", 33, 6.3);
        assertEquals(" • 33CL 6,3%", product.productDescription());
    }
    @Test
    void productDescription_wholeNumber() {
        Product product = new Product("name", 50, 5.0);
        assertEquals(" • 50CL 5%", product.productDescription());
    }

    @Test
    void productDescription_noSize_returnEmpty() {
        Product product = new Product("name", null,5.0);
        assertEquals("", product.productDescription());
    }

    @Test
    void productDescription_noPercentage_returnEmpty() {
        Product product = new Product("name", 11,null);
        assertEquals("", product.productDescription());
    }
}