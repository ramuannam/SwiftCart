
validations are very imp.
because there can be people who can send the data to backend of any kind of info.
So the backend or frotend need to say this info is valid as per the given input type.
 So validations are of two types:
1. Frontend validations (can be altered if user is knowledgeable by going to console)
2. Backend Validations ( Imp and can't be altered, as these validatin are performed on backend.)


eg:
```
< input type="text" 
name="name"
id="name"
placeholder="Your Name"
class="contact-input" 
🔥  required="true"   // this makes necessary to put some valid value  (🔥client side validation)
/>

 ```

and for email, type:"email" for the need of @.

so even if you have client side validations, it is recommended to have server side(backend) validations.

if not you may have lot of junk/ invalid data into your db. and may cause null pointer exceptios or any.
eg: if you want to give this data to marketing team, and if you don;t have valid mobile no, name, email etc.. then its going to waste their time and resources causing inefficinecies cauing to the company.

Since these validations are common for any kind of web applications, Spring, Spring Boot, Spring
MVC, they are providing some libraries using which we can easily build a validations inside our web
applications.




