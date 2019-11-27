@全体成员 ,今天晚上的任务：
1.不加controller注解出现什么问题？
 @Controller 只是定义了一个控制器类，不加这个注解的话会导致 分发处理器扫描不到这个类，继而也不会检测该类中相应的方法 也不知道该方法是否使用了 @RequestMapping 注解。									     
 从而报 404错误(源服务器没有找到目标资源的当前表示形式，或者不愿意公开该表示形式的存在。) 
 
2.controller注解换为Component注解是什么情况
@Compopnet注解是在 service层中的实现类头上加的
@Controller注解是在 Controller 类头上加的
在自动服务，spring初始化的时候，spring会把所有添加@Component注解的类作为使用自动扫描注入配置路径下的备选对象，同时在初始化spring@Autowired
	会报404错误 

3.RequestMapping注解写为@RequestMapping("") 和@RequestMapping("/")各是什么情况
带上"/"是绝对路径，不带是相对路径，规范应该带，虽然带"/"或者不带都能正确访问到后台
@RequestMapping(""):会去找当前路径下的controller 
@RequestMapping("/")：会去找根路径下的
比如你这个@RequestMapping("delete/12 redirect:emps")之后的路径实际是("delete/emps") 加斜杠就是找根路径下的

4.InternalResourceViewResolver删掉，直接在控制器类的方法里面写死地址，比如return "WEB-INF/jsp/hello.jsp出现什么情况
	正常运行
会根据写死的路径，去一个一个找，所以没影响。

5.InternalResourceViewResolver去掉前缀与后缀的配置或者只配前缀或只配后缀情况怎么样？？
会报错 ，会报找不到指定路径，前缀和后缀都包含着路径，去掉都会找不到的
因为 suffix(后缀) 相当于 (.JSP)
	prefix(前缀) 相当于 (WEB-INF/JSP/)

6.控制器类的方法名字可以任意吗？
尽量不要随意，符合规范的命名更有规范性
这个尽量避免, 因为里面有关键词index作为controller的入口method. 如果取名Index的话出现某些问题

7.控制器类的方法可以是静态的吗？
可以是静态的

8.控制器类的方法可以返回任意类型吗？比如返回你自己写的一个类
    支持以下返回类型
    1.ModelAndView
    2.Model
    3.ModelMap
    4.Map
    5.View
    6.String
    7.void
    
    
9.在jsp页面里面遍历输出请求作用域所有的attribute，看看里面有什么？
在jsp中写
<ul>
		<c:forEach items="${requestScope}" var="req">
    		<li>${req.key} = ${req.value}<>
		</c:forEach>
	</ul>

10.ModelAndView类的数据放到哪里了？为什么jsp里写el表达式可以取出来？

11.既然创建出了一个spring容器，如何获取这个容器呢？

12.如果能获取到这个spring容器，容器里面都有多少管理的bean？输出这些bean的名字

13. 如果把DispatcherServlet的url-pattern配置为*.html,那么访问地址为hello.html的时候
    RequestMapping注解的值应该写成什么才能访问到这个请求处理方法?