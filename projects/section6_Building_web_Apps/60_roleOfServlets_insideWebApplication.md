

In the previous lecture we discussed a high level what is a web application, and we also discussed inside java ecosystem.
There is a servlet container which does all the magic of converting that HTTP protocol messages to servlet
objects.

Now in this lecture, let's try to understand what is the role of servlets inside a web application
and how the development of web application used to happen before the invention of the spring framework
itself.

That's why I'm trying to share as much details as possible around servlets and servlets container.

>* Though it is not required for building web applications with the spring framework.

But you should know how things works internally behind the scenes when you build a web application, how the request and response will be processed.
What are the elements that play a crucial role behind the scenes?

* So with that, let's jump on to that topic of roles of Servlets Inside web application.

> * Before the invention of the Spring framework, all the developers are forced to create a servlet for each
and every URL path that your web application is going to serve to its web clients.
> * Like my application, which is hosted under the domain name example.com can have URL paths like slash home, slash login, slash dashboard.
> *  so <mark> before the invention of the spring framework, the developers are forced to create a servlet for each 
and every path that you are going to define inside your web application</mark> .
>* So I take an example of three URLs inside my application.
So for that, definitely the developer has to create the servlets like home servlet, login servlet
and dashboard servlet.
>* And after creating these servlets, developer also has to do configurations inside web.xml saying that
for so and so URL path, the servlet is so and so like for slash home URL path, I should tell the corresponding
servlet is home servlet.\
So this way there is a lot of configuration and a lot of unnecessary code that developer has to write
before the invention of spring framework and whatever configurations that I defined inside the root
file, which is web.xml, is a input to my servlet container or Apache Tomcat server.
>* So when I try to deploy my web application into a server, my servlet container, which is staying inside
my Apache Tomcat, it will try to understand all the configurations that developer made and based upon
the path present inside the HTTP request that coming from the web client, it will try to identify the
corresponding servlet.
>* And after converting that HTTP message request to a corresponding servlet request object, it will hand
over the execution to the home servlet or login servlet or dashboard servlet.
>* And once the servlet executes all the business logic process the data stores the data into your database.
>* they will again return the servlet response object to the servlet container and the servlet container
take that response object and convert that into HTTP response message and hand over to the web clients
to display the data on the browser.
>* So this is the story that used to happen before the spring invention.


Now, after introducing the spring framework, let's see what is happening.
> So nowadays, with the help of spring, developers don't have to create servlets or they don't have
to configure the relationship between the URL and the corresponding servlet because spring itself has
an servlet called dispatcher servlet.
>* So this servlet is present inside the Spring Framework code.
>* As a developer, I will do very minor configurations inside my web application based upon those minor configurations
my dispatcher Servlet is smart enough to detect all those configurations
and handle all my requests coming from my servlet container.

>When we build applications with the help of Spring framework for now, have an understanding that whenever
you are building an application with spring, you don't have to create servlets and you don't have to
do configurations inside web.xml the dispatcher servlet, which is provided by the spring framework,
is going to do all that magic for you.

>And please, please make a note that with the invention of spring, it's not like servlet we are no
more using.\
It's just that the responsibility is moved from the developer to framework, which is spring.
In our case.

>* for more refer slide.


>servlet vs dispatch servlet\
>* A servlet is a Java class that extends the capabilities of a server to handle HTTP requests and generate dynamic
   > web content. It is a fundamental component of Java web development and is used to extend the functionality of web servers. Servlets are designed to handle HTTP requests and responses, and they can be used to implement various web applications, such as web services, web applications, and web frameworks.
>* On the other hand, the Dispatcher Servlet is a specific type of servlet that acts as the front controller for
   > Spring-based web applications. It handles incoming HTTP requests, delegates them to the appropriate handler objects, and processes the requests according to the configured HandlerAdapter. The Dispatcher Servlet is responsible for managing the flow of requests and responses in a Spring-based web application and is a crucial component of the Spring Framework.
>> Key differences between servlets and Dispatcher Servlets include:
>* Purpose: Servlets are general-purpose HTTP request handlers, while Dispatcher Servlets are specifically designed to
   > handle requests in a Spring-based web application.
>* Functionality: Servlets handle HTTP requests and responses, while Dispatcher Servlets manage the flow of requests
   > and responses in a Spring-based web application.
>* Implementation: Servlets are part of the Java Servlet API, while Dispatcher Servlets are part of the Spring
   > Framework.
   In summary, servlets are a fundamental component of Java web development, while Dispatcher Servlets are a specific type of servlet designed to handle requests in a Spring-based web application.



>Dispatcher Servlet vs Tomcat\
> 1.Dispatcher servlet
>* Purpose: The Dispatcher Servlet is a servlet that acts as a front controller, handling HTTP requests and dispatching
   them to the appropriate handler objects. It is a key component in the Spring Framework, responsible for managing the flow of requests and responses in a Spring-based web application.\
>* Functionality: The Dispatcher Servlet handles incoming HTTP requests, delegates them to the configured
   HandlerAdapter, and processes the requests according to the implemented Handler interfaces. It is responsible for mapping URLs to controller methods and handling the responses generated by these methods.\
> 2. Tomcat:
>* Purpose: Tomcat is a servlet container, which is an implementation of the Jakarta Servlet specification. It provides
   a runtime environment for Java servlets, managing their lifecycle and handling HTTP requests and responses.\
>* Functionality: Tomcat listens for HTTP requests, routes them to the responsible servlets, and handles the I/O
   required to communicate with the client. It supports the servlet API, including JSP and JSTL, and can be used as a standalone web server or in combination with other web servers\
>> Key Differences:
>* Purpose: The Dispatcher Servlet is a specific servlet designed for handling requests in a Spring-based web
   >application, while Tomcat is a general-purpose servlet container that can host various web applications.
>* Functionality: The Dispatcher Servlet focuses on handling requests and dispatching them to handler objects, whereas
   > Tomcat manages the lifecycle of servlets and handles HTTP requests and responses.
>* Implementation: The Dispatcher Servlet is part of the Spring Framework, while Tomcat is a standalone servlet
   > container that can be used with various web frameworks and technologies.



refer 1& 2 images.
