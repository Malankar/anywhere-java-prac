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
#### **`Explain all the rest verbs ?`**
```
In the HTTP protocol, a verb (also known as a method) is a special type of request header that specifies the type of action being requested by the client. There are several different HTTP verbs that can be used to request different types of actions from the server. 
Some of them are:

GET: This verb is used to request a resource from the server. It is used to retrieve web pages, images, and other types of content.

HEAD: The HEAD verb is often used to check the status of a resource without transferring the entire resource. For example, a client might use HEAD to check the last-modified date of a webpage, or to see if the webpage has been updated since it was last retrieved. This can be more efficient than using GET, which would transfer the entire webpage, because it avoids the need to transfer the contents of the webpage.

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