Singleton scope is a default scope that will be followed by spring IOC container.

* Like whenever we are trying to create a bean of a specific Java class. And if you are not defining anything related to scope by default spring framework will consider singleton as a default scope.

* So as a name indicates, singleton scope means when you have a bean inside your spring application and
if you are trying to refer that bean at any places inside your application, either it might be by using
get bean method or by using dependency injection and autowiring concept, you will always get the same
instance of the bean.
>* which means once you created a bean of type singleton scope, you can refer that
singleton bean for example 100 times inside your application, but you will not get 100 different objects of a specific
bean.
>* Instead, you will always get the same object instance given inside your application by the spring IOC
container.

* but there might be some times where you don't want to create a singleton scoped beans.\
The reason is usually singleton scoped beans.\
If you are not dealing with them properly, it will result into <mark>race conditions</mark> inside your application.


refer 1.pdf,\
2.example_14 \
3.watch video again if not understood.
