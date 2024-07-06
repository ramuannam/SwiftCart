In this holidays page we try to send the data form backend to frontend to display the holidays

>And again, we don't have to send this Model object specifically in the return or in the response.\
<mark>The reason is it is the thymeleaf that is doing that magic.\
So Thymeleaf will go and look into the holidays.html template that I will be building and inside
that template it will see if there are any reference to the attributes that are available inside my
Model object.\
If there are certain references, then my thymeleaf will load that data into my html and send that actual
html that can be understand by the browser inside the response.\ </mark>


>So now the problem is how to display the data that we are receiving from the backend?
>1. So what my thymeleaf will do is it will go and look if there is any variable with the name festival
inside my Model object, definitely there is an attribute name with the festival because if you go and
look at the holidays controller, the attribute name that we are giving is type.toString(), which is
of type, FESTIVAL and FEDERAL.\
So that's where I have given this.
>2. This is the Model attribute name that my thymeleaf has to pull it from my Model object.\
And since it is a list of holidays, I'm trying to iterate them with the help of thymeleaf each tag
that I have.\
> ```th:each="holiday : ${FESTIVAL}"```
> so its like loop with variable as holiday, which object gets assigned.\
>3. So during this iteration, inside this "each loop block" I want to display what is the reason that I can
fetch by calling holiday.reason, holiday.day. ie,. reason and day for that type of holiday.
>4. Similarly, if you look at the FEDERAL holidays here, I'm trying to fetch the list of holidays that
are assigned to the FEDERAL Model
attribute name, once all those holidays are loaded from the Model object, I'm trying to iterate them with
the thymeleaf each and the same
I'm trying to do like holiday.reason and holiday.date.
