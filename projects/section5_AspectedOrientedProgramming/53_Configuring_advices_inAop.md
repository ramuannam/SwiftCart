Let's try to understand what are the steps that we need to follow in order to define an aspect, post
that we need to define the advices.

And once we define the advice, we should also define the pointcuts, which will tell which methods
of your application needs to be intercepted by the spring AOP framework.

> 1. Adding AOP dependency in pom.xml
> 2. Mention "@EnableAspectJAutoProxy" on top of config class.(to enable AOP inside my application.)
> 3. we need to create the "aspect logic", like the logic that we want to be executed, Whenever a method is intercepted by the spring AOP framework.
     (Definitely we can't write the logic without the help of method, and these methods has to present inside some Java class. For the same, first, we need to create a Java class.)
> 4. On top of this java class we should definitely use two annotations.\
    1. @Component: to make this class as bean.(Whenever we want certain logic present inside, a class needs to act as an aspect logic. Definitely, we need to make sure that class is acting as a bean inside spring framework. That's why I'm using @Component stereotype annotation here.)\
    2. @Aspect :  in order to differentiate between a normal bean and a aspect bean, I need to mention one more annotation, which is @Aspect.
* Once I made these two configurations on top of a class, my class is ready to act as a bean and aspect.
* So inside this class I can write any number of methods that will hold the aspect logic.
