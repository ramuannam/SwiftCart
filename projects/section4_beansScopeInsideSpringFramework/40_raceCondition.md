when we implement singleton bean scope incorrectly, we may get into issues like race conditions.

>* So what is a race condition?
>* So a race condition happens when two threads trying to access a same shared value at the same time.
see example and understand.(the restaurant table booking.)


> * So this is a hash map(restaurant table) and inside my application, since this is a shared value, any thread that is
executing inside my application, they can try to access it.
They can perform the business logic based upon the code that we have written inside our application.
 >* So you can see there are two threads that are trying to access this shared object, which is thread
one and thread two.
Since it is a shared object, if both my thread one and thread two run the if condition at the same time.\
Initially my reservedTables map is empty and containskey() will be false.\
And since this is a not if condition, so obviously it will go into the inside of the if loop.So both my thread one and thread two
unfortunately they ran this if condition at the same time and both of them got true.\
And since table one is not assigned to any customer or user inside a restaurant, my thread one is trying
to assign that to the user one who logged in into the application and my thread two also is trying to assign the same table to the use two.\
 
>So in this scenario both my threads are racing to update the value and unfortunately whatever thread is updating towards the end so that thread user details will be updated against a given table
one.
Suppose in the scenario where my thread two did the update to the end, then my table one will be assigned to the user two and whatever my thread one did
updates inside reserved tables hash map will get override.\
So this is a race condition because they both are using the same shared object.


>* So whenever this happens who ever updates the last in that situation (moment) will be seen as owned by them.
which is very bad.

>So this is a race condition because they both are using the same shared object.\
The similar can happen to our singleton bean scope objects also, the reason is if you have a single object instance for your entire application and if multiple
threads and at multiple places inside your application, they are trying to access it, there is a good
chance we will end up into this kind of race conditions.

* So it's our responsibility as a developer, whatever bean that we are choosing as a singleton bean scope,  there is 
  no data related updation or correction or deletion is happening inside these beans.

>* So in Java, how we used to avoid this race condition is with the help of synchronization/ locking, which is 
   > unnecessarily complex to handle inside spring applications.

That's why, while you are choosing the scope of a bean as a singleton, spend few minutes asking whether this will result into any race conditions.
