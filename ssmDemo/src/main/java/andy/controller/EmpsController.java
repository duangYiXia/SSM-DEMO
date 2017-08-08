package andy.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;  

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller; 

import andy.model.Emps;
import andy.service.IEmpsService;  
  
@Controller  
@RequestMapping("/emps")  // url路径
public class EmpsController {  
    @Resource  
    private IEmpsService empsService;  
      
    @RequestMapping("/getById")  //url路径
    public ModelAndView  getById(HttpServletRequest request,ModelAndView model){  
        int id = Integer.parseInt(request.getParameter("id"));  
        Emps emps = this.empsService.getEmpsById(id);  
        model.addObject("emps", emps); //视图模型，向页面传递对象
        model.setViewName("empsList");  //指定视图文件，路径在spring-mvc下指定
        return model;  
    }  
} 