
>we first seperated header and footer in seperate html pages as they can be same in almost all pages so to avoid writing again and keep the code clean we use replace method from thymeleaf.
>1. ```<div th:replace="footer :: footer"></div> ```\
// replces the footer code here.


>//similar to anchor link in html.(here for thymeleaf.)
>2. ` <a th:href="@{}"></a>` \
   So in the curly braces you need to provide the url or the end point for specific page.

> 🔥 Using WebMvcConfigurer we can configure the html page without the need of Controller class.\
>``` @Configuration
>public class WebConfig implements WebMvcConfigurer {
>    public void addViewCotrollers(ViewControllerRegistry registry){
>registry.addViewController("/courses").setViewName("courses");
>     }
>} 
>```
---------------------------------------------------------------------------------------------------------------------------------------
>82.Resolving Build & Cache issues inside maven projects 
1. by deleting the target folder in the project and build by spring.
2. Deleting the cashes of the browser.


---------------------------------------------------------------------------------------------------------------------------------------
>83.Building about page from home.
In this section we build backend of HOME page in sclaer school in the "WHY CHOOSE US" section.

--------------------------------------------------------------------------------------------------------------------------------
>84.Building contact page from home.\
>So for now, please make a note that just like how we have model interface which will support sending
the data and receiving the data between UI and backend code.
Very similarly, we have a ModelAndView class which will support sending data and the view information.