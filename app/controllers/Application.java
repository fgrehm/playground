package controllers;

import models.PageView;
import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
    public static Result index() {
        return ok(index.render("Your new application is ready. + " + PageView.find.all()));
    }
}
