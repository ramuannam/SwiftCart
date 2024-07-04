I have told you previously that one of the important or greatest feature provided by Spring Boot is
Auto Configuration.

* So Spring Boot, while starting your web application, it will look at what dependencies you have by
looking at the pom.xml.

* So based upon the dependencies that you define, it will try to create many beans and configurations
that you may need, while you are developing web applications.

* That way it is going to reduce the burden on developer to create all those beans and configuration.

>So in this lecture, let me show you some demo what kind of configurations that Spring Boot is going
to do based upon our dependencies, how to look the 🔥report of AutoConfiguration.
>* That way you will have good understanding of AutoConfiguration and whenever you have some scenarios
where you want to debug for any issues that you identified inside your projects.\
So these AutoConfiguration report is going to be a savior for you.

>So in order to generate the AutoConfiguration report on your console, we need to mention a property
which is debug is equal to true. (debug=true)
>* So with this value, what I'm telling to my spring boot framework is please go ahead and start the web
application in a debug mode. 
>* That means you can see more debug statements on your console, which you will also have the AutoConfiguration
report that we are expecting.i.e,.the first heading that it will print is CONDITIONS EVALUATION REPORT.

> Like I was telling your spring boot application will auto configure based upon certain conditions.
>* So what are those conditions?
>* Whether a given dependency is defined inside pom.xml or not.
>* If the dependency is defined, then only it will try to create the configurations and beans related
to that dependency
otherwise it will simply skip off creating those beans and configurations.
>>* So inside the report you will have 🔥positive matches, which is the very first report that will printed.
>* So positive matches indicates for a particular configuration or a bean,
there is a positive match identified inside the pom.xml dependencies.
>* So like that there are many classes and beans and properties are created and this list is very huge.\
You can imagine creating all these beans manually by the developer will take days and days of time.\
Now, since the spring boot is already taken that responsibility, we are free to use this already created
beans by the spring boot framework based upon our requirements.
>>* So post positive matches you will also have 🔥Negative Matches.\
>* So Negative Matches indicates that Spring Boot did not create these beans or configurations because
it didn't identify any dependencies related to them.
>>* You can identify two more reports.\
One is 🔥Exclusion list: So if there is a scenario where we want to mention some exclusions for your spring boot, we can define
that.
>* eg: So exclusion, we can consider in the scenarios where I don't want the spring boot to be created that
bean
maybe I want to create that manually by considering special or custom scenarios that I have.
So in those scenarios you can mention that exclusion list.
>>* last we also have 🔥unconditional classes.\
>* So unconditional classes indicates that these classes and the beans around them are created regardless
of what dependencies that you have defined, because these unconditional classes are the base classes
that are needed for your spring boot application to run.



## Creating Exclusion list: in the main class at SpringBootApplication annotation.
```
@SpringBootApplication (exclude= {DataSourceAutoConfiguration.class})
```
So for DataSourceAutoConfiguration.class. this class I don't want the auto configuration to be created.
And also beans should not be created by the spring boot while server startup.
And if you have multiple requirements you can mention them comma separated like whatever classes you
want.



>And also if you look at the spring boot application annotation, it is a combination of three important
annotation,\
one is ComponentScan.\
the second one is EnableAutoConfiguration,\
and the third one is SpringBootConfiguration.\
>* Like, you know, ComponentScan will help us to tell spring framework to go ahead and scan all the
packages that we need, for the beans that should be created with the help of stereotype annotations like
@Component, @Controller or @Service. So whenever we define springBootApplication annotation internally, it will also have ComponentScan
>* and EnableAutoConfiguration means we are telling to the spring boot framework, go ahead and do the
auto configuration for all the dependencies that we have defined inside pom.xml.
>* and springBootConfiguration annotation is very similar to the @Configuration annotation that we discussed previously.\
If you see the ProjectConfig.java which we created in one of the previous project, which is example_16,\
we have @Configuration which indicates this is a configuration class.
>* and we also have @ComponentScan where we mention the package names, where the spring framework has to scan
and create the beans around them.

>But in our scenario we have not mentioned @Configuration.
>* The reason is whenever we mention springBootApplication internally, it also has spring boot configuration, which is very similar to @Configuration.
>And here we also didn't mention @ComponentScan, even though I didn't mention
@ComponentScan, my controller, which is HomeController bean is getting created without any issues.\
The reason is again, Spring Boot is doing a magic here.
>* Suppose if all your controller classes or component classes are present inside a package or sub package
where the main SpringBootApplication class is staying, Then you don't have to mention.
>* spring boot consider all the packages and classes present in the same root directory or the sub directory,
It will go ahead and scan only in the scenarios If you are mentioning these annotations like controller, component, repository, @Service.
>* in the package which is outside to this com.hustlers.scalernet then only we need to mention.
>* But since in my scenario controller is a sub package of com.hustlers.scalernet.
You can also confirm that by looking at the package statement.\
So that's why we don't have to mention here ComponentScan also.\
>* But if you have a scenario where inside your project where you need to maintain these classes separately,
then you should be defining the ComponentScan along with the package details.