## Challenge 5 – Battle of Sets

### Evidence

![Challenge evidence](../../images/evidence5.png)

### Description

- **What was implemented:** A Java application that uses `HashSet` and `TreeSet` to process two collections of integers. The solution uses Java Streams, `filter()` operations, and lambda expressions to remove multiples of 3 and 5, merge both collections into a single ordered `TreeSet`, remove duplicate values, and print the final result.

- **How the work was divided:**
  - Yazid: Implemented the `HashSet` solution, filtering multiples of 3.
  - Sergio: Implemented the `TreeSet` solution, preserving natural ordering and filtering multiples of 5.
  - Santiago: Created the project documentation (`README.md`).

- **Which Git operations were used:** Feature branch creation, parallel development, commits, merges, conflict resolution, and synchronization between branches using Git.

- **Which conflicts appeared:** Merge conflicts occurred because both students modified the same class (`BattleOfSets.java`) while implementing their respective solutions.

- **How the conflicts were resolved:** The conflicting code was manually reviewed and merged into a single implementation that combines both collections, preserves ascending order, removes duplicate values, and includes the contributions from both students.






