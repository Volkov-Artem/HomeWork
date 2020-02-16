package HW8;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CrossZero extends JFrame {
    private static final int SIZE = 3;
   // private static final int WIN_SYMBOL = 3;
   // private static final int ACTION_SUM = SIZE * SIZE;
    private static final String DOT_EMPTY = "•";
    private static final String DOT_X = "X";
    private static final String DOT_O = "O";
   // private static boolean actionCounter;
    private static int a = 1;
    //private static String currentDot;
    //private static int winNumber1, winNumber2;

    public CrossZero() {
        setBounds(700,400,500,400);
        setTitle("Игра: Крестики нолики!");
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton[][] jbs = new JButton[SIZE][SIZE];
        setLayout(new GridLayout(3, 3));
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j <SIZE ; j++) {
                jbs[i][j] = new JButton(DOT_EMPTY);
                add(jbs[i][j]);
            }

        }
        setVisible(true);
        CreateButton(jbs);


    }
    private void CreateButton(JButton[][] jbs) {
        for (int i = 0; i <jbs.length ; i++) {
            for (int j = 0; j < jbs.length; j++) {
                int x = i;
                int y = j;
                Object symbol = jbs [i][j];
                //String sign = symbol;
                    jbs[i][j].addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (a==1){
                                jbs[x][y].setText(DOT_X);
                                a = 2;
                            }
                            else if (a == 2){
                                jbs[x][y].setText(DOT_O);
                                a = 1;


                            }
                        }
                    });

            }
        }
    }


//    private boolean changeActionCounter(boolean check) {
//        if (!symbolTry){
//            symbolTry = true;
//           check =!check;
//        }else {
//            check = true;
//            symbolTry = false;
//        }
//        return check;
//    }

//    private void changeSymbol(JButton jbs) {

//        }

//    private static boolean isContinue(JButton[] jbs) {
//        for (int i = 0; i <SIZE ; i++) {
//            for (int j = 0; j <SIZE ; j++) {
//                if (checkVin(jbs)) return true;
//            }
//        }
//        return false;
//    }

//    private static boolean checkVin(JButton[] jbs){
//        for (int j = 0; j <WIN_SYMBOL ; j++) {
//            if (DOT_X.equals(jbs[j])){
//                currentDot++;
//            }else currentDot = 0;
//            if (currentDot == 3){
//                return true;
//            }
//        }
//        return false;
//    }


}




