
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object Index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,Boolean,UserInfo,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(page: String, isLoggedIn: Boolean, userInfo: UserInfo):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.57*/("""

"""),_display_(Seq[Any](/*3.2*/Main(page, isLoggedIn, userInfo)/*3.34*/ {_display_(Seq[Any](format.raw/*3.36*/("""
   <div class="container">
     <div class="row">
       <div class="col-sm-10 col-sm-offset-1">
       <h2>Welcome to play-example-login.</h2>
       <p>The purpose of this system is to illustrate simple authorization and authentication in Play.</p>
       <p><em>Authorization</em> is the process by which an application decides whether or not a user has access
       to a certain type of data (for example, an interior page). </p>
       <p><em>Authentication</em> is the process by which an application determines the identity of a user.</p>
       <p>Typically, an application will first authenticate the user through a login process, after which
       the user is authorized to retrieve certain kinds of data. </p>
       <h3>Functionality</h3>
       <p><b>Home page:</b> This page displays a login link in the navbar.</p>
       <p><b>Login page:</b> This page displays a login form.</p>
       <p><b>Profile page:</b> Displayed only to authenticated users.  This page provides some text in the 
       body of the page.  The navbar displays the user name and a logout link.
       <p><b>Logout link:</b> Displayed only to authenticated users.   Logs them out. </p>
       <h3>Try it out</h3>
       <p><ul>
          <li>Login in with email "smith@example.com" and password "password". Once logged in, note that the Profile link appears in the navbar.
          Take a look at that page.</li>
          <li>Logout, then try to login with different credentials.  An error should result when you try to submit.</li>
          <li>While logged out, try to retrieve the /profile page by entering the URL manually.  Note that you can't do it unless logged in.</li>
          </ul>
       </p>
       <h3>Pros and cons of this example</h3>
       <p><b>Pros: </b>It's good for showing Play and/or webapp development newbies the basic issues to be 
       addressed in authorization and authentication.  It's a good code base for creating demo systems that
       want to illustrate features available with login vs. without login. It doesn't even require setting up
       a database. The UI, if not amazing, is at least reasonable.</p>
       <p><b>Cons: </b>This system is not production ready. 
       <ol>
       <li> It sends credentials in the clear using 
       http.  A production system must encrypt credentials sent over the wire, typically by using https.</li>
       <li>It stores credentials in the clear.  A production system would store encrypted versions of the 
       credentials so that if the database was hacked, credential data would not be revealed.  
       <li> It does not illustrate the registration process for creating new users, which typically involves
       sending a confirmation email.</li>  
       <li> It does not enable users to login using third party credentials such
       as Google, Yahoo, or Facebook.</li>
       </ol>   
       There are at least two Play plugins that addresses these authentication issues, 
       <a href="http://joscha.github.io/play-authenticate/">Play-Authenticate</a> and
       <a href="http://securesocial.ws/">SecureSocial</a>.
       Another plugin to review if you need more sophisticated forms of authorization in Play is 
       <a href="https://github.com/schaloner/deadbolt-2">DeadBolt 2</a>.
       </div>
     </div>
   </div>
""")))})),format.raw/*52.2*/("""
"""))}
    }
    
    def render(page:String,isLoggedIn:Boolean,userInfo:UserInfo): play.api.templates.HtmlFormat.Appendable = apply(page,isLoggedIn,userInfo)
    
    def f:((String,Boolean,UserInfo) => play.api.templates.HtmlFormat.Appendable) = (page,isLoggedIn,userInfo) => apply(page,isLoggedIn,userInfo)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jul 02 12:33:55 IST 2018
                    SOURCE: /home/vassar/Documents/play/play-example-login/app/views/Index.scala.html
                    HASH: 6be20eb6ae71f65092bd9d66ba53e9fe08478a4c
                    MATRIX: 791->1|940->56|977->59|1017->91|1056->93|4403->3410
                    LINES: 26->1|29->1|31->3|31->3|31->3|80->52
                    -- GENERATED --
                */
            