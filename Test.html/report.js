$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Home.feature");
formatter.feature({
  "line": 1,
  "name": "This feature file is designed to validate Home page functionalities in below listed scenarios",
  "description": "",
  "id": "this-feature-file-is-designed-to-validate-home-page-functionalities-in-below-listed-scenarios",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 17,
  "name": "This scenario is designed to Add Staff",
  "description": "",
  "id": "this-feature-file-is-designed-to-validate-home-page-functionalities-in-below-listed-scenarios;this-scenario-is-designed-to-add-staff",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@SomeTest"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "launch FF browser and open application",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "an application is opened navigate to admin page by giving \"Username\" and \"Password\"",
  "rows": [
    {
      "cells": [
        "admin",
        "admin"
      ],
      "line": 20
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "Enter credentials for adding staff",
  "rows": [
    {
      "cells": [
        "bhanu",
        "f",
        "04/14/1994",
        "married",
        "developer",
        "12/04/2015",
        "P.N",
        "9696969696",
        "abdefg@gmail.com",
        "12345"
      ],
      "line": 22
    },
    {
      "cells": [
        "bhanu1",
        "f",
        "04/14/1994",
        "unmarried",
        "developer",
        "12/04/2016",
        "P.N",
        "9797979797",
        "abcde@gmail.com",
        "1234"
      ],
      "line": 23
    },
    {
      "cells": [
        "bhanu2",
        "m",
        "04/14/1995",
        "married",
        "revenue",
        "12/05/2014",
        "P.N",
        "9595959595",
        "abcdf@gmail.com",
        "1245"
      ],
      "line": 24
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "TC_03_AddStaff.AddStaffLaunchBrowser()"
});
formatter.result({
  "duration": 5400866140,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Username",
      "offset": 59
    },
    {
      "val": "Password",
      "offset": 74
    }
  ],
  "location": "TC_03_AddStaff.AdminLogin(String,String,DataTable)"
});
formatter.result({
  "duration": 1426978996,
  "status": "passed"
});
formatter.match({
  "location": "TC_03_AddStaff.addStaffMem(DataTable)"
});
formatter.result({
  "duration": 5874983918,
  "status": "passed"
});
});