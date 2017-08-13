package ch.simas.solrtechproducts;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SolrTechproductsApplicationTests {

    private final static Logger LOGGER = Logger.getLogger(SolrTechproductsApplicationTests.class);

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void addProduct() {
        List<Product> products = productRepository.findByNameContains("X1");

        products.forEach(p -> LOGGER.info(p));

        Assert.assertFalse(products.isEmpty());

    }

    @Before
    public void before() {
        Product product = new Product();
        product.setId("X1");
        product.setName("Lenovo X1 Carbon");
        productRepository.save(product);
    }

    @After
    public void after() {
        List<Product> products = productRepository.findByNameContains("X1");
        productRepository.delete(products);
    }

}
