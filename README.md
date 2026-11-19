# se_lab9: Sports League Class Model

A small Java lab exercise for a software engineering course. It turns a UML class diagram for a sports league into code and shows inheritance, association and aggregation between classes.

## Tech stack

- Java (the IntelliJ project is set to JDK 17)
- No external libraries or build tool. It is a plain IntelliJ IDEA module (`se_lab9.iml`).

## Class model

| Class | Role |
|-------|------|
| `Person` | Base class with a name and an address |
| `Player` | Extends `Person`. Has a jersey number and a position, plus `play()` |
| `Coach` | Extends `Person`. Has an accreditation level and years of experience, plus `coachTeam()` |
| `Team` | Has a list of `Player`s (aggregation) and one `Coach` (association) |
| `League` | Has a list of `Team`s (aggregation) |
| `Game` | Links a home `Team` and an away `Team` and stores a location and a score |
| `Main` | Builds a coach, a team and a player, then calls `play()` and `coachTeam()` |

## Project structure

```
src/        Java source files (default package)
.idea/      IntelliJ project settings
se_lab9.iml IntelliJ module file
```

## Running

**IntelliJ IDEA:** open the folder as a project and run `Main`.

**Command line:**

```bash
javac -d out src/*.java
java -cp out Main
```

Expected output:

```
Alice is playing as Striker
John Doe is coaching the team.
```
