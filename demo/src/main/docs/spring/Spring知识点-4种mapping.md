Spring包含四种HandlerMapping

1.RequestMappingHandlerMapping

2.SimpleUrlHandlerMapping

3.BeanNameUrlHandlerMapping

4.ControllerClassHandlerMapping


作用和区别:

1:RequestMappingHandlerMapping (常用)

根据Controller配置的路径表示接收哪个请求

eg: /login即为请求路径
```
<!--配置 spring 3.2之前的版本-->
<!--3.2之后的版本请参考 org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter-->
<bean class="org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerAdapter">
// 使用
@RequestMapping("/login")
public class DemoController{
    @ControllerReceive
    @RequestMapping("/userLogin")
    @ResponseBody
    public LoginResponse userLogin(// some params){
        // do some bussiness
    }
}
```
2:SimpleUrlHandlerMapping

根据URL映射来寻找controller

```
<!--配置-->
<bean class="org.springframework.web.servlet.handler.SimpleUrlHandlerMapping">
    <property name="mappings">
        <props>
            <prop key="/login.do">DemoController</prop>
        </props>
    </property>
</bean>
```
3:BeanNameUrlHandlerMapping (默认)
```
<!--配置-->
<bean class="org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping" />
<bean id="demoController" name="/login.do" class="com.controller.DemoController" />

4:ControllerClassHandlerMapping
<!--配置-->
<bean class="org.springframework.web.servlet.mvc.support.ControllerClassNameHandlerMapping" />
<bean id="hello3Controller" class="com.controller.LoginController" />
<!-使用-->
http://localhost:5080/springmvc/login.do   正确
http://localhost:5080/springmvc/loginController.do  正确
http://localhost:5080/springmvc/login3.do 错误
注意点：使用类名来访问一个Controller，类名首字符要小写，后面要加.do （不建议使用）
```


