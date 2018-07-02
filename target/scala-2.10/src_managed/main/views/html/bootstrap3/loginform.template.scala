
package views.html.bootstrap3

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
/*************************
 Simple Login template.
 
 Takes a reverse route, the email field, and the password field from a form. 
 If form validation fails, then the fields will have Twitter Bootstrap error highlighting.
 Clients should set the "error" key in flash scope to provide feedback on errors. 
**************************/
object loginform extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[play.api.mvc.Call,Field,Field,play.api.templates.HtmlFormat.Appendable] {

    /*************************
 Simple Login template.
 
 Takes a reverse route, the email field, and the password field from a form. 
 If form validation fails, then the fields will have Twitter Bootstrap error highlighting.
 Clients should set the "error" key in flash scope to provide feedback on errors. 
**************************/
    def apply/*9.2*/(reverseRoute: play.api.mvc.Call, emailField: Field, passwordField: Field):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*9.76*/("""

<div class="row">
  <div class="col-sm-4 col-sm-offset-4">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Please log in</h3>
      </div>
      <div class="panel-body">
        """),_display_(Seq[Any](/*18.10*/helper/*18.16*/.form(reverseRoute, 'role -> "form")/*18.52*/ {_display_(Seq[Any](format.raw/*18.54*/("""
          <fieldset>
            <div class="form-group """),_display_(Seq[Any](/*20.37*/if(emailField.hasErrors)/*20.61*/ {_display_(Seq[Any](format.raw/*20.63*/("""has-error""")))})),format.raw/*20.73*/("""" >
              <input id=""""),_display_(Seq[Any](/*21.27*/emailField/*21.37*/.id)),format.raw/*21.40*/("""" name=""""),_display_(Seq[Any](/*21.49*/emailField/*21.59*/.name)),format.raw/*21.64*/("""" value=""""),_display_(Seq[Any](/*21.74*/emailField/*21.84*/.value.getOrElse(""))),format.raw/*21.104*/("""" class="form-control" placeholder="E-mail" type="text">
            </div>
            <div class="form-group """),_display_(Seq[Any](/*23.37*/if(passwordField.hasErrors)/*23.64*/ {_display_(Seq[Any](format.raw/*23.66*/("""has-error""")))})),format.raw/*23.76*/("""" >
              <input id=""""),_display_(Seq[Any](/*24.27*/passwordField/*24.40*/.id)),format.raw/*24.43*/("""" name=""""),_display_(Seq[Any](/*24.52*/passwordField/*24.65*/.name)),format.raw/*24.70*/("""" value=""""),_display_(Seq[Any](/*24.80*/passwordField/*24.93*/.value.getOrElse(""))),format.raw/*24.113*/("""" class="form-control" placeholder="Password" type="password">
            </div>
            <input class="btn btn-lg btn-success btn-block" type="submit" value="Login">
          </fieldset>
        """)))})),format.raw/*28.10*/("""
         """),_display_(Seq[Any](/*29.11*/if(flash.containsKey("error"))/*29.41*/ {_display_(Seq[Any](format.raw/*29.43*/("""
           <div id="error-message" class="text-danger">
             """),_display_(Seq[Any](/*31.15*/flash/*31.20*/.get("error"))),format.raw/*31.33*/("""
           </div>
         """)))})),format.raw/*33.11*/("""
      </div>
    </div>
  </div>
</div>
"""))}
    }
    
    def render(reverseRoute:play.api.mvc.Call,emailField:Field,passwordField:Field): play.api.templates.HtmlFormat.Appendable = apply(reverseRoute,emailField,passwordField)
    
    def f:((play.api.mvc.Call,Field,Field) => play.api.templates.HtmlFormat.Appendable) = (reverseRoute,emailField,passwordField) => apply(reverseRoute,emailField,passwordField)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jul 02 12:33:55 IST 2018
                    SOURCE: /home/vassar/Documents/play/play-example-login/app/views/bootstrap3/loginform.scala.html
                    HASH: 81ffc36d1caed88d5c4a133fe8a57201bf2105a9
                    MATRIX: 1468->335|1636->409|1909->646|1924->652|1969->688|2009->690|2103->748|2136->772|2176->774|2218->784|2284->814|2303->824|2328->827|2373->836|2392->846|2419->851|2465->861|2484->871|2527->891|2675->1003|2711->1030|2751->1032|2793->1042|2859->1072|2881->1085|2906->1088|2951->1097|2973->1110|3000->1115|3046->1125|3068->1138|3111->1158|3345->1360|3392->1371|3431->1401|3471->1403|3578->1474|3592->1479|3627->1492|3688->1521
                    LINES: 38->9|41->9|50->18|50->18|50->18|50->18|52->20|52->20|52->20|52->20|53->21|53->21|53->21|53->21|53->21|53->21|53->21|53->21|53->21|55->23|55->23|55->23|55->23|56->24|56->24|56->24|56->24|56->24|56->24|56->24|56->24|56->24|60->28|61->29|61->29|61->29|63->31|63->31|63->31|65->33
                    -- GENERATED --
                */
            