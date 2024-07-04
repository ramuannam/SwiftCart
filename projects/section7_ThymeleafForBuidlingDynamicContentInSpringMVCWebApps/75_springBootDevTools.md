refer slide;



* Like many times we are so frustrated as a developers, like why should I restart the entire server even
for a very small change.\
>So out of all those frustrations, Spring team understand and inside Spring Boot they came up with a
feature called DevTools, which provide features like <mark> Automatic restart and Live reload</mark>, which will
make developer life so much easy when building applications with the help of Spring Boot.

* note that spring boot dev tools can only be leveraged whenever you're building web
  applications with Spring Boot.

* If there is a scenario where you are building web application with only spring and spring MVC without
  spring boot, then dev tools may not be an option for you.

* So in those scenarios, I'm sorry, you have to restart your server to reflect your backend changes.

>* How?
>* You just have to add the dependency which is spring-boot-dev-tools into your pom.xml or gradle file.
And after making those changes, your web application have the dev tools available,that way it can do automatic restart and live reload.

>* 1.So automatic restart means so whenever you make a change inside your java file or any property file,
you just save it and you trigger a build.\
So as soon as your build is completed, your dev tools will detect that and do a automatic restart of
your server.
>* 2.And live reload means it will make you so lazy,Even browser refresh
also, you don't have to do by yourself by the time your automatic restart is completed and you visit
the browser, the page might have refreshed automatically with the help of live reload.

* So class loaders is the place where we deploy all our classes.
That way our code will be executed.
* So without dev tools there will be only one class loader.\
>But with dev tools, the spring boot web application will maintain two class loaders,
>* 1. one with the classes, That does not change at all.\
eg:Like we are using Thymeleaf related dependency.
We are using spring related libraries, spring core framework related libraries, Spring MVC related
libraries.\
So inside all those libraries and jars there might be thousands of classes easily.
So all those classes which are coming from the dependencies will be loaded into a separate class loader.
>* 2. the second class loader will have all the classes which are defined by yourself inside your web
application.\

And whenever I make a change, my spring boot will only reload the second class loader, but not the
first class loader which has all the classes from the dependency files because there is no change happen.\
And as a developer I can't make a change
also, inside the dependency jar classes, I can only make changes inside my own application related
classes and files.\
And that's where always your second class loader will be restarted or will be reloaded whenever you
are done with the building of your application.\

* Like maybe when you are trying to start your application very first time,
If it is taking 10 seconds with the help of automatic restart, the restart will complete only within 2 to
3 seconds or even more quick.\
The reason is it is only reloading the files present inside web application, but not the files present
inside the dependency files.

* And apart from automatic restart and live reload by default, dev tools will disable all caching options.\
Like in the previous lecture we are discussing about how to disable the Tymeleaf template caching.

* And you can also ask me, we don't need these dev tools in the production environment, right?
Like maybe I can use this option only in my local development.\
So for that only spring boot dev tools is smart enough to not put the libraries related to dev tools
whenever you are generating a jar or whenever you're generating a war or packaging your entire web application
for higher environment deployment.\
So in those scenarios, by default, your packaged archives will not have any jars or dependencies related
to dev tools.\
  Spring boot automatically will take care of that disabling spring boot dev tools for higher environments.
* And like I was mentioning, even we don't have to mention spring.tymeleaf.cache = false.(in application.properties)\
The reason is by default dev tool will take care of disabling all the caching inside all the dependent
libraries that we are using.