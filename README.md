# SER316 Task 2 Documentation

## Overview Of All The Branches Used In Assignment

### Main
The "Main" branch is the back bone of this project and it's the thing that runs everything. Finalized code will be included in this branch with no errors or mishaps so your project can run smoothly. 

### Dev
The "Dev" branch is the branch where developers can safely combine features without screwing up the whole project. Everyone usually edits in "Main". Merge conflicts can be chaotic somxtimes from "Dev".

### Feature 1
Prior to merging "Feature1", I pulled down the updates from "Dev" and resolved any conflicts by hand prior to committing them.

### Feature 2 
To maintain a cleaner git history I rebased "Feature2" on top of "Dev".

### Feature 3 
I had made many small commits to "Feature3". Prior to committing these to "Dev", I had created a  larger commit that contained all of the individual commits and code that I had made. Which can sometimes be called a squash.

### HotFix 
The "HotFix" branch represented an emergency patch. I was able to pull the patch of code right into "Main". Once I completed that, I then committed the merge from "Main" into "Dev" to make sure all my branches were up to date and current.

### Documentation 
The "Documentation" branch contains both of the project's documentation and some additional notes about what's exactly going on in the project and how it is getting done and completed. 

---

# Git Strategies Employed During Completion Of Project

## Merges 
A merge creates a new commit that makes changes from two or more branches, this creates a record that show what branches were merged at specific times.

## Rebase 
A rebase is similar to a merge but instead of creating a merge commit that points to both previous codes, it creates new commits and completely gets rid of the old commits so the code is up to date. This is what I did with "Feature2" to make the history running better and look better overall.

## Squashes 
A squash takes multiple commits and turns them into a single commit. It can be useful when cleaning up your project and running different branches together at the same time.

## Cherry-Picks 
A cherry pick allows you to take a single commit from one branch and apply it to another. This allows you to make very easy changes to your errors in your code if there is any that are crashing your project.

## Observations

- feature1 used a normal merge workflow.
- feature2 showed how to use conflict resolution
- feature3 showed us how squashing can create cleaner commit history
- The hotfix branch showed all of us how to do urgent fixes that can be applied to producing code

---

#Workflow Reflection

This assignment showed me how teams can use Github for assignments. Also, how you can merge, rebase, squash, and cherry pick to show us how each of these methods affect the project outcome.


## Final Summary

All features got merged into dec, feature 2 got rebased and was later updated and completed from dev, feature 3 got squashed into 1 clean commit, and finally the hotfix was cherry-picked into main before I merged it back into dev. All of the final gradle tests ran and said BUILD SUCCESSFULL. 