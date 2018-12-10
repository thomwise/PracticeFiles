public class DiagnolStar {

    public static void main(String[] args) {

        printSquareStar(5);

    }

    public static void printSquareStar(int number){

        if(number < 5) {
            System.out.println("Invalid Value");
        } else {

            for (int row = 1; row <= number; row++) {

                for (int column = 1; column <= number; column++) {

//              Creates the box for the design
                    if (row == 1 || row == number || column == 1 || column == number) {
                        System.out.print("*");
//              Creates the diagonals in the box
                    } else if (column == row || column == (number - row + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }
        }

    }

}
