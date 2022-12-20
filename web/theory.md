#### **`What is Website, Webpage, Web application?`**
```
A website is a collection of related web pages that are hosted on a web server and are accessible through the internet using a web browser. 

A web page is a document that is displayed in a web browser and can contain text, images, videos, and other types of media.

A web application is a software application that is accessed over the internet using a web browser. Web applications are typically used to interact with users and perform tasks such as online shopping, banking, or social networking.

Here is an example of how these terms might be used:

"I visited the company's website to learn more about their products."
"I found a lot of useful information on the FAQ webpage."
"I used the online banking web application to transfer money to my savings account."

In summary, a website is a collection of web pages that are hosted on a web server, a web page is a document displayed in a web browser, and a web application is a software application accessed over the internet using a web browser.
```

#### **`Difference between website and web application?`**
```
Technically, a web application could be considered a type of website, since it is accessed through the internet using a web browser. However, the term "website" typically refers to a collection of web pages that are hosted on a web server and are intended to provide information or services to users. A web application, on the other hand, is a software application that is accessed through the internet and is designed to perform specific tasks or allow users to interact with it in some way.

For example, a website might be a collection of web pages that provide information about a company, its products, and its services. A web application, on the other hand, might be an online tool that allows users to create and edit documents, manage their finances, or perform other tasks.

So while a web application could be considered a type of website, the term "website" is typically used to refer to a collection of web pages that are intended to provide information or services to users, whereas the term "web application" is used to refer to a software application that is accessed through the internet and is designed to perform specific tasks or allow users to interact with it in some way.
```

#### **`Is a web application a website?`**
```
No, a web application is not a website. A web application is a software application that is accessed through the internet and is designed to perform specific tasks or allow users to interact with it in some way. A website is a collection of web pages that are hosted on a web server and are intended to provide information or services to users.
```

#### **`Lifecycle of http request from browser to server ?`**
 ```
When a user makes an HTTP request from their web browser to a server, the request goes through a series of steps before it is fulfilled and the response is sent back to the browser. 

User enters a URL into their web browser and hits "enter."

The browser looks up the IP address of the server using the Domain Name System (DNS).

The browser sends an HTTP request to the server, specifying the type of request (e.g., GET, POST, etc.), the resource being requested (e.g., a webpage, an image, etc.)

The server receives the request and processes it. This may involve looking up the requested resource in a database, executing a script to generate the content, or some other action.

The server sends an HTTP response back to the browser, including a status code (e.g., 200 OK, 404 Not Found, etc.), the requested resource (if applicable), and any additional information.

The browser receives the response and processes it. This may involve rendering the content of the response (e.g., displaying a webpage or image), storing information in a cookie, or some other action.

The browser displays the response to the user.

```
#### **`HTTP protocol and its Characteristics`**
```
The Hypertext Transfer Protocol (HTTP) is a standardized protocol for transmitting data over the internet. It is used for communication between clients (e.g., web browsers) and servers (e.g., web servers) to request and deliver web resources such as HTML pages, images, and other types of content.

Here are some characteristics of the HTTP protocol:
HTTP is a stateless protocol, which means that each request is treated as an independent transaction and the server does not maintain any information about previous requests.

HTTP uses a request-response model, in which the client sends a request to the server and the server sends a response back to the client. The request includes a method (e.g., GET, POST, etc.) that specifies the type of action being requested, and the response includes a status code (e.g., 200 OK, 404 Not Found, etc.) that indicates the outcome of the request.

HTTP is a text-based protocol, which means that the request and response are transmitted as plain text. This makes it easy to understand and debug, but also means that it is not well-suited for transmitting binary data or other types of non-textual content.

HTTP is a connectionless protocol, which means that the client and server do not maintain a continuous connection for the duration of the request-response process. Instead, each request is independent and establishes a new connection for the duration of the request. This makes HTTP more efficient, but also means that it is not well-suited for real-time communication or other scenarios that require a continuous connection.

HTTP is an extensible protocol, which means that it can be extended and enhanced through the use of headers and other mechanisms. This allows HTTP to support a wide range of applications and requirements, but also means that there can be a lot of variation in how it is used in different contexts.
```
#### **`What is Rest ?`**
```
REST, or Representational State Transfer, is a way of organizing and structuring a web application that makes it easy to use and maintain. It does this by separating the application into different "resources" that can be accessed and manipulated through a set of standardized operations, called "methods."

For example, let's say you have a web application that manages a list of movies. You could design the application as a RESTful web service, with a "movies" resource that can be accessed through methods like GET, POST, PUT, and DELETE. A client application, such as a web browser or a mobile app, could then send HTTP requests to the web service to retrieve a list of movies, add a new movie to the list, update an existing movie, or delete a movie from the list.

REST is based on standard HTTP protocols, which makes it easy to use and integrate with other systems. It is also a flexible architecture that can be used to build web services that support a wide range of operations, making it a popular choice for building web-based applications.
```

#### **`Explain all the rest verbs ?`**
```
HTTP defines a set of request methods to indicate the desired action to be performed for a given resource.

GET: This verb is used to request a resource from the server. It is used to retrieve web pages, images, and other types of content.

HEAD: The HEAD verb is often used to check the status of a resource without transferring the entire resource. For example,, if a URL might produce a large download, a HEAD request could read its Content-Length header to check the filesize without actually downloading the file.

POST: This verb is used to submit an entity to the specified resource, often causing a change in state or side effects on the server. It is commonly used to submit forms, upload files, and perform other types of data updates on the server.

PUT: This verb is used to replace an existing resource with a new one. It is typically used to update the contents of a resource.

DELETE: This verb is used to delete a resource from the server.

PATCH: This verb is used to apply partial modifications to a resource. It is often used to update only specific parts of a resource, rather than replacing the entire resource.

OPTIONS: OPTIONS verb is useful for requesting information about the communication options available for a specific resource, or for the server itself. It can be used to determine the capabilities of the server or to request a list of the HTTP methods that are supported by the resource. 

Imagine that you are building a web application that allows users to create and edit documents online. You want to allow users to use different formatting options (e.g., bold, italic, underline) when editing the documents, but you also want to allow users to customize the available formatting options based on their preferences.

To do this, you could use the HTTP OPTIONS verb to allow users to request a list of the formatting options that are available on the server. The server could respond with a list of the available options in the response, along with any other relevant information (e.g., whether the option is currently enabled or disabled). The client could then use this information to update the user interface and enable or disable the formatting options as needed.

TRACE: The TRACE verb is typically used for diagnostic purposes, to help identify issues with the communication between the client and the server. For example, a client might use TRACE to test the path between itself and the server, or to verify that the server is responding to requests correctly. This can be useful for troubleshooting problems with the communication between the client and the server.

```

#### **`What is CGI ?`**
```
Common Gateway Interface (CGI) is used to provide dynamic content to the user. It is used to execute a program or script that resides in the server to process data or access database to produce the relevant dynamic content. 
```

#### **`Does cgi bind data to a webpage while process a request?`**
```
CGI (Common Gateway Interface) is a standard for running external programs from a web server, typically to generate dynamic content for a website. When a web server receives a request for a CGI program, it launches the program and passes it the request data as standard input. The CGI program then generates a response and sends it back to the web server, which in turn sends it back to the client as the final response.

CGI programs are usually written in a programming language such as C, C++, or Perl, and they are responsible for generating the entire response for a request. This means that they can perform any processing or data manipulation that is needed to generate the response, including binding data to a web page.

CGI can be used to bind data to a web page, but it requires the developer to write the code to do so, and it does not provide any built-in abstractions or utilities for this purpose. In contrast, frameworks such as Spring MVC or JSP provide built-in support for data binding and other web development tasks, which can simplify the process of binding data to a web page.
```
#### **`Disadvantages of CGI`**
```
For each CGI server request a process is created. So if no. of request increases the no of process will also increase hence at some point there will be delay in responses.
CGI scripts are written in native languages like C, C++ hence platform dependent. 
```
#### **`How servelts deals with these disadvantages ? `**
```
To resolve the problems which are created by CGI are resolved with introduction to servelts. It uses thread from the jvm instead of process. Threads are lightweight process. 
Its faster than cgi. 
Servlet programs are written in java. which makes them platform independent.
```

### **`How servelts work ?`**
```
When browser request comes in from a dynamic page it will be process in a servlet program which will collect data from database and embedded to the html file and that html file will be send back. 
When dynamic request comes in it will be handled by servlets by using jvm thread which are light weight process. 
```
### **`Servlet lifecycle ?`**
```
A servlet is a Java class that is designed to extend the capabilities of a server. It runs on the server side and is used to handle client requests and generate responses.

The servlet lifecycle refers to the sequence of events that occurs when a servlet is created, initialized, and destroyed. Here is an overview of the servlet lifecycle:

Class loading: The servlet class is loaded into the Java Virtual Machine (JVM) when the web application is deployed or started.

Instantiation: The servlet class is instantiated, creating a new instance of the servlet.

Initialization: The servlet's init() method is called, allowing the servlet to initialize itself and perform any necessary setup.

Request handling: The servlet handles client requests by calling its service() method and generating a response.

Destruction: When the web application is undeployed or stopped, the servlet's destroy() method is called, allowing the servlet to release any resources and perform any necessary cleanup.

```

### **`What is servlet ?`**
```
A servlet is a Java class that runs in a Java-based web server, such as Apache Tomcat or Jetty. It is used to handle requests and generate responses for a web application.

In the context of CGI (Common Gateway Interface), a servlet can be used as a replacement for traditional CGI programs. CGI programs are separate executables that are invoked by a web server to handle requests and generate responses. They are often written in languages such as C or Perl, and they run in their own process space, separate from the web server.

Servlets, on the other hand, are written in Java and run within the Java Virtual Machine (JVM) of the web server. They are more efficient than CGI programs, as they do not need to start a new process for each request, and they can be easily shared among multiple requests.

Servlets are commonly used in modern web development to implement the server-side logic of a web application. They can be used to handle requests, generate responses, access databases, and perform other tasks that are needed to support the application.
```

#### **`How do servlets work?`**
```
Servlets are Java classes that are used to handle requests and generate responses for a web application. They are designed to run within the Java Virtual Machine (JVM) of a web server, such as Apache Tomcat or Jetty.

To create a servlet, you would first define a Java class that extends the javax.servlet.http.HttpServlet class and overrides one or more of its methods. The HttpServlet class provides a number of methods that correspond to different HTTP request methods (e.g., doGet(), doPost(), doPut(), etc.), and you can override these methods to provide the desired behavior for your servlet.

Suppose you have defined a class MyServlet which extends httpservlet class and overriden do get method from it. 
So When a GET request is received by the servlet, this method will be called to handle the request and generate the response.

To deploy the servlet, you would typically create a deployment descriptor (a file named web.xml) that defines the servlet and maps it to a specific URL pattern. The servlet container (the part of the web server that manages servlets) would then load the servlet and register it with the web server.

When a request is received by the web server that matches the URL pattern of the servlet, the servlet container will create an instance of the servlet and call the appropriate method (e.g., doGet(), doPost(), etc.) to handle the request and generate the response. The servlet can then use the HttpServletRequest and HttpServletResponse objects that are passed to it to access the request data and generate the appropriate response.

For example, the servlet might use the HttpServletResponse object to set the HTTP status code, headers, and body of the response, and it might use the HttpServletRequest object to access the parameters, headers, and other data that was sent with the request.

Once the servlet has finished handling the request, it can use the HttpServletResponse object to send the response back to the client. The servlet container will then destroy the servlet instance and return the response to the client.
```

#### **`Does the data binding takes place in servlet and how and at which stage`**
```
Data binding is the process of converting data from one format to another, typically for the purpose of storing or exchanging data. In the context of a servlet, data binding might involve converting request data (such as form data or JSON payloads) into Java objects, or converting Java objects into a format that can be sent as a response (such as JSON or XML).

```

#### **`What is jsp ? `**
```
JSP (JavaServer Pages) is a Java-based technology for creating dynamic web pages. It is used to create web content that is generated on the server side, based on user input or other data.

```
#### **`Why there was a need for jsp ? `**
```
JSP was developed as an alternative to traditional CGI (Common Gateway Interface) programs, which are separate executables that are invoked by a web server to handle requests and generate responses. JSP allows developers to create dynamic web pages using a simple, HTML-like syntax, and it is executed by a JSP container (usually part of a web server) that translates the JSP code into Java servlets.

```
#### **`How its used with servlets ?`**
```
JSP is often used in conjunction with servlets, which are Java classes that are used to handle requests and generate responses for a web application. Servlets are more efficient than CGI programs, as they do not need to start a new process for each request, and they can be easily shared among multiple requests. JSP pages can be used to generate the content of a response, and servlets can be used to handle the logic and processing of the request.
```
#### **`What are beans in java ?`**
```
Beans in Java are simple Java classes that are used to store and manage data in an application. They are often used in conjunction with JSP pages to store and manipulate data that is displayed in the user interface of a web application. Beans are typically used to represent business data or other types of data that need to be accessed and manipulated in the application.

Java beans can be used to store and manipulate data that is displayed in the user interface of a web application. For example, a bean might represent a customer record, an order, or other business data that needs to be accessed and manipulated in the application. The bean might define properties (such as the customer's name, address, and phone number) and methods (such as a method to calculate the total cost of an order) that can be used to access and manipulate the data.
```

#### **`Why use Sping boot ?`**
```
The Spring framework is a Java-based application development framework that provides a number of features and tools for building enterprise applications. One of the key features of Spring is its ability to simplify the development of web applications by providing a number of abstractions and utilities for common web development tasks.

In the context of servlets, JSP, and Java beans, the Spring framework provides a number of features that can simplify the development process:

Dependency injection: Spring provides a dependency injection (DI) mechanism that allows you to declaratively specify the dependencies of your beans, rather than hard-coding them in your code. This can make your code more flexible and easier to test, as you can easily swap out different implementations of a dependency without changing your code.

MVC framework: Spring provides a Model-View-Controller (MVC) framework that can be used to build web applications. The MVC framework separates the presentation layer of the application (the view) from the business logic (the controller) and the data model (the model). This can make it easier to develop and maintain web applications, as the different layers of the application are more loosely coupled.

Data binding: Spring provides a data binding mechanism that can be used to convert request data (such as form data or JSON payloads) into Java objects, and to convert Java objects into a format that can be sent as a response (such as JSON or XML). This can simplify the process of handling request data and generating responses in a servlet or JSP.

Persistence support: Spring provides support for working with databases and other persistence technologies, such as JDBC, Hibernate, and JPA. This can simplify the process of accessing and manipulating data in a web application, as you can use Spring's persistence APIs rather than working directly with the persistence technology.

In general, the Spring framework provides a number of features and tools that can simplify the development of web applications using servlets, JSP, and Java beans. It provides abstractions and utilities that can help to reduce the complexity of common web development tasks, such as dependency injection, data binding, and persistence support.

By using the Spring framework, developers can focus on building the business logic and features of their application, rather than worrying about the low-level details of working with servlets, JSP, and Java beans. This can result in more efficient and effective development, and it can make it easier to maintain and evolve the application over time.

In addition to simplifying the development of web applications, the Spring framework also provides a number of other features and tools that can be used to build enterprise applications, such as support for security, transactions, and messaging. These features can further simplify the development process and help to build more robust and scalable applications.

Overall, the Spring framework is a powerful and popular tool for building Java-based applications, and it is particularly useful for simplifying the development of web applications using servlets, JSP, and Java beans.

```

#### **`How much data can we put in post request?`**
```
There is no inherent limit on the size of a POST request in HTTP, but many servers and clients have their own limits in place. For example, some servers may have a maximum limit on the size of a request body, or on the total size of all request headers. Some clients may also have limits on the amount of data they can send in a single request.

In general, it is a good practice to keep the size of a POST request as small as possible, to minimize the amount of data that needs to be transferred and to reduce the risk of errors or timeouts. If you need to send a large amount of data, you may want to consider using other methods, such as sending the data in multiple smaller requests, or using a different protocol, such as FTP or SFTP, which are specifically designed for transferring large amounts of data.
```
