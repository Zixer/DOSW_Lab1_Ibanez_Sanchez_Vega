# DOSW\_Lab1\_Ibanez\_Sanchez\_Vega


Team Members: 

Yazid Alejandro Sánchez Sánchez - Daniel Santiago Ibáñez González - Sergio Andrés Vega Pachón

Answers to the conceptual questionnaire:

1. Team agreements: Add the agreements you defined in the Onboarding section here.
    RTA//Each team member worked on their own feature branch, updated the repository before starting, used clear commit messages, and reviewed merge conflicts together before integrating the final solution.
2. What is the difference between git merge and git rebase?
    RTA//git merge combines the history of two branches while preserving it, whereas git rebase rewrites the commit history by placing one branch's commits on top of another, creating a linear history.
3. What happens when two branches modify the same line of a file?
    RTA// Git cannot automatically merge the changes and generates a merge conflict that must be resolved manually by choosing or combining the correct code.
4. How can you display the branch and merge history graphically in the terminal?
    RTA//The command git log --oneline --graph --all --decorate displays the commit history, branches, and merges in a graphical format. This command was used during the laboratory to verify that the feature branches had been merged correctly and to visualize the branch history after resolving merge conflicts.
5. How can you display the branch and merge history graphically in the terminal?
    RTA//You can use the command git log --oneline --graph --all --decorate to display a graphical view of branches, commits, and merges.
6. What is the difference between a commit and a push?
    RTA//A commit saves changes in the local repository, while a push uploads those committed changes to the remote repository, such as GitHub.
7. What are git stash and git stash pop used for?
    RTA//git stash temporarily saves uncommitted changes, and git stash pop restores those changes so you can continue working later.
8. What is the difference between HashMap and Hashtable?
    RTA//HashMap is faster and allows null keys and values, while Hashtable is synchronized, does not allow null, and is mainly used when thread safety is needed.
9. When using stream().map() on a list of objects, what type of operation is being performed?
    RTA//It performs a transformation, converting each element of the stream into another value or object.
10. What does stream().filter() do, and what does it return?
    RTA//filter() selects only the elements that satisfy a condition and returns a new stream containing those filtered elements.
11. Describe the steps required to create a new feature branch from develop.
    RTA//First switch to develop, update it with git pull, create the new feature branch using git checkout -b, and finally push it to the remote repository.
12. What is the difference between git branch and git checkout -b?
    RTA//git branch creates or lists branches without changing to them, while git checkout -b creates a new branch and switches to it immediately.
13. Why should new functionality be developed in feature/* branches instead of directly in main?
    RTA//Feature branches allow developers to work independently, avoid affecting the stable version of the project, and safely review and merge changes before they reach the main branch.







