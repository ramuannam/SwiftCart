98.
/ before adding any validations to the project first add the dependency into pom.xml

>we are discussing before bean validation work by letting the developers to add the constraints inside
the bean class itself.\
Right now this is the Java Pojo or Java bean class that I maintaining in the backend that holds the
information comes from the UI page.\
Like you can see here, the name, mobileNum, email, subject and message.\
These values comes from the Contact page.
> 
```
<section class="contact-bg  contactPage-space" id="contact">
    <div class="contact-container">
        <div class="contact-title-main">
            <h3 class="contact-head">Join Early</h3>
        </div>
        <div class="form-bg">
            <div class="form-container">
                <form
                        th:action="@{/saveMsg}"
                        method="post"
                        class="signin-form"
                        th:object="${contact}"
                >
                    <div class="input-grids">
                        <div class="row">
                            <div class="col-sm-6">
                                <input
                                        type="text"
                                        th:field="*{name}"
                                        placeholder="Your Name"
                                        class="contact-input"
                                        required="true"

                                />
                            </div>
                            <div class="col-sm-6">
                                <input
                                        type="number"
                                        th:field="*{mobileNum}"
                                        placeholder="Your Mobile Number"
                                        class="contact-input"
                                        required="true"
                                />
                            </div>
                        </div>
                        <input
                                type="email"
                                th:field="*{email}"
                                placeholder="Your Email"
                                class="contact-input"
                                required="true"
                        />
                        <input
                                type="text"
                                th:field="*{subject}"
                                placeholder="Subject"
                                class="contact-input"
                        />
                    </div>
                    <div class="form-input">
                <textarea
                        th:field="*{message}"
                        placeholder="Type your message here"
                ></textarea>
                    </div>
                    <div class="text-start">
                        <button class="btn btn-style btn-style-3">Send Message</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</section>

 ```

















99.
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