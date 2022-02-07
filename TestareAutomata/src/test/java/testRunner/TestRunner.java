package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)            //testRunner runs with the Cucumber class
@CucumberOptions(
        features = {"features"},   //the name of the features folder, if it had another name, the name was written
        // this instruction specifies where the system can find the feature files folder
        glue = {"steps"},                            //this instruction specifies where to find the step definition files
        //plugin = {"pretty", "html:reports.html"},   //this statement specifies the format of the report to be generated (html) and the name of the report (reports.html), pretty - to be nicely arranged
        plugin = {"pretty", "html:reports/reports.html"}, //this instr. specifies the format of the report along with the folder in which it is to be generated
        // if the folder does not exist, it will be created automatically
        //plugin = {"pretty", "json:reports/reports.json"} //this inst. generates the report in json format
        //plugin = {"pretty", "junit:reports/reports.junit"} //this inst. generates the report in junit format
        dryRun = false, // if true, no code will be run and it will be checked if all the feature files have a corresponding step file - choose false or true to give us the code we will use in steps
        monochrome = true, //remove redundant info from the console
        tags = "@T3"    //run only the tests that are marked with the T1 tag, it can change depending on what we want to run
        //name = "search"     //this inst. run tests that have this keyword in the name of the scenario
)
public class TestRunner {
}

