* All this code making your application very tough to understand for the new developers are the code that
a developer has to write also increases a lot.

So tomorrow, if you want to add one more check to the vehicle started condition maybe like you want
to check whether the fuel is present or not.

* So if you want to add one more condition to this vehicle started if condition, then definitely you
have to revisit all the methods available inside your application and make changes in all of them,
which will be very tough scenario.

* And you have to make sure testing is performed for all the methods.
So this is all not maintainable code and this is not the actual way of writing the code inside production
grade application.

> So this is where our aspect oriented programming comes into picture.
> * So using aspect oriented programming, all non business logic can be moved into a single place from
outside this class and we can define that as an aspect and we can advise our spring framework how to
execute that aspect whenever someone is trying to invoke these methods.
> * see the slide for AOP.
> * All the remaining lines are not related to business logic, but when AOP comes into picture and it will
do the magic where all the non business logic code present inside your method can be moved into a separate
aspect and your method will look like very simple,which will
make your method applications clear and clean and maintainable.

refer example_17.
