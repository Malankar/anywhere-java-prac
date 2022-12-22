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
> **`Instantiation:`** The servlet class is instantiated, creating a new instance of the servlet.
>
> **`Initialization:`** The servlet's init() method is called, allowing the servlet to initialize itself and perform any necessary setup. The init() method is called when the servlet is first created.
>
> **`Request handling:`** The servlet handles client requests by calling its service() method and generating a response.
>
> **`Destruction:`** When the web application is undeployed or stopped, the servlet's destroy() method is called, allowing the servlet to release any resources and perform any necessary cleanup.

#### What is difference between query parameter and path variable in java ?

> A query parameter is a piece of information that is included in the
> query string of a URL. It is used to pass data from a client to a
> server
>
> A query parameter has the form "name=value" and is separated from the
> rest of the query string by a "&" character. Multiple query parameters
> can be included in a single query string, separated by "&" characters.
>
> On the other hand, a path variable is a piece of information that is
> included in the path of a URL. It is used to specify a resource or
> action that is specific to a particular URL path.
>
> A path variable is typically represented as a placeholder in the URL
> path, surrounded by curly braces ({}). The value of the path variable
> is extracted from the URL and passed to the server as a request
> parameter.
> In summary, a query parameter is a piece of information that is included in the query string of a URL and is used to pass data from a client to a server, while a path variable is a piece of information that is included in the path of a URL and is used to specify a resource or action that is specific to a particular URL path.

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

> **`Single threaded model`**: Servlets are designed to run in a single threaded model, which means that each servlet instance can only handle one request at a time. This can be a disadvantage if your application needs to handle high traffic or large amounts of data, as it can lead to poor performance and slow response times.
>
> **`Lack of asynchronous support:`** Servlets do not provide built-in support for asynchronous processing, which means that they are not well-suited for tasks that require long-running operations or that need to handle multiple requests concurrently. This can be a disadvantage if your application needs to perform tasks such as database queries or network I/O that take a long time to complete.
>
> **`Lack of non-blocking I/O support:`** Servlets do not provide built-in support for non-blocking I/O, which means that they can block the thread that is handling a request while waiting for a response from an external resource such as a database or a network socket. This can lead to poor performance and slow response times, especially when handling high traffic or large amounts of data.
>
> **`Lack of support for modern web development practices:`** Servlets do not provide built-in support for modern web development practices such as dependency injection, annotations, or MVC (Model-View-Controller) frameworks. This can make it more difficult to develop modern web applications using servlets and can lead to code that is less maintainable and scalable.
>
> **`Lack of portability:`** Servlets are specific to the Java platform and are not portable to other languages or platforms. This can be a disadvantage if you need to deploy your application to a platform that does not support Java or if you want to use a different language for your server-side code.

