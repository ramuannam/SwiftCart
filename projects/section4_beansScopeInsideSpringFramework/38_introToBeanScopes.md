So far in the course we have discussed how to create a bean, how to define the dependencies, how to inject the dependencies to a bean with the help of dependency injection and autowiring.

* But we never discussed about how a bean and when a bean will be created by the spring IOC container.

* previously as we discussed the car example where  a simple scenario, where a single  user running my application, 
but in production scenario there can be multiple threads running inside your application.

* There can be multiple users accessing your application.
* So in those scenarios, how my spring is going to give the dependencies like beans, whether it will
give every time the same bean reference or it will create a new bean every time I ask a spring context
for a bean reference.

>> So all these kind of tied to the concept called <mark>scopes</mark> inside spring.

* So as of now we build the application with the default scope of bean, which is singleton scope.

>Bean scope is a concept inside spring which will define how a bean has to be created and maintained
by spring IOC container.\
whether it needs to be maintained forever inside an application till the restart happens, or whether it needs to create a new bean every time a reference is asked.
>* There are five types of scopes are available inside spring.
And based upon our requirement, we can choose any one of them.
>* 1.Singleton
>* 2.Prototype
>* 3.Request
>* 4.Session
>* 5.Application.\

>The request, session and application scopes are related to the web applications.\
> So that's why we will be discussing these scopes when we are building web applications with the help
of Spring framework by using spring MVC.
> * singleton scope, which is the default behavior of the spring
