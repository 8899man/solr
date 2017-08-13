# Apache Solr Java Examples
This project shows how to use Solr with Java and Spring Boot

## How to run the examples
1. Download the latest version of Solr from <http://lucene.apache.org/solr/mirrors-solr-latest-redir.html>

2. Solr comes with a sample core "techproducts". Start Solr using this core:
`solr start -e techproducts`

3. `mvn clean package` will run the tests

4. You can access the web interface on <http://localhost:8983/solr/> 

5. Solr can be stopped with: `solr stop -all`


