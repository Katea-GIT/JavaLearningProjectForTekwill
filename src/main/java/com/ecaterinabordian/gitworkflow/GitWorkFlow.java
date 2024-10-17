package com.ecaterinabordian.gitworkflow;

public class GitWorkFlow {

    public static void main(String[] args) {

        String step1 = "Open IntelliJ IDEA and navigate to the main branch by running - git checkout main";
        String step2 = "Open the terminal and run the following command to check for any updates in the remote repository without downloading them - git fetch";
        String step3 = "Run the following command to download the changes from the origin/main branch to your local main branch - git pull";
        String step4 = "Create a new branch and switch to it by running the following command - git checkout -b Task_1";

        // As a result, there are now two branches in the local repository: main and Task_1. However, in the remote repository (Cloud), only the origin/main branch exists

        String step5 = "Make the necessary changes for Task_1 while on the Task_1 branch";
        String step6 = "Add the changes to the commit history of the local Task_1 branch by running - git commit";
        String step7 = "Push the changes to the remote repository by running the following command - git push. As a result, a new branch named origin/Task_1 will be created on GitHub";

        // As a result, there are now two branches both in the local repository and in the remote repository: main and Task_1 locally, and origin/main and origin/Task_1 in the Cloud

        String step8 = "Create a pull request to merge the changes from the origin/Task_1 branch into the origin/main branch, ensuring you add the appropriate reviewers";
        String step9 = "If there are no comments and the code changes have been approved, proceed to merge the code";

        // As a result, the origin/main branch will now contain the latest code that was previously added in the origin/Task_1 branch

        String step10 = "In IntelliJ IDEA, while on the Task_1 branch, switch back to the main branch by running - git checkout main";
        String step11 = "Run the following commands to fetch and pull the latest changes from origin/main into your local main branch: git fetch and git pull";

        System.out.println(step1);
        System.out.println(step2);
        System.out.println(step3);
        System.out.println(step4);
        System.out.println(step5);
        System.out.println(step6);
        System.out.println(step7);
        System.out.println(step8);
        System.out.println(step9);
        System.out.println(step10);
        System.out.println(step11);
    }
}
