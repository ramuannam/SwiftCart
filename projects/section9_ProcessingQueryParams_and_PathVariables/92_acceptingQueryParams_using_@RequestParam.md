> So as of now, inside our web application, whenever we say /holidays, it is going to display
> all type of holidays like federal and festival.
> Now I have a new requirement that I want to build inside our web application, which is if someone
> is sending a request to the backend by mentioning festival is equal to true and federal is equal to
> true.
> In that scenario, I will display both federal and festival holidays, whereas if they send only festival
> is equal to true but not federal is equal to true, I will not display federal holidays.
> I will only display festival holidays in that scenario, and the same vice versa also can be possible.
> So this is what I'm trying to achieve here.\

>1. Sending Query params: \
>So I'm going to accept sending the query params inside my getURL() that is going to come from my
> frontend to the backend application.
> eg: I can also tell you where we use this kind of query params
> mostly if you go to any e-commerce website, if you try to search or if you try to apply filter conditions,
> those filter conditions will be sent in the getURL() to the backend server.
> So these kind of filtering is the most common scenario where we can see usage of query params.
> So you need to follow a structure whenever you are sending a query params or any getURL() along with
> the query params to the backend server.
> ``` http://localhost:8080/products?order=popular```
> so here my path is up to products, so after my path I need to start the very first query param by using question mark(?).
> So what is a key and what is a value?
> So here the key is order and the value is popular.
> subsequently you can add any number of params, but please make sure you are separating the
> multiple params that you have by using the ampersand symbol(&) like you can see in the second URL.
> ``` http://localhost:8080/products?order=popular&filter=new```\
>
> but it's a good practice to limit yourself up to 3 or 4 query params.
> This is not only applicable for the MVC application, the same applicable for whenever you are making rest API calls to the backend .
> So the same kind of pattern we can follow both in the backend and while forming the request on the UI side.\

>2. Accepting Query Params:\
>The next problem that I need to solve here is I need to catch those query params on the backend side.\
>So<mark>  in order to catch those query params we can use the annotation which is @RequestParam,</mark> the query params
that we are getting in the getURL() or we can also use it to accept the form data that we are going
to receive.\


>NOTE: One important configuration that I can do is, I can make this RequestParam as an mandatory or an optional.\
> 🔥so when I make <mark> required = false</mark> , My spring MVC or spring boot web application will not throw any error even in the getURL() path if that
particular query param is missing.\
🔥 Whereas if I make <mark> required = true</mark> , then definitely it is a mandatory and if that query param or request
param is missing in the getURL(), then definitely your controller will throw an exception.\
> 🔥we can also mention name value, <mark> default value for the request param</mark> .\
> 🔥 If you use different method param names compared to what you are receiving inside the getURL().\
In that scenario, please make sure that you are using the <mark> name attribute</mark> .
> That way you are binding that given RequestParam to a particular method param name .\
> 🔥 we also have<mark> value attribute</mark>  that can be mentioned inside RequestParam annotation.\
So value attribute is very similar to name element itself where it can be used to define some alias
names.


------------------------------------------------------------------------------------------------------
