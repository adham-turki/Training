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
## OpenAPI
# What are the main components of an OpenAPI specification?
- openapi: Version of the OpenAPI Specification.
- info: Metadata about the API.
- Servers : specifies the base URLs for your API. These base URLs are used by the clients to connect to your API .
- paths: Defines the available endpoints and operations.
- components: Reusable objects and schemas.
- security: Security schemes and requirements.
- externalDocs :used to provide additional external documentation for an API. This object allows you to specify a URL that points to detailed information or supplementary documentation that is not included directly within the OpenAPI specification document.
 # What is the purpose of the info object in an OpenAPI specification?
 - The info object provides metadata about the API such as title, version, description, and contact information. It helps consumers understand the API's purpose and usage.
 # How do you handle pagination in OpenAPI?
- Answer: Pagination can be handled using query parameters (page, limit) within the parameters object of an operation.
# How can you document API request payloads in OpenAPI?
- Request payloads are documented using the requestBody object within an operation. It specifies the content type and schema of the request body. 

