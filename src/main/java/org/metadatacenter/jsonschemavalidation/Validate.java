package org.metadatacenter.jsonschemavalidation;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jackson.JacksonUtils;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import com.github.fge.jsonschema.core.report.ProcessingMessage;
import com.github.fge.jsonschema.core.report.ProcessingReport;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import com.github.fge.jsonschema.main.JsonValidator;

import java.io.File;
import java.io.IOException;

public class Validate
{
  private static final ObjectMapper MAPPER = JacksonUtils.newMapper();

  public static void main(String[] args) throws ProcessingException, IOException
  {
    if (args.length != 2)
      Usage();

    JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
    JsonValidator validator = factory.getValidator();
    boolean deepCheck = true;
    File schemaFile = new File(args[0]);
    File instanceFile = new File(args[1]);
    JsonNode schema = MAPPER.readTree(schemaFile);
    JsonNode instance = MAPPER.readTree(instanceFile);
    ProcessingReport processingReport = validator.validate(schema, instance, deepCheck);

    for (ProcessingMessage processingMessage : processingReport) {
      System.out.println("Message: " + processingMessage.getMessage());
    }
  }

  private static void Usage()
  {
    System.err.println("Usage: " + Validate.class.getName() + " <schemaFileName> <instanceFileName>");
    System.exit(1);
  }
}
