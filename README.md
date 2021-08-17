# songr

### gradle 

### JDK 8

### dbPlatform

### the dependencies

```	
        implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'
	implementation 'org.springframework.boot:spring-boot-starter-web'
	developmentOnly 'org.springframework.boot:spring-boot-devtools'
	testImplementation 'org.springframework.boot:spring-boot-starter-test'
	runtimeOnly 'org.postgresql:postgresql'
	implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
	
```
### Properties 

```aidl

spring.datasource.platform=dbPlatform
spring.datasource.url=jdbc:postgresql://dbPort/dbName
spring.datasource.username=dbUserName
spring.datasource.password=dbpassword
spring.jpa.hibernate.ddl-auto=update
spring.datasource.initialization-mode=always

```

###  build to install the JAR 