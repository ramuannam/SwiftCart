So with prototype scope, every time we request a bean reference, we will get a brand new object instance
from the spring IOC container.
* That's why we need to use the prototype scope beans only in the scenarios where we want a new object
reference of a bean needs to be created every time we refer it.
* So this is especially in the scenarios where your bean will frequently change the state of the data
present inside it.
* So in those scenarios we can use prototype bean scope because that will <mark> avoid race conditions inside
multithread environments because each thread will get its own object reference</mark>.

> * And inside the(example_16 refer this V.V.V IMP) code you can see I'm trying to refer that bean with the help of 
    > getBean method two times
one is inside the object reference vehicleService1 and other one is vehicleService2.
<mark>So in this scenario, since my scope of the vehicle service is prototype, it will create two beans
inside spring IOC container</mark>.\
So that's why please be very careful with prototype scope.
>* Since this is not a default behavior, we need to configure this only in the scenarios where you are
very sure that your bean will frequently change the state of the data which may result into race conditions.
>* So that's why to avoid those scenarios, you can convert your bean from singleton to prototype by mentioning
the configurations.
