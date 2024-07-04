Whenever we want to implement AOP inside any application.
>Firstly, you just need to decide about WWW's.(3W's)\
> * WHAT- so what logic that you want to get executed as part of your aspect.\
 Whenever you call a specific method inside your application. And your aspect can contain any non business
logic like logging, auditing, security checks.\
>* So all whatever logic that you want to define that will come under aspect concept.
So that's why aspect is a basic foundational element, inside aspect oriented programming.
>* <mark> Whenever you want to get started with AOP, first you need to identify what logic you want to get executed,And that logic we call it as aspect</mark>.


>Once you have the logic identified inside an aspect, definitely you need to decide when that aspect
needs to be executed.\
Whether you want that aspect needs to be executed before the method execution or after the method execution
so that we call it as advice.
> * WHEN- Advice
> * So we want to advise to spring framework when a given aspect needs to be executed,
Whenever a actual method inside your application is getting executed.


>And the last W which indicates which method you want to intercept, maybe you may have thousands of
methods inside your application and definitely you don't want to intercept each and every method inside
your application and execute your aspect logic.
>* So that's why we need to tell to spring also which methods needs to be intercepted by the spring AOP
framework.
>* So these methods we call it as Pointcuts.
>* WHICH- Pointcut.


>summary
> * The very first W indicates what is the logic that you want to execute as part of AOP.
So this what logic we refer it as aspect.
>* And the second W is when you want to execute your aspect logic, whether it is before or after the method.\
So we call that when as an advice inside aspect oriented programming.
>* And the last one obviously, which is, which method you want to intercept inside your application.\
And this we call it as pointcut.


>And apart from this aspect advice and Pointcut, you will also hear two other jargons very rarely.
> * 1. join point: So join point defines what is the triggering event that will execute your aspect.
> * Definitely inside Java applications always
the triggering point is whenever someone is trying to execute a given business logic method inside your
application.\
<mark> That's why in java always the join point is method call</mark>.
> * 2. target object: So definitely whenever you want to implement AOP, we will decide which methods of your application
needs to be intercepted.
> * And these methods stay inside a bean object.
<mark> So whatever bean that holds the actual methods which have business logic inside them, that bean we
call it as target object</mark>.


>VehicleServices- targetObject.\
>playmusic()- pointcut, because it is the method where I want to intercept, as it is present in vehicleService object (target)\
>Somelogic - becomes aspect.\
> before - is advice, because when we want to execute that aspect(logic)? so before becomes an advice.\
> execution - joinpoint/ trigger, becuase for all this triggering point is the execution of playmusic method.That's why execution which is method call will become join point.
