
>we first seperated header and footer in seperate html pages as they can be same in almost all pages so to avoid writing again and keep the code clean we use replace method from thymeleaf.
>1. ```<div th:replace="footer :: footer"></div> ```\
// replces the footer code here.


>//similar to anchor link in html.(here for thymeleaf.)
>2. ` <a th:href="@{}"></a>` \
   So in the curly braces you need to provide the url or the end point for specific page.