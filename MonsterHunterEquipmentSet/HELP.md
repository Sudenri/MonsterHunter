# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.2/maven-plugin/reference/html/#build-image)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.1.2/reference/htmlsinge/index.html#data.sql.jpa-and-spring-data)
* [Spring Data JDBC](https://docs.spring.io/spring-boot/docs/3.1.2/reference/htmlsinge/index.html#data.sql.jdbc)

### Guides

The following guides illustrate how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Using Spring Data JDBC](https://github.com/spring-projects/spring-data-examples/tree/master/jdbc/basics)

This application will have 4 functions:
1. To see the stats of a specific piece of equipment based on equipment's name
2. To see all pieces of equipment which has a specific skill
3. Add a new piece of equipment to the database (EquipmentList)
4. Generate a set of equipment based on different requirements

Feature list:
~~1. To see the stats of a specific piece of equipment based on equipment's name~~
~~2. To see all pieces of equipment which has a specific skill~~
~~3. File-based database loading:~~ 
https://www.bezkoder.com/spring-boot-upload-excel-file-database/
https://www.codejava.net/coding/java-code-example-to-import-data-from-excel-to-database 
https://www.roseindia.net/tutorial/java/poi/insertExcelFileData.html
4. 
~~5. Add a new piece of equipment to the database~~
6. Generate a set of equipment based on different requirements
7. Front-end

Story list:
1. Update the data load file with manual input from POST method when adding a singular equipment
2. Implement a verification when adding equipment (file or singular) for already existing data + message
3. Change "SKILL" to allow for multiple values