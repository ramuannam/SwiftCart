>you know, inside Java, everything works in objects.\
✍️And whenever we are trying to transform the data with the help of Java objects, we call those objects
as beans.\
✍️So bean inside Java means a Java class which can hold data, especially the simple pojo classes with
the getters and setters.\
✍️So that's why since all our data is going to flow from UI to backend and backend to UI with the help
of beans, it is very correct step to perform validations right inside the beans itself.\
Instead of writing and bringing those validations into your actual business logic.
 
> https://beanvalidation.org/     \
> So if you look at this website, so this is a standard which is built by Jakarta team.
So Jakarta team means Java Enterprise Edition team.(So previously we used to call Java Enterprise Edition and now since Java Enterprise Edition is being
taken care by Jakarta team, we are calling it as Jakarta Enterprise Edition.)\

> > Jakarta bean validation will let you express some constraints or validations
on top of your object fields or on top of your getter methods or constructor via annotations.

>eg: Inside this we have a field called email and we can perform the validation on this email data that is
coming from the frontend with the help of annotations like NotNull and Email.\
> noynull= that partucluar filed should not be null,So if it is a null value, it will throw a validation error. and @Email internally the bean validation
will look for the valid format of email. If not, it will throw an error to the end user.

>>The bean validations are the annotations that are used mostly coming from the two libraries/packages, which are maintained by two different teams.
> 
| jakarta team (java Enterprise edition team) | Hiberante team                      |
|---------------------------------------------|-------------------------------------|
|Jakarta.validations.constraints              | org.hibernate.validator.constraints |

Note:  quick note here.
For some reason, if you are using older versions of Spring and Spring Boot and Java, the package name
is going to be Javax.validations.constraints because from Java 17 only all the packages with
the name Javax are renamed to Jakarta.\
This is because Java Enterprise Edition right now is being maintained by the Jakarta Open Community
team.\
For that reason, inside the Java 17, they renamed all the packages from Javax to Jakarta.\
That's why,
Please note that if you are using older version of Java and Spring, Spring Boot, then the package name
is going to be start with Javax instead of Jakarta.\


>refer validation slide for more info and imp validations.








