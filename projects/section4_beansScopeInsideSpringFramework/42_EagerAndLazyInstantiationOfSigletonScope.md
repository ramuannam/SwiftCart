Like we are discussing previously whenever we are using singleton bean scope, the spring IOC container
will maintain only one object reference inside an entire application and it will try to give the same
bean reference to all the places it is being referred.

* But we can also control when the spring IOC container how to create this, The single object instance that spring IOC container is trying to create.
>By default, we know spring IOC container will try to create all the beans during the startup of the  application.
So this is called <mark> Eager instantiation</mark>.\
>Eager instantiation is the spring IOC container is trying to initialize all  the singleton beans eagerly during the startup itself, regardless of whether you are going to use it or not inside your application.

>But we can change this default behavior to initialize the singleton bean lazily only when the application is trying to refer it very first time.\
So this approach is called <mark>lazy instantiation</mark>.
>* EG: Most of the times you should be going for the eager instantiation, but there might be scenarios where
the bean that you have defined as a singleton scope, it have a business logic which will be executed
in a very remote scenarios like if you have an e-commerce application, maybe you have a functionality
which user is trying to execute to deactivate his account or to close his account.\
So this is a very rare scenario or very remote scenario.\
Very few people try to do this action.\
So these kind of beans, which holds this remote kind of scenarios you don't want to create during the
startup because there is a very good chance that your application may never use that bean or your application
may never invoke that business logic.
>* And creating all these beans during the startup itself will waste a lot of memory of your application,
and it will also create performance issues inside your application.\
If there are too many beans that my spring IOC container needs to hold.


>* But there is a problem with the lazy instantiation.\
The problem is suppose if there is an exception happens during the bean creation, you will get runtime
exceptions inside your applications once the server is started and the user may see some exception on
the web application or the UI page.
>* Whereas with the eager instantiation, if there is a problem creating a bean for a specific Java class,
your server startup itself will fail.\
So that's an advantage that you have with the eager instantiation.

* So that's why please try to go always with the eager instantiation, which is default behavior and you
don't have to define any configurations for the same.

>* But if there is a scenario where you have too many beans inside your application and there are good
amount of beans which handles the very remote logics or very remote scenarios inside your application,
you can definitely define them or configure them to create lazily with the help of lazy instantiation with the help of @Lazy
annotation.
>* So since this is a singleton bean because I have not configured any scope details, so by default my framework will consider singleton scope.
So on top of this person bean I have mentioned @Lazy.\
<mark>So with this configuration my spring IOC container don't create the person bean during the startup.\
Instead, it will try to create whenever the application is trying to access that bean with the help
of get bean or dependency injection or autowiring</mark>.


* see example_15 for better understanding.
* So this clearly indicates whenever we are using @Lazy annotation, you can control the way the
bean is getting created.
