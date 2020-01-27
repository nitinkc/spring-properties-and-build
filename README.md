# Spring Properties & Build Concepts

Enable specific profile  from application.properties. The file name should be application-qa.properties
```shell script
spring.profiles.active=qa
```

Refer external property from a profile. The file name should be application-datasource-h2.properties.
```
spring.profiles.include = datasource-h2
```


