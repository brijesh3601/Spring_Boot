Eureka Server
---------------------------
- Run EurekaServerApplication & hit http://localhost:8090/
- Note below property are required apart of server.port to start eureka without error

eureka.client.register-with-eureka=false  
eureka.client.fetch-registry=false  

- Find 'Eureka-Dependencies' in pom.xml to see eureka related dependencies
- Note application.properties uses port 8761

Eureka Producer 
---------------------------
- Find 'Eureka-Dependencies' in pom.xml to see eureka related dependencies
- aaplication.properties has port 8761 any other port will not work & will throw error :: Network level connection to peer localhost; retrying after delay


Error:: RedirectingEurekaHttpClient : Request execution error ()
---------------------------
- only stating 'server.port' in application.properties will not work. Check application.properties for Eureka client  

- error stack : com.sun.jersey.api.client.ClientHandlerException: java.net.ConnectException: Connection refused: connect


Reference stackoverflow:
-----------------------------
https://stackoverflow.com/questions/39242635/how-to-register-eureka-clients-with-eureka-server-on-different-hosts-spring-boo

spring.application.name=eureka-service  
spring.cloud.config.uri=http://myMachine.domain.lan:8888  
server.port=8761  
eureka.client.register-with-eureka=false  
eureka.client.fetch-registry=false  
eureka.instance.hostname=KBHWS242.myDomain.lan  
eureka.instance.prefer-ip-address=true  


