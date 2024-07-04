A web application is a software product, which usually we will deploy into a server we call it as a
web server or app server.

The reason is once we deploy the product into a server, it can start accepting the request from the
outside world.
* eg: The main intention of deploying that Facebook application into a server is so that people can start
using that.\
They can upload images, they can see the videos using Facebook web application.
*  In a similar way any application that you can access over the Internet is called a web application.


> So how all this magic happens?
> * First, a web client usually initiates the request, like the web client
can be a browser or a mobile application or a postman.
> * When the request came from the web client to a web server, usually web servers, they maintain a domain
name or IP name.
That's how a web client will make a request to the web server.
> * And as soon as the request comes to your web server and web server can process that request and send
the response again to the Web client.


* a request from the browser
coming to a web server and web server will validate, who is the user that is making a request to me.
Based upon that it will return all the images belongs to that user in the response and that's how browser
will display all those images belongs to that user with the help of response provided by the web server.

* And again, the protocol that we follow to send the request and to receive the response is HTTP protocol.
* The web server where we usually deploy our applications, it accepts all the requests.
* So usually inside our web server we maintain applications which can have only frontend or only backend
or a combination of frontend and backend also.
* eg: So if you take restaurant as an example scenario, you can think restaurant is an web application.
When you walk into the restaurant, you can see the chairs tables.\
So that's a front end part of your restaurant.\
Similarly, when you make an order inside a restaurant like you want to order a pizza or you want to
order a burger.\
So when you make this request, the preparation of that item will happen in the back end, which is
in the kitchen.\
So whatever is happening inside the kitchen, you will never know.\
You will get an end product.\
And that end product you can see when you are sitting on the table or a chair in the front end side
of your restaurant.\
So in a very similar terminology, web server also can have frontend and backend are a mix of both
of them.\
* static -only frontend (always display the same information.)
* dynamic - both frontend and backend where hey can display the data dynamically
based upon the user's action,
because the processing of the data business logic is happening on the backend.\
One of the great examples that you can consider for frontend and backend combination is our e-commerce
website like Amazon, Walmart, eBay.

>In a similar lines, there is also a possibility we can have only backend web applications also.\
> * Usually in the scenarios of only backend applications, the communication between the web clients and
web server will happen with the help of Rest API and JSON format or the HTTP protocol.
>* So this is more used in the scenarios where you have an angular/react based application on the front end and
you want to make a request to some other web application hosted in some other server.
>* So in those scenarios you can have a only backend web application deployed into your server and only
front end application based upon Angular or React is deployed into some other server.\
They can communicate over the HTTP protocol with the help of rest APIs and JSON.

> * But you may ask me a question like the request that we get from the web clients is in the HTTP protocol.
>* How Java understand that HTTP protocol or HTTP messages because java works purely based upon the objects.
>* 🔥<mark>So that's where we have a middleman called servlet container</mark>.

>So when we deploy our application into a web server, your web server has a component called servlet
container, which takes care of converting your HTTP messages into an servlet request.\
> And once the processing of a given input is done, the same servlet container will again convert from
servlet response object to HTTP response message.
> * That way it can go and displayed on the applications like Chrome or any browser that you can take,
and this servlet container applicable to only Java related web applications.


And this servlet container applicable to only Java related web applications.\
There can be very similar kind of mechanism will happen for other language applications like python,
dotnet or any other language that you can take.

>But inside Java web apps, servlet container is the middleman which take care of converting this HTTP
message to solid objects and vice versa.
> * And inside Java world, one of the mostly used and appreciated servlet container is Apache Tomcat.
