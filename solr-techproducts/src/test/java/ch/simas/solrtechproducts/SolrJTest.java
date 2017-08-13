package ch.simas.solrtechproducts;

import org.apache.log4j.Logger;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.junit.Test;

import java.io.IOException;

public class SolrJTest {

    private final static Logger LOGGER = Logger.getLogger(SolrJTest.class);

    @Test
    public void search() throws IOException, SolrServerException {
        SolrClient solrClient = new HttpSolrClient("http://localhost:8983/solr/techproducts");

        SolrQuery query = new SolrQuery();
        query.setStart(0);
        query.setRows(20);
        query.setQuery("name:Solr");

        QueryResponse response = solrClient.query(query);
        SolrDocumentList results = response.getResults();

        results.forEach(document -> LOGGER.info(document));
    }

}
