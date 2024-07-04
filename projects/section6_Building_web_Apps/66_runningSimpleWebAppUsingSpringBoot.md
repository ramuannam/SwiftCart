Usually Spring Boot have its own versioning, and whereas spring core and spring other projects, they'll have their own versioning system.

So here all the Spring Boot, we are seeing a version 3.0.6, whereas spring core libraries like spring web and spring web mvc, they have a version called 6.0.8.

If you have to do all these research of which version of spring core libraries will match for so and
so version of spring boot version, then it's going to be tedious job.

Whereas with a single dependency, with the help of starter projects, all this is going to be handled
by the Spring Boot Framework.

🔥with the help of spring boot starter projects, we should be able to generate
the Maven project within seconds, and most of the configurations dependencies, management is going
to be taken care by the spring boot framework.


>so version of spring boot version, then it's going to be tedious job.
Whereas with a single dependency, with the help of starter projects, all this is going to be handled
by the Spring Boot Framework.

>* You can also open the spring web dependency that we have here.
>* Under these, it internally has many other dependencies declared like spring beans, spring core, micrometer
observation and very similarly, if you go and check the spring web mvc dependency, this is the pom.xml of spring
web mvc.
>* And inside this we have spring-aop, spring-beans, spring-context, spring-core, spring-expressions,
spring-web.
>* So if you try to go inside of all these pom.xml, you will see hundreds of dependencies with different,
different versions.
>* And all of these we are able to achieve with a single dependency.
That is the power of spring boot starter projects.

>So always if someone asks you what do you like about the spring boot, then this should be your very
first answer, which is with the help of spring boot starter projects, we should be able to generate
the Maven project within seconds, and most of the configurations dependencies, management is going
to be taken care by the spring boot framework.



>Spring Boot Main application class:
>* So inside this project, this is going to be the main application class for this spring boot application.
>*  How I'm telling that this is going to be main class is, this has an annotation called @SpringBootApplication.
>* 🔥Whenever you try to start a spring boot based web application, it is going to look for a class which
   has an annotation @SpringBootApplication from this class
   only the bootstrapping or the initialization of the web application will happen.
>* If you can recall, when we are discussing spring core concept, I explained you about the importance
of the @Configuration annotation,The same we are using with the help of this @SpringBootConfiguration annotation 
>* and similarly we have @EnableAutoConfiguration annotation,So this is going to tell to my spring boot framework Please configure all interrelated dependencies that are needed by my web application automatically.
>* Like in this scenario, we are trying to build a web application, but internally my spring boot is
going to assume some default configurations and it is going to configure some default parameters, for
example, to run my web application, I need a tomcat server. By following the same assumption my spring boot framework internally, it is going to auto configure the embedded tomcat server, to enable all those auto configuration
we need to use this annotation.
>* and you already know what is the purpose of @ComponentScan annotation Using these @ComponentScan annotation
my spring framework is going to scan all the packages and classes present inside those packages and
accordingly it is going to declare the spring beans configurations of your web application.
>* This is super, super important Interview question.
>* 🔥So @SpringBootApplication is an annotation, which is a combination of @SpringBootConfiguration,
   > @EnableAutoConfiguration and @ComponentScan. (ctl+left click on @SpringBootApplication to check what it have)
>* So always remember that by looking at these annotation, which is @SpringBootApplication, you should
easily identify what is the main class of your web application.

>So when we start this application, we want to invoke a page inside a web application where it will
show some output.\
So in order to do that, I can create a HTML file and a static folder.\
So I'll go to the static folder, click create new HTML file and I'll name it as home.html.\
>So now you can ask me how my spring boot application knows there is a HTML file under the static folder.\
🔥So that's where comes the beauty of SpringBootAutoConfiguration.
>* So by default spring boot look for the static files under the static folder so you don't have to do any extra configuration telling
to your spring boot web application about the static folder location.
>* Until unless you want to use a different folder location, you should be good with this default configurations
without providing any extra configurations to your web application.


>> this home.html is a view to your web application, but how do you invoke that page, when you
invoke that path in the browser,
Spring Application has to understand that it needs to redirect to this home.html.
>* So to do that configuration we have to create a controller class, where it acts like controller of all the 
   > requests and fetch the details (Like if someone is trying to open /home path, they need to be redirected to the home.html. )



  ```
package com.hustlers.scalerNet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    //So now I have a controller class, but I need to define inside a method.
    //Like if someone is trying to open /home path, they need to be redirected to the home.html.
    //For that, I'm going to write a method with the name displayHomePgae().

    @RequestMapping("/home") //This(@RequestingMapping("/home")) indicates to my spring web application if anyone is trying to access /home path inside myweb application,they need to be redirected to this controller with the name HomeController and inside this method, which is displayHomePage().
    //RequestMapping is an annotation which is generic, regardless whether you want to use getHttp() or postHttp().
   // So in the scenarios where you don't want to define whether you want to allow http post or http get request or the browser, you can choose the RequestMapping, annotation and whatever value that you see inside  it. This is the path name that is supported by this method.
    public String displayHomePage() {
        return "home.html";
    }

}
``` 

> so here you can see I have not done any changes related to servlet.
>Even with zero knowledge on servlets, you can create this web application, because internally Spring Boot
>is going to create a 🔥DispatcherServlet.
>* So whenever someone is trying to invoke /home path, your DispatchServlet knows there is
a controller inside my web application with the name HomeController and it has a method which is handling
the path /home and it will does all that magic for you.
>* So you're not doing any configurations, you as a developer just defining the paths and the business
logic and the views that you want to display.


* By looking at the annotation @SpringBootApplication.(main class)
* So I'm just clicking this run option here.
* If you look at the console, my tomcat, which is embedded into my web application by the spring boot
is started at the default port 8080 and with the context path empty.
* So these are the default configurations or AutoConfigurations done by your spring boot application.
So I nowhere mentioned that this is the port that it needs to consider.\
I also didn't mention any context path to my web application.\
🔥Context path is something which is root path to your web application.\
* So even though I didn't mention all those values, Spring Boot Auto Configurations by going with the
convention rules or default values.
* So now I can go to your browser and I can access the path localhost:8080/home and I should be
able to see the content inside home.html


>so whenever you want to create multiple projects with the help of Spring boot application, you should
be able to create them within a matter of seconds or minutes.
