package com.dev.ehnyn.rubikmath;

public class RubikCalculation {
    double totalCubes, hiddenCubes, faceCubes;
    int nextRubik;

    public double getTotalCubes(int n){
        totalCubes = n * n * n;
        return totalCubes;
    }

    public double calcHiddenCubes(int n){
        //Calculate the total number of smaller cubes that is hidden in a rubik cube, given n.
        int cubes = (n - 2);
        hiddenCubes = Math.pow(cubes, 3);
        return  hiddenCubes;
    }

    public double calcFaceCubes(int n){
        //Calculates the number of cubes that makes up the faces of Rubik's cube
        double a = Math.pow(n, 3);
        double b = Math.pow((n - 2), 3);
        faceCubes = a - b;
        return  faceCubes;
    }

    public int calcNextRubik(int n){
        //It iteratively calculates the Rubik's cube that can be created by removing the external layer
        // of the current Rubik's cube.
        nextRubik = (n - 2);
        return nextRubik;
    }
}
