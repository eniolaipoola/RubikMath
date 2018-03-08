# RubikMath
This project implements all the parameters required for Rubik's cube problems described below

1. Determine the number of smaller cubes (cubelets) that is needed to
construct a full nXnXn Rubik’s cube where n>1
2. Determine the number of smaller cubes that are hidden (no of internal
cubes in Rubik’s cube structure).
3. Using 1 & 2 calculate the no of cubes that make up the faces of Rubik’s
cube.
4. Using 1 – 3, iteratively determine Rubik’s cubes that can be created by
removing the current external layer of Rubik’s cube.

The class RubikCalculation contains all the method required to solve the problems above.

The mainActivity class is the entry page on the mobile application. The user gets to enter the value
  of n for which the parameters above would be calculated.

RubikActivity gives the solution of each required parameter for the Rubik's cube of dimension n.