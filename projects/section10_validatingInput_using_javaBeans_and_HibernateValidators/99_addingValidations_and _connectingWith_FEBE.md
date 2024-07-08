


> ````   model.addAttribute("contact", new Contact());```` \
So using model object, I need to create an attribute called contact.\
And inside this attribute I need to send the new object of contact class.\
So this way I'm indicating to my thymeleaf that this page will hold
the data belongs to the Contact object, and any validations that I defined inside this Contact bean
should be performed by the Thymeleaf and Spring MVC whenever the user is submitted the data.


> So this is a very step that we need to make sure, like creating a new freshly Contact pojo object getting
created every time the user is getting landed onto this contact page. \
So once I'm sending this Contact object inside an attribute called contact, I need to go to the contact.html
and build a relationship between this Contact object and this contact.html form.\