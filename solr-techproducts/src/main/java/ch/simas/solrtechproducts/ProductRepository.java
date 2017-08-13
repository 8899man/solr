package ch.simas.solrtechproducts;

import java.util.List;

import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends SolrCrudRepository<Product, String> {

	List<Product> findByNameContains(String name);

}
