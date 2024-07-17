# Topics 
- XML (extensible Markup Language)
- JSON (JavaScript Object Notation)
- YAML (YAML Ain't Markup Language)
- API (Application Programming Interface)
- HTTP (HyperText Transfer Protocol)
- REST (Representational State Transfer)
- SOAP (Simple Object Access Protocol)
- JWT (JSON Web Token)
- HATEOAS (Hypermedia As The Engine Of Application State)
# OpenAPI
## 1. What are the main components of an OpenAPI specification?
- openapi : the version of the openapi
- info: Metadata about the API.
- Servers : specifies the base URLs for your API. These base URLs are used by the clients to connect to your API .
- paths: Defines the available endpoints and operations.
- components: Reusable objects and schemas.
- security: Security schemes and requirements.
- externalDocs :used to provide additional external documentation for an API. This object allows you to specify a URL that points to detailed information or supplementary documentation that is not included directly within the OpenAPI specification document.
## 2. What is the purpose of the info object in an OpenAPI specification?
 - The info object provides metadata about the API such as title, version, description, and contact information. It helps consumers understand the API's purpose and usage.
## 3. How do you handle pagination in OpenAPI?
- Answer: Pagination can be handled using query parameters (page, limit) within the parameters object of an operation.
## 4. How can you document API request payloads in OpenAPI?
- Request payloads are documented using the requestBody object within an operation. It specifies the content type and schema of the request body. 
## 5. What is the difference between OpenAPI 2.0 (Swagger) and OpenAPI 3.0?
- OpenAPI 3.0 introduces a more flexible and expressive format, including improved support for JSON Schema, enhanced parameter handling, better support for content negotiation, and the addition of components for reusable definitions.
## 6. How do you define paths in an OpenAPI specification?
- Paths are defined under the paths key in the OpenAPI document. Each path has an object with HTTP methods as keys (e.g., GET, POST), which contain details like parameters, request bodies, responses, and descriptions.
## 7. What are the common HTTP methods supported in OpenAPI?
- The common HTTP methods supported are GET, POST, PUT, PATCH, DELETE, OPTIONS, and HEAD.
## 8. How can you describe request parameters in OpenAPI?
- Request parameters can be described in the parameters array within an operation. Each parameter has a name, location (query, header, path, or cookie), description, required flag, and schema.
## 9. What is the role of schemas in OpenAPI, and how do you define them?
- Schemas define the structure of request and response bodies, parameters, and headers. They are defined using JSON Schema and can be included directly in the parameter or response definitions or as reusable components.
## 10. How do you handle authentication and authorization in an OpenAPI specification?
- Authentication and authorization are handled in the security section. Security schemes (e.g., API keys, OAuth2) are defined in the components.securitySchemes section, and then referenced in operations or globally.
## 11. What are some tools available for validating and testing OpenAPI specifications?
- Tools like Swagger Editor, OpenAPI Validator, and Postman can validate and test OpenAPI specifications. They help ensure the spec is correctly formatted and the API behaves as described.
## 12. Describe how you would version an API using OpenAPI.
- API versioning can be done by including version information in the info section, and by using versioned base paths (e.g.,'/v1/','/v2/') in the paths section.
## 13. What are reusable components in OpenAPI, and how do you define them?
- Reusable components, such as schemas, responses, parameters, examples, request bodies, and headers, are defined in the components section. They can be referenced throughout the OpenAPI document to avoid duplication.
## 14. What are the benefits and potential drawbacks of using OpenAPI?
- Benefits include standardized documentation, improved collaboration, automated code generation, and better API testing and validation. Drawbacks might include the initial learning curve and the effort required to keep the documentation in sync with the implementation.
## 15. Explain the difference between paths and components in OpenAPI.
- The paths section defines the available endpoints and their operations, while the components section holds reusable definitions such as schemas, parameters, responses, and security schemes. This helps keep the specification DRY (Don't Repeat Yourself).
## 16. How do you handle polymorphism in OpenAPI?
- Polymorphism is handled using the oneOf, anyOf, or allOf keywords in a schema definition. These keywords allow defining a schema that can be one of several types, a combination of types, or match multiple schemas.
- anyOf: At least one schema must match.
- oneOf: Exactly one schema must match.
## What is the role of discriminator in OpenAPI, and how do you use it?
- The discriminator property is used in schemas to aid in polymorphism. It specifies a field in the schema that indicates the type of the object, helping to differentiate between different object types within a oneOf or anyOf schema.
