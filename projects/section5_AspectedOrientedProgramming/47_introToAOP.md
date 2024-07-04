
reference: https://docs.spring.io/spring-framework/reference/core/aop/ataspectj.html

Now let's try to understand another powerful technique or great feature provided by Spring Framework,
which is aspect oriented programming.
>What is an aspect?\
So aspect is a simple piece of code that you want to execute by the spring framework whenever you call some specific  methods inside your app.

* maybe you may have hundreds of methods inside your application which holds a business logic.

* but apart from business logic, there are many non functional requirements that you need to handle as
a developer.
* Such requirements like logging, security, auditing.
* So instead of plumbing the code related to auditing, logging, security into your actual business logic
methods, you can maintain them in a separate place with the help of aspect.
* And based upon how you are configuring, spring framework is smart enough to execute that logic that you mentioned 
  inside the aspect.

* That way your business logic and non functional requirements like logging, auditing and security will
work together to perform as a production ready web application inside your organization.

>So we have a module called "Spring AOP" inside the "Spring core Framework".\
So with the help of AOP and aspects, we can build applications by **separating** the cross-cutting concerns
like transaction management, logging, auditing, security into a separate place.\
That way you are bringing some maintainability inside your applications.

* eg: Think of a scenario where you have implemented logging or auditing and security inside all your methods
of your application like thousand or hundreds of methods that you have.\
   So tomorrow, if there is a requirement change, it will be very cumbersome process like I need to go
and change in all these hundreds or thousands of methods that I have inside my application.\
Instead of doing that with the help of aspect oriented programming, I can build a non-functional requirement
logic in a separate place with the help of aspects, and I can configure those aspects to be executed
with the help of advisors and configurations that I am going to give to the Spring framework.


* So even if there is a scenario where you have to change the how you log or how you handle security or
auditing, transaction management, the change will be in a single place and that will get reflected to
all the methods present inside your application.\
So that's a major advantage of using aspect oriented programming.


>So this <mark>aspect oriented programming dynamically injects the logic present inside aspect whenever a particular
method is executing inside your application</mark>.\
So you don't have to call that logic present inside aspect manually.\
It will be all taken care by spring framework dynamically during the runtime based upon the configurations
that you have done.
> * So that way, this is always a pluggable code into your application whenever you want
you can configure that and you can plug it and play with that code.\
If you don't want that code, you can unplug it just with the help of configurations.

* And again, understanding aspect oriented programming is very important because spring itself will use
aspect oriented programming a lot in other projects of spring like spring security, spring data JPA.\
So each and every project that we have under spring umbrella, they use this aspect oriented programming
to a great extent and it is very much needed for any developer to understand what is AOP.
* Without knowing AOP, you will be clueless what is happening inside your application and inside spring
framework.
* because These are all driven by configurations, but not with a simple Java methods invocation, which we can
easily identify.\
If a method is invoking another method, you can easily identify that by looking at the code.\
But since AOP is something which is driven with the help of configurations, you should know how to
configure how to understand these configurations of AOP.
