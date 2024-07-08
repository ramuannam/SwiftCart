>93.Accepting query params using @request params.
> so in order to accept the query params you need to first send them form front end.\
>➡️ So you can do that by simply adding in th: thymleaf tag,\
> ``` th:href="@{/holidays (festival='true', federal= 'true')}"   ```\
> ➡️If you see, I just need to mention that all the query params that I want to send to the backend by
using comma separated by key=value.\
But please make sure all these query params are present inside these brackets(opening bracket and closing bracket).\
> ➡️Note: So here we don't have to follow mentioning question mark before the first query
param and ampersand whenever we are trying to append more query params. So all that will be taken care
by the thymeleaf internally.\
>➡️ example_22 with updated query params.\

> 🔥 ``` th:if="${festival}==true"``` // thymeleaf if is very similar to our if blocks on the Java side.\
> ➡️So in order to show/display something CONDITIONALLY i can use thymeleaf if tag, based upon what I have inside that "model attribute" called festival,
> (the same name we are setting inside as an attribute name in the controller for the model object.)
> ➡️So whenever the value against this attribute is true, then only I want to display the festival holidays.
Otherwise I don't want to display the same I want to do for federal holidays.
>
> Note: if the request params are not sending too backend,and in the backend if required==false then nothing will happen no problem, and the default value is assigned which is null.