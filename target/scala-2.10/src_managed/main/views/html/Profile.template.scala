
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
object Profile extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,Boolean,UserInfo,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(page: String, isLoggedIn: Boolean, userInfo: UserInfo):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.57*/("""

"""),_display_(Seq[Any](/*3.2*/Main(page, isLoggedIn, userInfo)/*3.34*/ {_display_(Seq[Any](format.raw/*3.36*/("""
   	<div class="container">
    	<p>In the profile page.</p> 
    	<p>Only authenticated users can visit this page.  Try logging out and then attempting to retrieve /profile.</p>
		"""),_display_(Seq[Any](/*7.4*/if(userInfo.getRole().equals("admin"))/*7.42*/ {_display_(Seq[Any](format.raw/*7.44*/("""
		<a href="/admin">Admin page</a><br>
		""")))}/*9.5*/else/*9.10*/{_display_(Seq[Any](format.raw/*9.11*/("""
		<a href="/user">User page</a>
		""")))})),format.raw/*11.4*/("""
    </div>
""")))})),format.raw/*13.2*/("""
"""))}
    }
    
    def render(page:String,isLoggedIn:Boolean,userInfo:UserInfo): play.api.templates.HtmlFormat.Appendable = apply(page,isLoggedIn,userInfo)
    
    def f:((String,Boolean,UserInfo) => play.api.templates.HtmlFormat.Appendable) = (page,isLoggedIn,userInfo) => apply(page,isLoggedIn,userInfo)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jul 02 12:59:59 IST 2018
                    SOURCE: /home/vassar/Documents/play/play-example-login/app/views/Profile.scala.html
                    HASH: 4081dc6d48d11dd9f17aef9b7bb2b0533d3ba3a1
                    MATRIX: 793->1|942->56|979->59|1019->91|1058->93|1275->276|1321->314|1360->316|1419->359|1431->364|1469->365|1536->401|1580->414
                    LINES: 26->1|29->1|31->3|31->3|31->3|35->7|35->7|35->7|37->9|37->9|37->9|39->11|41->13
                    -- GENERATED --
                */
            