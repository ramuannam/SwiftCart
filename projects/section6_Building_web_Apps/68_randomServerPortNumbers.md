In the previous lecture we discussed on how to override the default port number that is provided by
the Spring boot.

* Now, in this lecture, I'm going to tell you a secret which majority of the spring boot developers
don't know in terms of port configuration.

>Now we can also configure this port number to zero.\
So what is going to happen if you mention the port number as zero inside spring boot web application?\
🔥So when we configure the port value as zero,
Spring Boot will consider that the developer want to start the web application at a random port number.
>* port=0, means spring boot will set the port to random port for each program run.

> So why do we need a random port number ?\
> in software development there might be a scenario where you may want to run the same application multiple instances like your
automation tester or your automation team,
they want to execute certain scripts to test various scenarios inside your web application
and in those scenarios may be they want to run multiple instances of your web application.\
>* But if you try to run the application with the same port number, obviously you will get an error
that port is already being used by another web application.
>* So to avoid those kind of scenarios, we can configure the port value as zero, which indicates to the
spring boot framework that the port number has to be assigned randomly.

* So to avoid those kind of scenarios, we can configure the port value as zero, which indicates to the
spring boot framework that the port number has to be assigned randomly.

* That way there won't be any conflict between multiple instances that are running for a same web application.

* The same will be useful whenever you are dealing with the Docker containers, Kubernetes, where you
are trying to create multiple instances of a same web application.

* That's where please always consider this as an option,Help your automation tester friends or any DevOps friends that there is an option inside Spring Boot
where we can let our application start very randomly.









