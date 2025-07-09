package exercise.Array;

//Група людей бере участь у марафоні.
// Їхні імена і час, за який вони пробігли марафон ви можете побачити нижче.
//// Ваше завдання знайти людину, яка найшвидше пробігла дистанцію і вивести її ім'я та рахунок.

public class Ex_4 {
    public static void main(String[] args) {

        String names[][] = {         //[6][2]    //[[0, 1], [0, 1], [0, 1] [0, 1], [0, 1], [0, 1]]
                {"Elena", "341"},
                {"Thomas", "273"},
                {"Hamilton", "294"},
                {"Suzie", "402"},
                {"Phil", "401"},
                {"Matt", "388"}
        };

        // int Lead = names[0][1];

        System.out.println("Marathon participants table:");
        for (int i = 0; i < names.length; i++) {

            for (int j = 0; j < names[i].length; j++) {
                System.out.print(names[i][j] + ' ');
            }
            System.out.print("sec\n");
        }

        //int res = Integer.parseInt(names[0][1]);
        int res = Integer.MAX_VALUE;
        //int lead = res;

        for (int i = 0; i < names.length; i++) {
            //res = Integer.parseInt(names[i][1]);
            int current = Integer.parseInt(names[i][1]);

            if (current < res) {
                res = current;

            }
        }

        System.out.println("Winner time " + res);
    }
}
