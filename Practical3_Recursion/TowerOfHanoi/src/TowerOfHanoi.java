/**
 * Program written by Ronit Dahiya, 18204009
 * Practical 3
 */
public class TowerOfHanoi {

    /**
     * Method (recursive function) to solve tower of hanoi puzzle
     *
     * @param Dish_Number dish number
     * @param Initial_Rod initial rod
     * @param Destination_Rod destination/final rod
     * @param Aux_Rod mediator rod
     */
    static void towerOfHanoi(int Dish_Number, char Initial_Rod, char Destination_Rod, char Aux_Rod)
    {
        // Base Case for recursion function
        if (Dish_Number == 1) {
            System.out.println("Move disk 1 from rod " +  Initial_Rod + " to rod " + Destination_Rod);
            return;
        }

        //Recursive Functions Called to repeat

        towerOfHanoi(Dish_Number-1, Initial_Rod, Aux_Rod, Destination_Rod);
        System.out.println("Move disk " + Dish_Number + " from rod " +  Initial_Rod + " to rod " + Destination_Rod);
        towerOfHanoi(Dish_Number-1, Aux_Rod, Destination_Rod, Initial_Rod);
    }

    //  Main Method
    public static void main(String args[])
    {
        int Dish_Number = 4; // Number of disks
        // A, B and C are names of rods
        towerOfHanoi(Dish_Number, 'A', 'C', 'B');
    }
}