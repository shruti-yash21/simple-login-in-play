
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
object Main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,Boolean,UserInfo,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(page: String, isLoggedIn: Boolean, userInfo: UserInfo)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.72*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/page)),format.raw/*7.21*/(""" (play-example-login)</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
        
        <!--  Load site-specific customizations after bootstrap. -->
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*12.54*/routes/*12.60*/.Assets.at("stylesheets/main.css"))),format.raw/*12.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*13.59*/routes/*13.65*/.Assets.at("images/favicon.png"))),format.raw/*13.97*/("""">
        
        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
          <script src="http://cdnjs.cloudflare.com/ajax/libs/html5shiv/3.6.2/html5shiv.js"></script>
          <script src="http://cdnjs.cloudflare.com/ajax/libs/respond.js/1.2.0/respond.js"></script>
        <![endif]-->
    </head>
    <body>
    
     <!-- Responsive navbar -->
  <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
          <!--  Display three horizontal lines when navbar collapsed. -->
          <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="/">play-example-login</a>
      </div>
      <div class="collapse navbar-collapse">
        <ul class="nav navbar-nav navbar-left">
          """),_display_(Seq[Any](/*35.12*/if(isLoggedIn)/*35.26*/ {_display_(Seq[Any](format.raw/*35.28*/("""
            <li class=""""),_display_(Seq[Any](/*36.25*/("active".when(page == "Profile")))),format.raw/*36.59*/(""""><a href=""""),_display_(Seq[Any](/*36.71*/routes/*36.77*/.Application.profile())),format.raw/*36.99*/("""">Profile</a></li>
          """)))})),format.raw/*37.12*/("""
        </ul>
        <ul class="nav navbar-nav navbar-right">
          """),_display_(Seq[Any](/*40.12*/if(isLoggedIn)/*40.26*/ {_display_(Seq[Any](format.raw/*40.28*/("""
            <li><p class="navbar-text">"""),_display_(Seq[Any](/*41.41*/userInfo/*41.49*/.getEmail())),format.raw/*41.60*/("""</p></li>
            <li><a href=""""),_display_(Seq[Any](/*42.27*/routes/*42.33*/.Application.logout())),format.raw/*42.54*/("""">Logout</a></li>
          """)))}/*43.13*/else/*43.18*/{_display_(Seq[Any](format.raw/*43.19*/("""
            <li><a href=""""),_display_(Seq[Any](/*44.27*/routes/*44.33*/.Application.login())),format.raw/*44.53*/("""">Login</a></li>
          """)))})),format.raw/*45.12*/("""

        </ul>
      </div>
    </div>
  </div>
      """),_display_(Seq[Any](/*51.8*/content)),format.raw/*51.15*/("""
      <!-- Load Bootstrap JavaScript components. HTMLUnit (used in testing) requires JQuery 1.8.3 or below). -->
      <script src="http://code.jquery.com/jquery-1.8.3.min.js"></script>
      <script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
    </body>
</html>
"""))}
    }
    
    def render(page:String,isLoggedIn:Boolean,userInfo:UserInfo,content:Html): play.api.templates.HtmlFormat.Appendable = apply(page,isLoggedIn,userInfo)(content)
    
    def f:((String,Boolean,UserInfo) => (Html) => play.api.templates.HtmlFormat.Appendable) = (page,isLoggedIn,userInfo) => (content) => apply(page,isLoggedIn,userInfo)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jul 02 12:33:55 IST 2018
                    SOURCE: /home/vassar/Documents/play/play-example-login/app/views/Main.scala.html
                    HASH: 45c8183ca975591da55cc59d91ce304f69020e46
                    MATRIX: 795->1|959->71|1047->124|1072->128|1456->476|1471->482|1527->516|1624->577|1639->583|1693->615|2758->1644|2781->1658|2821->1660|2882->1685|2938->1719|2986->1731|3001->1737|3045->1759|3107->1789|3218->1864|3241->1878|3281->1880|3358->1921|3375->1929|3408->1940|3480->1976|3495->1982|3538->2003|3586->2033|3599->2038|3638->2039|3701->2066|3716->2072|3758->2092|3818->2120|3909->2176|3938->2183
                    LINES: 26->1|29->1|35->7|35->7|40->12|40->12|40->12|41->13|41->13|41->13|63->35|63->35|63->35|64->36|64->36|64->36|64->36|64->36|65->37|68->40|68->40|68->40|69->41|69->41|69->41|70->42|70->42|70->42|71->43|71->43|71->43|72->44|72->44|72->44|73->45|79->51|79->51
                    -- GENERATED --
                */
            