package examples.ch13.fig13_29_30;// Fig. 13.30: Shapes.java
// Demonstrating some Java 2D shapes.
import javax.swing.JFrame;

public class Shapes
{
   // execute application
   public static void main(String[] args)
   {
      // create frame for ShapesJPanel
      JFrame frame = new JFrame("Drawing 2D shapes");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // create ShapesJPanel
      ShapesJPanel shapesJPanel = new ShapesJPanel();
      frame.add(shapesJPanel); 
      frame.setSize(425, 200);
      frame.setVisible(true);
   } 
} // end class Shapes

/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/