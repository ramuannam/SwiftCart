So previously I was telling before the invention of spring framework developers has to do a lot of configuration
and they have to create servlet for each and every URL path inside your web application.

But with the invention of spring framework, they don't have to do that.

They can simply rely on the dispatcher servlet.

But that is not enough for the industry.

The industry need more and more to reduce the burden on developers.

The reason is there are many new styles of development, like microservices.

Docker containers came into picture, so due to that spring framework, build a new sub project called
Spring Boot as an answer to all the latest trends of software development.

>* So before Spring Boot, whenever I want to build a java based web application, I need to configure
a servlet container, whether it might be a Tomcat, whether it can be a jetty server or any server.
>* First, I need to download that server and I need to configure that inside my eclipse IDE post that
I need to establish a link between Tomcat and dispatcher Servlet provided by the Spring framework,
which means I need to deploy my web applications which I built with the help of Spring framework and
dispatch servlet into the Tomcat.
>* And I also need to mention a small configuration inside web.xml about dispatcher Servlet.
>*  Suppose that I need to deploy into server and also I need to do certain configurations like what is
the port that server has to start, what are my database credentials, what are my properties?
So there are many configurations.
>* So industry very much appreciated
that spring framework reduced a lot of work compared to the work that we used to do in 2000.


But slowly developers again started asking we need something else which help us in adopting latest trends
like microservices, docker containers very efficiently.

So that's where Spring Boot came into picture.

>definitely we can create a spring boot web application and this is because it helps eliminating lot
of configurations about dispatcher servlet or servlet container or any dependencies.\
So all those configurations are eliminated with spring boot
that's why creating a web application with the help of spring boot can be done within a matter of minutes
or even seconds.

>refer the slide 1. hero of springframework (which is springboot)  2. before & after springboot to understand more
