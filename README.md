# Tic-Tac-Toe Game

This Kotlin program allows you to play a game of Tic-Tac-Toe against another player. The game is played on a 3x3 grid, and the players take turns marking the spaces with their respective symbols ('X' or 'O'). The first player to get three of their symbols in a row, column, or diagonal wins the game. If all spaces are filled without a winner, the game ends in a draw.

## Features

- **Interactive Gameplay**: Players can enter their moves by specifying the row and column numbers.
- **Winning Conditions**: The program automatically detects winning combinations and announces the winner.
- **Draw Detection**: If all spaces are filled without a winner, the game ends in a draw.
- **Input Validation**: The program validates user input to ensure it falls within the acceptable range of coordinates and is a valid move.

## How to Play

1. Run the program.
2. Players take turns entering their moves by specifying the row and column numbers.
3. The game automatically checks for winning combinations and announces the winner or ends in a draw.

## Notes

- The program uses a simple console interface for interaction.
- Players alternate turns, with 'X' starting the game.
- The game continues until a player wins or the board is full.
__________________________________________

Here are the skills and concepts used in writing this program:

Input/Output Handling: The program interacts with the user through console input and output, reading user moves and displaying the game board.

Conditional Statements: Conditional statements such as if, else, and when are used to validate user input and determine game outcomes such as winning, losing, or drawing.

Loops: The program uses loops, specifically for loops, to iterate over the game board to check for winning combinations and to prompt the user for moves.

Data Structures: The program utilizes arrays to represent the game board and track the state of each cell.

Recursion: The game logic is implemented recursively, calling the movie() function until the game is over.

Error Handling: The program validates user input to ensure it falls within the acceptable range of coordinates and handles errors such as invalid input and occupied cells.

System Interaction: The program utilizes System.exit(-1) to terminate the game when a winner is determined or when the board is full, ending the program execution.
