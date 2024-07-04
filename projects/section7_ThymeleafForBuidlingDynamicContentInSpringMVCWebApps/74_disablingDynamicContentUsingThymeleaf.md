So by default, your thymeleaf will cache the templates.
That way it don't have to compile every time.
* Whenever someone is trying to access home.html, the work that it is doing is it is looking for the
thymeleaf specific tags and it is identifying the dynamic variables and putting their values in the
place of those variables and post that it will convert that entire html file into a format where a browser
can understand.
* Because at the end of the day your browser don't understand your thymeleaf tags.
*  So thymleaf will convert your template into a html file.
That way your browser can understand. (you can even inspect the page after it turned into html whcih shows on browser, there only html content will be shown, no thymleaf tags or info.)
* So in order to save doing this job again and again for each and every request that is coming from the
UI for the home.html thymeleaf by default enable the caching.
* so very first time only it will do
the compilation of your template and it will put inside a cache until you restart your server
again, the same caching will be used, but this may not be a great feature during your development.

> so why do you want to restart my server every time you make a change inside your template?
>* So that's where Thymeleaf give an option of disabling that cache,especially during your local development,
by mentioning a property inside your Application.properties.
 ```
spring.thymeleaf.cache=false
```

So we have used the time leaf tags, but by the time it reaches to the browser all the Thymeleaf related
content is removed by your timeleaf.\
Because if I send my timeleaf related tags and information to my browser, my browser definitely will
scold me saying that what the hell you are talking so because it cannot understand that language.\
So my browser strictly can understand only html, javascript and css.

* If you change some Java code, you have to restart your server because whatever cache disabling that
we have done is only specific to Thymeleaf compilation.\

* But Java code is nothing to do with the Thymeleaf and it is handled by the spring, Spring boot and
Spring MVC.

* So to save developers from restarting of the application whenever they make some changes inside Java
code or properties, Spring Boot provides something called "DevTools".