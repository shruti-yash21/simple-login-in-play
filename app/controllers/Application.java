package controllers;

import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.Index;
import views.html.Profile;
import views.html.Login;
import views.formdata.LoginFormData;
import play.mvc.Security;
import models.*;

import java.util.Map;


/**
 * Implements the controllers for this application.
 */
public class Application extends Controller {

  public static String role = "";
  public static String email = "";

  /**
   * Provides the Index page.
   * @return The Index page. 
   */
  public static Result index() {
    System.out.println("hey from application.index :: " + ctx());
    return ok(Index.render("Home", Secured.isLoggedIn(ctx()), Secured.getUserInfo(ctx())));
  }
  
  /**
   * Provides the Login page (only to unauthenticated users). 
   * @return The Login page. 
   */
  public static Result login() {
    Form<LoginFormData> formData = Form.form(LoginFormData.class);
    return ok(Login.render("Login", Secured.isLoggedIn(ctx()), Secured.getUserInfo(ctx()), formData));
  }

  /**
   * Processes a login form submission from an unauthenticated user. 
   * First we bind the HTTP POST data to an instance of LoginFormData.
   * The binding process will invoke the LoginFormData.validate() method.
   * If errors are found, re-render the page, displaying the error data. 
   * If errors not found, render the page with the good data. 
   * @return The index page with the results of validation. 
   */
  public static Result postLogin() {
    // Get the submitted form data from the request object, and run validation.
    Form<LoginFormData> formData = Form.form(LoginFormData.class).bindFromRequest();

    if (formData.hasErrors()) {
      flash("error", "Login credentials not valid.");
      return badRequest(Login.render("Login", Secured.isLoggedIn(ctx()), Secured.getUserInfo(ctx()), formData));
    }
    else {
      email = formData.get().email;
      // email/password OK, so now we set the session variable and only go to authenticated pages.
      sessionManage();
      return redirect(routes.Application.profile());
    }
  } 

  public static void sessionManage() {
    //write a query to store all the info about the user in an object 'info' using his email id
    //UserInfoDB.addUserInfo(email, info);
    
    for (Map.Entry<String, UserInfo> entry : UserInfoDB.userinfos.entrySet()) {
      System.out.println(entry.getKey() + " = " + entry.getValue().getEmail());
      if(entry.getValue().getEmail().equals(email)) {
        role = entry.getValue().getRole();
      }
    }

    session().clear();
    session("email", email);
    session("role", role);
  }
  
  /**
   * Logs out (only for authenticated users) and returns them to the Index page. 
   * @return A redirect to the Index page. 
   */
  @Security.Authenticated(Secured.class)
  public static Result logout() {
    session().clear();
    return redirect(routes.Application.index());
  }
  
  /**
   * Provides the Profile page (only to authenticated users).
   * @return The Profile page. 
   */
  @Security.Authenticated(Secured.class)
  public static Result profile() {
    return ok(Profile.render("Profile", Secured.isLoggedIn(ctx()), Secured.getUserInfo(ctx())));
  }

  /**
   * Provides the Admin page.
   * @return The Admin page. 
   */
  @Security.Authenticated(Secured.class)
  public static Result admin() {
    if(session("role").equals("admin")) 
      return ok("Hello Admin : " + email);
    else
      return ok(Profile.render("Admin", Secured.isLoggedIn(ctx()), Secured.getUserInfo(ctx())));
      // return ok(Index.render("Error", Secured.isLoggedIn(ctx()), Secured.getUserInfo(ctx())));
  }

  /**
   * Provides the Admin page.
   * @return The Admin page. 
   */
  @Security.Authenticated(Secured.class)
  public static Result user() {
    if(session("role").equals("user"))
      return ok("Hello User : " + email);
    else
      return ok(Profile.render("User", Secured.isLoggedIn(ctx()), Secured.getUserInfo(ctx())));
  }
}
