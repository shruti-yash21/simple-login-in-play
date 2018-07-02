
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
object Admin extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,Boolean,UserInfo,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(page: String, isLoggedIn: Boolean, userInfo: UserInfo):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.57*/("""

"""),_display_(Seq[Any](/*3.2*/Main(page, isLoggedIn, userInfo)/*3.34*/ {_display_(Seq[Any](format.raw/*3.36*/("""
   <div class="container">
     <p>In the admin page.</p>
   </div>
""")))})),format.raw/*7.2*/("""
"""))}
    }
    
    def render(page:String,isLoggedIn:Boolean,userInfo:UserInfo): play.api.templates.HtmlFormat.Appendable = apply(page,isLoggedIn,userInfo)
    
    def f:((String,Boolean,UserInfo) => play.api.templates.HtmlFormat.Appendable) = (page,isLoggedIn,userInfo) => apply(page,isLoggedIn,userInfo)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jul 02 12:33:55 IST 2018
                    SOURCE: /home/vassar/Documents/play/play-example-login/app/views/Admin.scala.html
                    HASH: 364635e8fa96253688a19a33db60d3aca268fe76
                    MATRIX: 791->1|940->56|977->59|1017->91|1056->93|1156->163
                    LINES: 26->1|29->1|31->3|31->3|31->3|35->7
                    -- GENERATED --
                */
            