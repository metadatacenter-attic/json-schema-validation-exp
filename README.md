A Java-based validator for validating a JSON document against a JSON Schema document.

It can be used as follows:

    java -jar ./target/json-schema-validation-exp-0.1.0-jar-with-dependencies.jar <json_schema_file> <json_instance_file>

The <tt>src/main/resources</tt> directory contains a set of self-contained schemas for particular fields in the CEDAR Template Validation Schema.

These standalone schemas are generated using the <tt>schemawrap.sh</tt> script in the <tt>scripts</tt> directory in the <tt>cedar-model</tt> repo.

Templates, elements, and fields can be incrementally validated agains these schema.

For example, using the Python <tt>jsvalid.py</tt> validation script from the <tt>scripts</tt> directory in the <tt>cedar-model</tt> repo: 

    jsvalid.py -s provenanceFields.json -i templateFieldExample.json 

Or the Java-based validator from the <tt>cedar-model-validator</tt> repo:
    
    java -jar json-schema-validation-exp/target/json-schema-validation-exp-0.1.0-jar-with-dependencies.jar provenanceFields.json templateFieldExample

