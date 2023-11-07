# SpringBootSwagger
Sample code depicting the swagger integration in the spring boot application 

Once this sample code is checked out and the service is running, the swagger UI can be accessed to see the API endpoints, contracts (request & response), option to try out the API to test quickly.  I have attached a screenshot for Swagger UI to depict how it looks for this sample code.
**URL to access** - http://localhost:8080/swagger-ui.html#/

<img width="1088" alt="Screenshot 2023-11-07 at 2 47 38 PM" src="https://github.com/RohitRanjanPandey/SpringBootSwagger/assets/48261092/70a01150-c296-4c8f-b1aa-78dfb40bddc2">
<img width="1004" alt="Screenshot 2023-11-07 at 2 47 54 PM" src="https://github.com/RohitRanjanPandey/SpringBootSwagger/assets/48261092/43ec4d99-b15b-4c97-814b-fb84b5e86413">

**To test the Codegen with the same API specification (.yaml) file,**
1. Copy the .yaml file from this sample app and keep in a seperate folder.
2. Change ur current directory to this new folder.
3. Run the command: docker run - rm -v $(pwd):/gen openapitools/openapi-generator-cli generate -i /gen/server.yaml -g swift5 -o /gen/swift-client

Here using the above command, will generate a Swift5 client code stub in the folder named swift-client. This generated code will have the API layer code written in Swift language to call the defined endpoints in this .yaml file. Similarly same command can be used with different language options to generate the code for other languages as well.
