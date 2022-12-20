Here is an example of a simple servlet that handles GET requests and uses a Java bean to store and manipulate data:

```java
import javax.servlet.http.*;

public class MyServlet extends HttpServlet {

  protected void doGet(HttpServletRequest request, HttpServletResponse response) {
    // Get the customer ID from the request
    String customerId = request.getParameter("customerId");

    // Retrieve the customer bean from the database
    Customer customer = retrieveCustomerById(customerId);

    // Set the customer bean as an attribute of the request
    request.setAttribute("customer", customer);

    // Forward the request to the JSP page to generate the response
    request.getRequestDispatcher("/customer.jsp").forward(request, response);
  }

}
```

`
In this example, the servlet receives a GET request and retrieves a customer bean from a database using the customerId parameter that was passed with the request. The customer bean is then stored as an attribute of the request, and the request is forwarded to a JSP page (customer.jsp) to generate the response.
`

Here is an example of a simple JSP page that displays the data from the customer bean:

```html
<html>
  <body>
    <h1>Customer Information</h1>
    <p>Name: ${customer.name}</p>
    <p>Address: ${customer.address}</p>
    <p>Phone: ${customer.phone}</p>
  </body>
</html>
```
`
In this example, the JSP page uses Expression Language (EL) to access the properties of the customer bean and display the data in the HTML page. The JSP page is executed by the web server, and the resulting HTML is sent back to the client as the response.
`

Finally, here is an example of a simple Java bean that represents a customer:

```java
public class Customer {

  private String name;
  private String address;
  private String phone;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

}
```
`
In this example, the Customer class is a Java bean that represents a customer record. It has three properties: name, address, and phone, and it has getter and setter methods for each property. These methods can be used to access and modify the data that is stored in the bean.
`

Java beans are often used in conjunction with JSP and servlets to build web applications. In the example above, the servlet retrieves the customer bean from a database and stores it as an attribute of the request. The JSP page then accesses the bean and displays the data in the HTML page.


