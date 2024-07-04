The next enhancement that I want to bring into our web application is displaying the content dynamically
to the end user.

ike if there are two different people trying to access your web application, we are always displaying
the same static content, but ideally any production web applications, they should be able to display
content dynamically based upon the user who is trying to access it.

Like in the scenarios,\
if I try to log in into an web application, I should be able to see the data which belongs to me
only the same applies for the other person where he can look the data which belongs to him or her.

>For the same,\
in this course, we are going to adopt "Thymeleaf",<mark> which is a modern server side java template engine</mark>.
>* with the help of Thymeleaf, I can build some templates which are very similar to html files inside
my web application.
>* So while responding to my browser request, my thymeleaf along with the spring will generate a html
content based upon the template files that I have defined by populating the dynamic data, that I want
to populate.\
 So this way Thymeleaf will bring some dynamic content display into our web application.


>* very similar to Thymeleaf we also have Jakarta server pages, which we call it as🔥 JSP,
>* and similarly we have 🔥JSF, which indicates  Jakarta server faces,
>* and from Apache we have 🔥 Freemarker 
>* and with 🔥Groovy also we can make our web application content to be displayed dynamically.

But the reason why I'm choosing Thymeleaf in this course is it has a great integration with the spring
framework, especially with spring mvc and spring security.
* We really don't have to learn a lot, If you want to build a web application with spring and thymeleaf because everything is very intuitive
in nature.\
Like if you already familiar with the html, css and javascript, how they work, Then building web application with thymeleaf and spring is very easy for you.


>Very recently, there is also a latest trend where developers are building web applications by separating
them into two components.
>* One is a frontend component, the other one is a backend component.
>* So inside frontend, they will leverage certain javascript frameworks like Angular, React, which can
help you to make a Rest Api invocation to the backend and to display the content dynamically.

So it is a recommended approach.\
It may not be a solution for everyone.
* The reason why I'm saying is, if you're trying to build an application using Angular or React and spring
in the backend, definitely you are going to separate your team into frontend team and backend team
or you should identify a developer who knows both Angular and Spring, where we call them as full stack
developers and at the same time learning Angular or React.
* They have a lot of learning curve.
* So considering all these challenges, many companies, they still adopting server side templates like
Thymeleaf, Jsps because it gives a flexibility to them like a single developer can take care of both
developing frontend and backend.

* And one more advantage that we have is you don't have to deploy them into two different servers.
* 🔥Like if you develop a web application with Angular and spring, you need to deploy your angular code
separately and spring code separately.
* Whereas with Thymeleaf and spring, if you develop a web application, you can deploy everything into
a single server.\
So both approaches have their own pros and cons.

>But since in this course we are focusing simply on the spring, I'm not discussing anything about Angular
or React and we are going to develop a complete web application, which we develop with the help of Thymeleaf,
html, css, javascript and spring and eventually deploy the same into a single server.

>Like I said, Thymeleaf and Spring,
they have a very good integration and they offer certain <mark>"template resolvers" like "SpringResourceTemplateResolver"</mark>,
which will help us to populate the content dynamically.
>* Like I can define my template inside my spring project and this template will  looks like very
familiar with the html.
>* We'll just bring some flavor of thymeleaf to display the content dynamically.
>* ➡️ At the end of the day my browser can understand html, css and javascript.\
So it won't understand the thymeleaf.\
So <mark>it is the job of the "SpringResourceTemplateResolver" to convert this "thymeleaf template" into a
"html page" after populating the data whenever it is trying to respond to a request that came from a browser</mark>.