package controllers;

import java.util.Date;
import models.PageView;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
    public static Result index() {
        PageView pageView = new PageView();
        pageView.date = new Date();
        pageView.save();
        return ok(index.render(PageView.find.findRowCount()));
    }
}
