JSON Schema Validator
=====================

Experimental Java project that uses [json-schema-validator](https://github.com/daveclayton/json-schema-validator) to validate a JSON document against a schema.

#### Building and Running

To build this library you must have the following items installed:

+ [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
+ A tool for checking out a [Git](http://git-scm.com/) repository.
+ Apache's [Maven](http://maven.apache.org/index.html).

Get a copy of the latest code:

    git clone https://github.com/metadatacenter/json-schema-validation-exp.git

Change into the json-schema-validation-exp directory:

    cd json-schema-validation-exp

Then build it with Maven:

    mvn clean install

To run:

    java -jar ./target/json-schema-validation-exp-${version}-jar-with-dependencies.jar <schemaFileName> <instanceFileName>

