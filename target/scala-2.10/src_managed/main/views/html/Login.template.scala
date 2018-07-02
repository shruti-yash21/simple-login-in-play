
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
object Login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,Boolean,UserInfo,Form[views.formdata.LoginFormData],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(page: String, isLoggedIn: Boolean, userInfo: UserInfo, loginForm: Form[views.formdata.LoginFormData]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import bootstrap3._


Seq[Any](format.raw/*1.104*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/Main(page, isLoggedIn, userInfo)/*5.34*/ {_display_(Seq[Any](format.raw/*5.36*/("""
   <div class="container">
     """),_display_(Seq[Any](/*7.7*/loginform(routes.Application.postLogin(), loginForm("email"), loginForm("password")))),format.raw/*7.91*/("""
   </div>
""")))})),format.raw/*9.2*/("""
"""))}
    }
    
    def render(page:String,isLoggedIn:Boolean,userInfo:UserInfo,loginForm:Form[views.formdata.LoginFormData]): play.api.templates.HtmlFormat.Appendable = apply(page,isLoggedIn,userInfo,loginForm)
    
    def f:((String,Boolean,UserInfo,Form[views.formdata.LoginFormData]) => play.api.templates.HtmlFormat.Appendable) = (page,isLoggedIn,userInfo,loginForm) => apply(page,isLoggedIn,userInfo,loginForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jul 02 12:33:55 IST 2018
                    SOURCE: /home/vassar/Documents/play/play-example-login/app/views/Login.scala.html
                    HASH: 0954955bb596882ddd7a7a9340a3088b62b893d7
                    MATRIX: 826->1|1043->103|1071->126|1107->128|1147->160|1186->162|1254->196|1359->280|1401->292
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|37->9
                    -- GENERATED --
                */
            