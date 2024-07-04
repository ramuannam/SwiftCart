So now in this lecture, let's try to spend few minutes understanding what is spring MVC, what is an
MVC pattern and how it is helping us in building web application with a very less efforts.

refer:slide no 77.

>* So back in the days in the early 2000, everyone used to develop a web application with the help of
servlet, HTML and Java JDBC code, and they used to club everything wherever they want, like inside
JSP pages They used to write a lot of business logic, inside servlets  they used to write a HTML code.
>* So with that there is no proper segregation between the business logic, UI code and the data layer.
>* eg: So anytime someone wants to make a change, suppose as an developer, if I don't know how to work on
the UI code, then it will be very tough for me to go and make a change related to a business logic
inside an UI file like JSP.\
And similarly, if I am a strictly an UI developer, it will be very tough for me to go to a backend
servlet class and make some changes inside it in terms of HTML code.

>* So that's where the software development industry came with a new pattern called MVC pattern.
>* 1. view: So inside this pattern we are going to separate all the UI related code into the view part.
So usually the view represents UI code and <mark>takes data from the controller </mark>and display it with the help
of HTML pages, CSS, JavaScript.
>* 2. controller: controller is a main part of your MVC pattern.\
It acts like a brain inside your MVC pattern because it controls the flow of your web application,
which controller it needs to execute, which method it needs to execute, what is the business logic,
So all those control is available inside the controller.\
That's why we the name itself is very self-explanatory.
>* 3. Model: model represents the data of the application like that you want to display on your UI.\
Like if you want to display the list of students, obviously the controller will ask the model layer,
which is like, go ahead and fetch the data from the database
and once the model layer gives that information to the controller layer,Controller layer will hand over that to the view layer.
.
So this way they all work with each other and it will also make our developers lives easy because we
are separating all the code into model view and controller.\
So in future, if there is a bug identified inside the model, then we know where to make the change
and definitely it will not regress anything on the view and controller side.\
And the same applies for the other two components also.

>So if someone asks you what is the <mark>purpose of the MVC pattern</mark>, 
>* The primary purpose of the MVC pattern
is to achieve loose coupling between the components that you have inside your web application, like
view, backend code and persistent code.

> So now let's try to understand how spring MVC works internally by taking this MVC pattern into consideration.\
So this is the spring MVC architecture and its internal flow.\
> refer slide: 78
>* 🔥step:1  a web client will make a request to the backend application.\
A web client can be an desktop, it can be a mobile, it can be a tab or laptop, wherever it is coming
from, It's a request to the web application.
>* 🔥 step:2  So since my web application is deployed into a <mark>servlet container like a Tomcat server</mark>, my Tomcat server
take that request, which is coming in the form of HTTP protocol.\
And now once my Tomcat receives that HTTP request, it will convert that request from HTTP request to
the servlet request and hand over to the servlet inside Spring MVC, which is the Dispatcher Servlet.
>* (like we are discussing previously, whenever you are building a web application with the help of Spring
MVC, you don't have to worry about any servlet definition, servlet path definition mapping between
them because all the magic will be done by a single servlet called Dispatcher Servlet.
So this Dispatcher Servlet is available inside your Spring MVC framework code.)
>* So whenever we are building a web application with the help of Spring MVC and deploying to a Tomcat,
my Tomcat knows that it has to hand over the request to the Dispatcher Servlet so we can call this <mark> Dispatcher
Servlet also known as a front controller</mark> because this is the very first controller which will receive the
request from the client.\
So that's why some people, they call it as front controller also.\
>*  Now my Dispatcher Servlet know only
which path the user is trying to access, whether it is a /home, /contact, /courses,
the path can be anything.\
My Dispatcher Servlet know what is the path that the end user is trying to invoke and it does not maintain
all these configurations with itself.\
So it will go and ask handler mapping.
>* 🔥 step:3  So <mark>handlerMapping</mark> again is one of the component inside Spring MVC framework, which will load all the
configurations that we have done inside spring application and have it ready that way.\
Whenever Dispatcher Servlet is asking for certain information, it will provide with the controllers
configurations that we have done.
>* eg: Like in this scenario I have configured HomeController and displayHomePage() for three different
type of paths.\
One is home, the second one is /, and the third one is empty value.
Like if someone is trying to access the route path of my web application, which is localhost 8080.
So this kind of information will be read by my handler mapping during the startup of the application
and handler mapping will have all the controllers information along with the method names along with
the path names that they support.\
>* Then handler mapper will say, Hey friend, don't worry, I have all the information.\
So since you said the user is trying to access the /home, please go ahead and invoke HomeController
class.\
And inside that there is a method called displayHomePage().\
So as soon as my DispatcherServlet knows that information, it will invoke the corresponding <mark>controller</mark>.
>* 🔥 Step:4 So here the controller is HomeController.\
So once my HomeController process all the information and my controller will return, what is the view
that we want to display to the end user as a response.\
>* Again, my DispatcherServlet receives the view name which is home.html.\
and this time also my Dispatcher Servlet doesn't know
like if someone gives some HTML name, it doesn't know like what to do with that because there can be
some dynamic content.\
So it's not the responsibility of the DispatcherServlet to convert that dynamic content into an HTML
page after loading all the data and respond to the end user.\
So that's where it will take the help of the another object at the fifth step, which is ViewResolver.\
>* 🔥 step:5 So it is the responsibility of the <mark>**ViewResolver**</mark>.\
Whenever my controller layer return a view name in this case home.html.\
And if there is a scenario where I'm also sending some dynamic data with the help of model, it is the
job of the view resolver to compile all the dynamic information to pass that all the dynamic information
present inside my template files like home.html.\
>*  Once my ViewResolver done all the job of resolving the dynamic content, populating the values inside
template and generating a proper HTML file,
It will give the same information to the DispatcherServlet.\
>* 🔥 step:6 and now my DispatcherServlet have a complete view details information received from the ViewResolver
and the same information it will hand over to the Tomcat in the format of servlet response
or HTTP servlet response.
>* 🔥 STEP:7  And obviously the job of tomcat
is to take that servlet response at the step six and convert that servlet response to a HTTP response
and send it to the browser.\
And my browser simply displays the data that it receives in the form of HTML code, CSS and JavaScript.\

> REFER SLIDE: 79

> So if you look here inside the project, we are nowhere worrying about DispatcherServlet, HandlerMapping
ViewResolvers.\
So all that will be handled internally by the spring MVC framework.\
As a developer, it's our responsibility to just write our business logic by creating the controller
classes, by creating the methods.\
And we should also define our configurations with the help of RequestMapping, What are the paths,
What is the view name, that we want to return.

* So all that business logic definitely as a human being or as a developer, I need to write.

* So if you open the HomeController which is present inside the example_19 here, you can see we have
a controller, we have a view which is home.html. This is a template.\
So this template will be taken by my view resolver and it will pass the dynamic information that I'm
sending with the help of model object.\
So this simple implementation that we have is showing MVC pattern in a clear picture.\
So there is a controller which I separated into that home controller.\
So there is a model class.(Which is inbuild class for model object for data handling)\
So there is a Home.html which is present in a separate file.
