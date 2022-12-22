#### What are Servlet ?

> Servlets are the Java programs that run on the Java-enabled web server or application server. They are used to handle the request obtained from the webserver, process the request, produce the response, then send a response back to the webserver.
>
> Servlets are used to create dynamic web content and handle client requests. They run on the server side, and can be used to process form data, authenticate users, track sessions, and much more.

#### Advantages of a Java Servlet ?

> Servlet is faster than CGI as it doesn’t involve the creation of a new process for every new request received.
> Servlets, as written in Java, are platform-independent.
> It is a server-side component, so Servlet inherits the security provided by the Web server.

#### Servlet Container?

> Servlet container, also known as Servlet engine is an integrated set of objects that provide a run time environment for Java Servlet components.
> In simple words, it is a system that manages Java Servlet components on top of the Web server to handle the Web client requests.

#### Servlet lifecycle

> A servlet is a Java class that is designed to extend the capabilities of a server. It runs on the server side and is used to handle client requests and generate responses.
>
> The servlet lifecycle refers to the sequence of events that occurs when a servlet is created, initialized, and destroyed. Here is an overview of the servlet lifecycle:
>
> **`Class loading:`** The servlet class is loaded into the Java Virtual Machine (JVM) when the web application is deployed or started.
>
> **`Instantiation:`** The servlet class is instantiated, creating a new instance of the servlet. A servlet is instantiated by the web container when the web application is deployed or when the first request is made to the servlet. The servlet's init() method is called to initialize the servlet and perform any required setup tasks.
>
> **`Initialization:`** The servlet's init() method is called, allowing the servlet to initialize itself and perform any necessary setup. The init() method is called when the servlet is first created.
>
> **`Request handling:`** The servlet handles client requests by calling its service() method and generating a response. The service() method is responsible for routing requests to the appropriate handler method based on the request method (e.g., GET, POST, etc.). It is not intended to be overridden by developers, as it is automatically implemented by the Servlet interface.
>
> **`Destruction:`** When the web application is undeployed or stopped, the servlet's destroy() method is called, allowing the servlet to release any resources and perform any necessary cleanup.

#### What is difference between query parameter and path variable in java ?

> A query parameter is a piece of data that is appended to the end of a URL and sent to a server when a client (such as a web browser) makes a request. Query parameters are used to pass additional information to the server and are typically used in situations where the server needs to perform some action or return specific data based on the parameters provided.
>
> Query parameters are separated from the base URL by a question mark (?) and are usually formatted as key-value pairs. For example, in the URL "www.example.com/search?keyword=laptops", the query parameter is "keyword=laptops". The "key" in this case is "keyword", and the "value" is "laptops".
>
> Query parameters are separated from the base URL by a question mark (?) and are usually formatted as key-value pairs. For example, in the URL "www.example.com/search?keyword=laptops", the query parameter is "keyword=laptops". The "key" in this case is "keyword", and the "value" is "laptops".
>
> For example, consider the URL "www.example.com/users/123". In this case, "123" is a path variable that specifies the ID of a specific user. The server can use this ID to look up and return information about the user with the specified ID.

#### Query parameter can used in the users example right like to find the user we can just append www.example.com/users?userId=123 right why use path variable ?
> Yes, it is possible to use query parameters to pass information about a specific user to the server in the example you provided. For example, you could use a URL like "www.example.com/users?userId=123" to request information about a user with an ID of 123.
> However, using a path variable has some advantages over using a query parameter in this case. One advantage is that the URL with a path variable is more descriptive and easier to read. Instead of seeing a generic "www.example.com/users" URL followed by a query parameter, you can see exactly which user is being requested by looking at the URL. This can be helpful for debugging purposes and for understanding the structure of your application.
> Another advantage is that using a path variable can make it easier to build links within your application. For example, if you have a list of users on your website and you want to link to a specific user's profile page, it's much easier to use a path variable in the URL than to try to build a query string with all of the necessary information.
> Finally, using a path variable can also make it easier to implement caching or other optimization techniques on the server, since the server can treat each URL with a unique path variable as a unique resource that can be cached separately from other URLs. This can improve the performance of your application.


#### What is Generic Servlet
> The GenericServlet is a class in the Java Servlet API that provides a generic, protocol-independent implementation of the Servlet interface. It can be used to implement servlets for any protocol, such as HTTP, HTTPS, FTP, or SMTP.
> 

#### What is HttpServlet ?
> The HttpServlet is a class in the Java Servlet API that provides a convenient way to handle HTTP requests and responses. It extends the GenericServlet class and provides additional methods for handling HTTP-specific tasks such as parsing request headers, encoding response headers, and managing sessions.

#### When to use which and difference between them ?
> GenericServlet provides a generic, protocol-independent implementation of the Servlet interface
> HttpServlet extends the GenericServlet class and provides additional methods for handling HTTP-specific tasks.
> The choice between using the GenericServlet or the HttpServlet depends on the type of protocol your servlet needs to support. If your servlet needs to handle any type of protocol, you can use the GenericServlet class. If your servlet needs to handle HTTP or HTTPS requests specifically, you can use the HttpServlet class.
> If you need to implement a servlet that handles a specific protocol, such as FTP or SMTP, you can use the GenericServlet class.
> If you need to implement a servlet that handles HTTP or HTTPS requests, you can use the HttpServlet class. The HttpServlet class provides additional methods for parsing request headers, encoding response headers, and managing sessions, which can make it easier to develop servlets that handle HTTP requests.
> If you need to implement a servlet that handles both HTTP and non-HTTP protocols, you can use the GenericServlet class and override the service() method to handle both types of requests.

#### What are disadvantages of servlet ?

> **`Single threaded model`**: The Single threaded model of servlets means that each servlet instance can only handle one request at a time. This can be a disadvantage if your application needs to handle a high volume of requests simultaneously, as it can lead to slow response times and poor performance. 
>
> **`Lack of asynchronous support:`** The lack of asynchronous support in servlets means that they are not well-suited for tasks that require long-running operations or that need to handle multiple requests concurrently. This can be a disadvantage if your application needs to perform tasks such as database queries or network I/O that take a long time to complete.
>
> **`Lack of non-blocking I/O support:`** Servlets do not provide built-in support for non-blocking I/O, which means that they can block the thread that is handling a request while waiting for a response from an external resource such as a database. This can lead to poor performance and slow response times, especially when handling high traffic or large amounts of data.
>
> **`Lack of support for modern web development practices:`** Servlets do not provide built-in support for modern web development practices such as dependency injection, annotations, or MVC (Model-View-Controller) frameworks. This can make it more difficult to develop modern web applications using servlets and can lead to code that is less maintainable and scalable.
>
> **`Lack of portability:`** Servlets are specific to the Java platform and are not portable to other languages or platforms. This can be a disadvantage if you need to deploy your application to a platform that does not support Java or if you want to use a different language for your server-side code.

#### What is servlet cofig ?
> ServletConfig is an object containing some initial parameters or configuration information created by Servlet Container and passed to the servlet during initialization. ServletConfig is for a particular servlet, which means one should store servlet-specific information in web. xml and retrieve them using this object.

#### What is servlet context ?
> Defines a set of methods that a servlet uses to communicate with its servlet container, for example, to get the type of a file, dispatch requests, or write to a log file. There is one context per "web application" per Java Virtual Machine.
> An object of ServletContext is created by the web container at time of deploying the project. This object can be used to get configuration information from web.xml file.
> Advantage of ServletContext
>
> Easy to maintain if any information is shared to all the servlet, it is better to make it available for all the servlet. We provide this information from the web.xml file, so if the information is changed, we don't need to modify the servlet. Thus it removes maintenance problem
>
> Usage of ServletContext Interface
>
> The object of ServletContext provides an interface between the container and servlet.
> The ServletContext object can be used to get configuration information from the web.xml file.
> The ServletContext object can be used to set, get or remove attribute from the web.xml file.
> The ServletContext object can be used to provide inter-application communication.

#### Can a destory method be called after every request and if it is done is it efficient or not efficient ?
> The destroy() method of a servlet is called by the web container when the web application is undeployed or stopped, allowing the servlet to release any resources and perform any necessary cleanup. It is not intended to be called after every request.
> Calling the destroy() method after every request would not be efficient, as it would require the web container to instantiate a new instance of the servlet for each request, which would use up resources and degrade performance. It would also prevent the servlet from being able to maintain state between requests, as the servlet instance would be destroyed after each request.