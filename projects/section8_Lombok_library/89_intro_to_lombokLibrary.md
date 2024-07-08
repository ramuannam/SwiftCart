
>Inside that Pojo class also, and I have seen like there are many projects where they have thousands
and thousands of pojo classes and generating getters and setters and maintaining those code inside web
application is a very cumbersome process.\
So to a great extent IDE's are helping us to generate these getters and setters and constructors to
toString(), hashCode(), methods which are seviour to developers.\
Instead of typing all these values, we are able to generate automatically.\
But still we are supposed to maintain these getters and setters inside each and every Model class.\

> So all these boilerplate code like which is unnecessary to me as a developer.
Why should I worry about them?\
Why should I maintain getters and setters?\
Can't we have something smart which whenever it sees some pojo classes which will do a magic of removing
that burden from the developer.\
So that's where we have a solution with a new <mark> Java library called Lombok. </mark>\
Again, Lombok is not a spring specific or spring boot specific library.\
It is just a Java library.\
By adding the dependency inside your Maven project, you can start using that.
> So whenever I have Lombok inside my classpath, what I can do is instead of maintaining these getters
and setters inside my Java class, I can remove them and I can just add a single annotation on top of
this Pojo class.\
And Lombok will take care of automatically generating getters and setters at runtime, but you can't
see them in the source code.\

>   How it works?\
> 🔥 And how this Lombok works is whenever we have Lombok inside our classpath and I'm using an annotation
like @Getter and @Setter on top of my model class.\
So what it will do is whenever I'm doing a build of my project, the .class files will be generated
like, you know, inside Java we write our source code in .java file format, and <mark> when we compile that
it .class file will generate which will have the bytecode.</mark> \
🔥So during the compilation, Lombok will do all this magic.\
🔥So it will pledge itself during the build process and it will auto generate the methods like getters
and setters and it will make sure those methods are available inside the bytecode generated for your
Java classes.

----------------------------------------------------------------------
>90. is about how lombok generates the .class file and what they provide according to the class we define. check the model classes once.
-------------------------------------------------------------------
>91. @Slf4j annotation : annotation that is supported by Lombok that help us  whenever we are doing logging inside our Java classes.\
>🔥  If I want to log certain information like log.info() , in order to use this .info(), .error() methods or any other methods
available inside this log object, I need to make sure that I'm creating the log object every time inside
each and every Java class inside my web application.\
> #eg this:  ``` private static Logger log= LoggerFactory.getLogger(<class>);``` \
>So again, this is a boilerplate code which we don't have to write with our own hands.\
Lombok has an annotation specifically for this kind of logging requirements.\
The annotation name is<mark>  @Slf4j </mark>, so this annotation will generate a log object which
is very equivalent to this line of code