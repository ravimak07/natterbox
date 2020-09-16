$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/natterbox/resources/featurefiles/login.feature");
formatter.feature({
  "line": 1,
  "name": "Log in feature",
  "description": "",
  "id": "log-in-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 43387002300,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User should not Log in with invalid credential",
  "description": "",
  "id": "log-in-feature;user-should-not-log-in-with-invalid-credential",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on Login link",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 1041185000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnLoginLink()"
});
formatter.result({
  "duration": 5887489700,
  "status": "passed"
});
formatter.after({
  "duration": 7349929900,
  "status": "passed"
});
});