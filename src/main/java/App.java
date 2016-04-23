import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.ArrayList;

public class App {

  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/results", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      String userInputString = request.queryParams("userInput");
      request.session().attribute("userInput", userInputString);
      model.put("userInput", userInputString);

      model.put("template", "templates/results.vtl");

      ReplaceVowel newReplace = new ReplaceVowel();
      String puzzleshow = newReplace.runReplaceVowel(userInputString);

      String[] stringArray = userInputString.split("");

      String hiddenletter1 = stringArray[0];
      String hiddenletter2 = stringArray[1];
      String hiddenletter3 = stringArray[2];
      String hiddenletter4 = stringArray[3];
      String hiddenletter5 = stringArray[4];

      model.put("puzzleshow", puzzleshow);
      model.put("hiddenletter1", hiddenletter1);
      model.put("hiddenletter2", hiddenletter2);
      model.put("hiddenletter3", hiddenletter3);
      model.put("hiddenletter4", hiddenletter4);
      model.put("hiddenletter5", hiddenletter5);

      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/solve", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/solve.vtl");

      String solveString = request.queryParams("solveInput");

      model.put("userInput", request.session().attribute("userInput"));
      model.put("solveString", solveString);

      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
