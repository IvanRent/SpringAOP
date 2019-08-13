package org.controller.user;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Login y password: autenticación de usuario y cerrar sessión
 * 
 * @RequestMapping: url de las vistas
 * return "home"; home.jsp
 * 
 *@controller manipula la vista y el servicio de negocio
 *
 *http://SpringAOP/admin/privatePage/privatePage.jsp
 *
 *
 **/
@Controller
public class HomeController {
  @RequestMapping(value= "/", method = RequestMethod.GET)
  public String home()
  {
	  return "home";//home.jsp
  }
  @RequestMapping(value= "/admin/privatePage", method = RequestMethod.GET)
  public String privatePage()
  {
	  return "privatePage";//privatePage.jsp
  }
}
