A set of self-contained schemas for particular fields in the CEDAR Template Validation Schema

These schemas are generated using the <tt>schemawrap.sh</tt> script in the <tt>scripts</tt> directory in the <tt>cedar-model</tt> repo.

Templates, elements, elements and fields can be incrementally validated agains these schema.

For example, using the Python <tt>jsvalid.py</tt> validation script from the <tt>scripts</tt> directory in the <tt>cedar-model</tt> repo: 

    jsvalid.py -s provenanceFields.json -i templateFieldExample.json 

Or the Java-based validator from the <tt>cedar-model-validator</tt> repo:
    
    java -jar json-schema-validation-exp/target/json-schema-validation-exp-0.1.0-jar-with-dependencies.jar provenanceFields.json templateFieldExample

