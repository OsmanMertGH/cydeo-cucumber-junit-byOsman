package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {
    @When("user enter librarian username")
    public void user_enter_librarian_username() {
        System.out.println("user enter librarian username");
    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("user enters librarian password");
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("user should see the dashboard");
    }

    @When("user enter student username")
    public void user_enter_student_username() {
        System.out.println("user enter student username");
    }
    @When("user enters student password")
    public void user_enters_student_password() {
        System.out.println("user enters student password");
    }

    @When("user enter admin username")
    public void userEnterAdminUsername() {
        System.out.println("user enters admin username");
    }

    @And("user enters admin password")
    public void userEntersAdminPassword() {
        System.out.println("user enters admin password");
    }
}
