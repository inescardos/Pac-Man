# ldts-project-assignment-g0902


# We present to you our version of Pac-Man!

![Pac-Man Image](https://sm.ign.com/ign_br/screenshot/default/artboard-29_mu8f.png)

In this version you can find Pac-Man, which is the character the player plays, coins that have different properties and ghosts that haunt Pac-Man trying to catch him!

The game goal in our version is that Pac-Man eats all the coins without being caught by the different ghosts while the difficulty, in this case the velocity of the ghosts, increases.

**Good luck trying to escape the ghosts and collecting as many coins as you can!**

This project was developed by Inês Cardoso ([up202005435@fe.up.pt](mailto:up202005435@fe.up.pt)), Joana Santos ([up202006279@fe.up.pt](mailto:up202006279@fe.up.pt)) and Mariana Carvalho ([up202007620@fe.up.pt](mailto:up202007620@fe.up.pt)) for LDTS 2021/2022.

## TABLE OF CONTENTS

- [Controls](#controls)
- [Gameplay Demo](#gameplay-demo)
- [Class Diagram UML](#class-diagram-uml)
- [Implemented Features](#implemented-features)
  - [Pac-Man](#pac-man)
  - [Game mode](#game-mode)
  - [Ghosts](#ghosts)
  - [Coins](#coins)
- [Architectural Pattern](#architectural-pattern)
- [Design Patterns](#design-patterns)
  - [Factory Method](#factory-method)
  - [Strategy Pattern](#strategy-pattern)
  - [Observer Pattern](#observer-pattern)
  - [Game Loop Pattern](#game-loop-pattern)
- [Tests](#tests)
  - [Coverage Report](#coverage-report)

## CONTROLS

`^`: Moves Pac-Man up.

`v`: Moves Pac-Man down.

`>`: Moves Pac-Man to the right.

`<`: Moves Pac-Man to the left.

## IMPLEMENTED FEATURES

### Pac-Man

Pac-Man moves using the arrow keys. If the player wants to keep moving in the same direction he will only need to press one time the arrow key in the desired direction.

However if Pac-Man bumps into a wall he stops and waits for the next direction. So, whenever the player wishes Pac-Man to change direction he needs to press an arrow key.

Let’s imagine a scenario: the player pressed the right arrow key and Pac-Man is now moving to the right; if the player presses the up arrow key and Pac-Man has walls in the up direction, meaning he can’t move up, the moment Pac-Man is able to move upwards he moves without needing another input from the player. So thats another implementation.

We implemented collision methods in order to avoid Pac-Man moving through walls and to detect when he is either caught by a ghost or eats a coin.

### Game mode

There are three different game modes. In order to understand them better let’s name them: we have the “**Chase**” mode, “**Scatter**” and the “**Frightened**” mode.

The main mode is “**Chase**”. This is when the ghosts are trying to capture Pac-Man. Then, in “**Scatter**” mode, the ghosts stop chasing Pac-Man and each will move to its respective corners. This mode only lasts for a few seconds then changes back to “**Chase**”. In this two modes each ghost has its own implementation. The last game mode is “**Frightened**” and it happens when Pac-Man eats a special coin. In this mode the ghosts move vulnerable and randomly so they aren’t trying to catch Pac-Man.

### Ghosts

Ghost types - There are four types of ghosts: Blinky (the red one), Pinky (the pink one), Inky (the blue one) and Clyde (the orange one).

Each ghost has a different tactic to catch Pac-Man. These are applied when the game is in “**Chase**” mode ([Game mode](#game-mode)).

**Blinky**: follows Pac-Man once located.  
**Pinky**: tries to ambush Pac-Man by getting in front of him.  
**Inky**: moves randomly trough a certain area.  
**Clyde**: moves randomly and appears to stay away from Pac-Man.

When the game is in “**Scatter**” mode ([Game mode](#game-mode)) the following tactics apply:

**Blinky**: moves to the top right corner.  
**Pinky**: moves to the top left corner.  
**Inky**: moves to the bottom right corner.  
**Clyde**: moves to the bottom left corner.

### Coins

As for other elements, coins have two different types: **Small Coin** and **Power Coin**.

By eating a **Small Coin**, 10 points are added to Pac-Man’s score. However, if Pac-Man eats a **Power Coin** then 200 points are added to his score and that’s when “**Frightened**” mode is activated ([Game mode](#game-mode)).

The positions of the coins are read from the map text file and during the game no more coins appear. The player wins if Pac-Man eats all the coins.

## ARCHITECTURE PATTERN

We agreed that using MVC (Model-View-Controller) architecture pattern would benefit our project so we decided to implement it. This particular pattern is useful for games and web applications because it helps separate the input logic that is converted to commands for either the Model or View (handled by the Controller); the data, game logic and rules of the game (handled by the Model) and the user interface that outputs information (handled by the View).

This architecture is extremely useful because it enables quick changes without having to rework much code in all layers of the application and helps testing components independently.

It’s like the Model and the View don’t even know of each other’s existence because they never communicate directly with one another. The Controller is known as the main component since it’s the one responsible for making the connections between Model and View.

## DESIGN PATTERNS

### Factory Method

Implementing the Factory pattern is useful when there's a possibility of wanting to extend the framework's internal components because it's not known beforehand the objects the code should work with.
This pattern was implemented in the classes: ... by creating a ...Factory method and replacing direct object construction calls with calls to that factory method.

### Strategy Pattern

Implementing the Strategy pattern means taking a big class that does something in many ways and separating the different algorithms into separate classes. 

As said before, in Pac-Man there are four different types of ghosts, each having their own strategy ([Ghosts](#ghosts)). So in this case, Ghost would be the big class having all the different algorithms for the four ghosts. When implementing the Strategy pattern, Ghost is the class context and RedGhost, PinkGhost, CyanGhost and OrangeGhost are the classes strategies, all implementing the context. This way is easier to introduce new strategies without having to change the context.

### Observer Pattern

The Observer pattern is useful when there are objects waiting to be notified when an event happens to the object they are observing, because when that happens they also need to be changed.
In our project, the Observer Pattern was implemented in the MenuController class and in the PacmanController class, since they both implement the interface Observer. Both classes are waiting to be notified when there's input from user. When they are notified of input they act and make the application progress.


### Game Loop Pattern

One pattern that's essencial for game programs is the Game Loop pattern because this pattern's goal is to ensure that game time advances in the same speed in all different hardware setups. Game Loop was implemented because it's the main process of all the game rendering threads. The participating classes are:

