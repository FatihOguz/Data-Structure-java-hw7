import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentSkipListSet;

public class Main {
    public static void main(String[] args){

        BinarySearchTree<Integer> binarySearchTree1 = new BinarySearchTree<>();
        RedBlackTree<Integer> redBlackTreeBook1 = new RedBlackTree<>();
        TreeMap<Integer,Integer> redBlackTreeJava1 = new TreeMap<>();
        TwoThreeFourTree<Integer> bTreeBook1 = new TwoThreeFourTree<>();
        SkipList<Integer> skipListBook1 = new SkipList<>();
        ConcurrentSkipListSet<Integer> skipListJava1 = new ConcurrentSkipListSet<>();
        /**************************************************************************************/
        BinarySearchTree<Integer> binarySearchTree2 = new BinarySearchTree<>();
        RedBlackTree<Integer> redBlackTreeBook2 = new RedBlackTree<>();
        TreeMap<Integer,Integer> redBlackTreeJava2 = new TreeMap<>();
        TwoThreeFourTree<Integer> bTreeBook2 = new TwoThreeFourTree<>();
        SkipList<Integer> skipListBook2 = new SkipList<>();
        ConcurrentSkipListSet<Integer> skipListJava2 = new ConcurrentSkipListSet<>();
        /**************************************************************************************/
        BinarySearchTree<Integer> binarySearchTree4 = new BinarySearchTree<>();
        RedBlackTree<Integer> redBlackTreeBook4 = new RedBlackTree<>();
        TreeMap<Integer,Integer> redBlackTreeJava4 = new TreeMap<>();
        TwoThreeFourTree<Integer> bTreeBook4 = new TwoThreeFourTree<>();
        SkipList<Integer> skipListBook4 = new SkipList<>();
        ConcurrentSkipListSet<Integer> skipListJava4 = new ConcurrentSkipListSet<>();
        /**************************************************************************************/
        BinarySearchTree<Integer> binarySearchTree8 = new BinarySearchTree<>();
        RedBlackTree<Integer> redBlackTreeBook8 = new RedBlackTree<>();
        TreeMap<Integer,Integer> redBlackTreeJava8 = new TreeMap<>();
        TwoThreeFourTree<Integer> bTreeBook8 = new TwoThreeFourTree<>();
        SkipList<Integer> skipListBook8 = new SkipList<>();
        ConcurrentSkipListSet<Integer> skipListJava8 = new ConcurrentSkipListSet<>();
        /*************************************************************************************/


        int size1 = 10000;
        int size2 = 20000;
        int size4 = 40000;
        int size8 = 80000;
        /*****************************************************************************************/


        for(int i = 0 ; i< size1;i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100);
            binarySearchTree1.add(random);
            redBlackTreeBook1.add(random);
            redBlackTreeJava1.put(random,random);
            bTreeBook1.add(random);
            skipListBook1.add(random);
            skipListJava1.add(random);

        }
        /**
        System.out.println("1***************binarySearchTree********************");
        System.out.println(binarySearchTree1);
        System.out.println("2************red black tree book***********************");
        System.out.println(redBlackTreeBook1);
        System.out.println("3***********red black tree java ************************");
        System.out.println(redBlackTreeJava1);
        System.out.println("4*************b tree**********************");
        System.out.println(bTreeBook1);
        System.out.println("5*******************skip list book****************");
        System.out.println(skipListBook1);
        System.out.println("6*******skip list java****************************");
        System.out.println(skipListJava1);
*/


        for(int i = 0 ; i< size2;i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100);
            binarySearchTree2.add(random);
            redBlackTreeBook2.add(random);
            redBlackTreeJava2.put(random,random);
            bTreeBook2.add(random);
            skipListBook2.add(random);
            skipListJava2.add(random);
        }



        for(int i = 0 ; i< size4;i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100);
            binarySearchTree4.add(random);
            redBlackTreeBook4.add(random);
            redBlackTreeJava4.put(random,random);
            bTreeBook4.add(random);
            skipListBook4.add(random);
            skipListJava4.add(random);
        }

        for(int i = 0 ; i< size8;i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100);
            binarySearchTree8.add(random);
            redBlackTreeBook8.add(random);
            redBlackTreeJava8.put(random,random);
            bTreeBook8.add(random);
            skipListBook8.add(random);
            skipListJava8.add(random);
        }



/*****CALCULATE RUN TIME FOR 10 ADDING ***************************/
        System.out.println("10 element addition times in nanoseconds");

        long startTime = System.nanoTime();


        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            binarySearchTree1.add(1000+i);
        }
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("binarySearchTree1 " + totalTime);


/*************************************************************************/


        startTime = System.nanoTime();
        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            redBlackTreeBook1.add(1000+i);
        }
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("redBlackTreeBook1 " + totalTime);
/*********************************************************************/
        startTime = System.nanoTime();
        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            redBlackTreeJava1.put(1000+i,1000+i);
        }
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("redBlackTreeJava1 " + totalTime);
        /******************************************************************/





        startTime = System.nanoTime();
        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            bTreeBook1.add(1000+i);
        }
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("bTreeBook1 " + totalTime);
        /******************************************************************/

        startTime = System.nanoTime();
        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            skipListBook1.add(1000+i);
        }
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("skipListBook1 " + totalTime);
        /******************************************************************/
        startTime = System.nanoTime();
        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            skipListJava1.add(1000+i);
        }
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("skipListJava1 " + totalTime);

        /*******************************************************************************************************************/


        /***********************************************************************************************************************/

        startTime = System.nanoTime();
        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            binarySearchTree2.add(1000+i);
        }
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("binarySearchTree2 " + totalTime);
        /******************************************************************/
        startTime = System.nanoTime();

        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            redBlackTreeBook2.add(1000+i);
        }
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("redBlackTreeBook2 " + totalTime);
        /******************************************************************/
        startTime = System.nanoTime();

        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            redBlackTreeJava2.put(1000+i,1000+i);
        }
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("redBlackTreeJava2 " + totalTime);
        /******************************************************************/
        startTime = System.nanoTime();

        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            bTreeBook2.add(1000+i);
        }
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("bTreeBook2 " + totalTime);
        /******************************************************************/
        startTime = System.nanoTime();

        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            skipListBook2.add(1000+i);
        }
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("skipListBook2 " + totalTime);
        /******************************************************************/
        startTime = System.nanoTime();

        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            skipListJava2.add(1000+i);
        }
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("skipListJava2 " + totalTime);


        /*******************************************************************************************************************/


/***********************************************************************************************************************/

        startTime = System.nanoTime();
        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            binarySearchTree4.add(1000+i);
        }
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("binarySearchTree4 " + totalTime);
        /******************************************************************/
        startTime = System.nanoTime();

        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            redBlackTreeBook4.add(1000+i);
        }

        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("redBlackTreeBook4 " + totalTime);
        /******************************************************************/
        startTime = System.nanoTime();
        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            redBlackTreeJava4.put(1000+i,1000+i);
        }

        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("redBlackTreeJava4 " + totalTime);
        /******************************************************************/
        startTime = System.nanoTime();
        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            bTreeBook4.add(1000+i);
        }
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("bTreeBook4 " + totalTime);
        /******************************************************************/
        startTime = System.nanoTime();

        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            skipListBook4.add(1000+i);
        }
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("skipListBook4 " + totalTime);
        /******************************************************************/
        startTime = System.nanoTime();

        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            skipListJava4.add(1000+i);
        }
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("skipListJava4 " + totalTime);


        /*******************************************************************************************************************/


/***********************************************************************************************************************/

        startTime = System.nanoTime();
        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            binarySearchTree8.add(1000+i);
        }
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("binarySearchTree8 " + totalTime);
        /******************************************************************/
        startTime = System.nanoTime();

        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            redBlackTreeBook8.add(1000+i);
        }
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("redBlackTreeBook8 " + totalTime);
        /******************************************************************/
        startTime = System.nanoTime();

        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            redBlackTreeJava8.put(1000+i,1000+i);
        }
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("redBlackTreeJava8 " + totalTime);
        /******************************************************************/
        startTime = System.nanoTime();

        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            bTreeBook8.add(1000+i);
        }
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("bTreeBook8 " + totalTime);
        /******************************************************************/
        startTime = System.nanoTime();

        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            skipListBook8.add(1000+i);
        }
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("skipListBook8 " + totalTime);
        /******************************************************************/
        startTime = System.nanoTime();

        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            skipListJava8.add(1000+i);
        }
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("skipListJava8 " + totalTime);


        /*******************************************************************************************************************/




































        System.out.println("10 element deletion times in nanoseconds");

       startTime = System.nanoTime();


        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            binarySearchTree1.delete(1000+i);
        }
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("binarySearchTree1 " + totalTime);


/*************************************************************************/


        startTime = System.nanoTime();
        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            redBlackTreeBook1.delete(1000+i);
        }
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("redBlackTreeBook1 " + totalTime);
/*********************************************************************/
        startTime = System.nanoTime();
        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            redBlackTreeJava1.remove(1000+i,1000+i);
        }
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("redBlackTreeJava1 " + totalTime);
        /******************************************************************/




/**
        startTime = System.nanoTime();
        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            bTreeBook1.delete(random);
        }
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("bTreeBook1 " + totalTime);
 */
        /******************************************************************/


        startTime = System.nanoTime();
        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            skipListBook1.remove(1000+i);
        }
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("skipListBook1 " + totalTime);
        /******************************************************************/
        startTime = System.nanoTime();
        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            skipListJava1.remove(1000+i);
        }
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("skipListJava1 " + totalTime);

        /*******************************************************************************************************************/


        /***********************************************************************************************************************/

        startTime = System.nanoTime();
        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            binarySearchTree2.delete(1000+i);
        }
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("binarySearchTree2 " + totalTime);
        /******************************************************************/
        startTime = System.nanoTime();

        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            redBlackTreeBook2.delete(1000+i);
        }
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("redBlackTreeBook2 " + totalTime);
        /******************************************************************/
        startTime = System.nanoTime();

        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            redBlackTreeJava2.remove(1000+i,1000+i);
        }
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("redBlackTreeJava2 " + totalTime);
        /******************************************************************/
        /**
        startTime = System.nanoTime();

        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            bTreeBook2.delete(random);
        }
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("bTreeBook2 " + totalTime);
         */
        /******************************************************************/
        startTime = System.nanoTime();

        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            skipListBook2.remove(1000+i);
        }
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("skipListBook2 " + totalTime);
        /******************************************************************/
        startTime = System.nanoTime();

        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            skipListJava2.remove(1000+i);
        }
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("skipListJava2 " + totalTime);


        /*******************************************************************************************************************/


/***********************************************************************************************************************/

        startTime = System.nanoTime();
        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            binarySearchTree4.delete(1000+i);
        }
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("binarySearchTree4 " + totalTime);
        /******************************************************************/
        startTime = System.nanoTime();

        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            redBlackTreeBook4.delete(1000+i);
        }

        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("redBlackTreeBook4 " + totalTime);
        /******************************************************************/
        startTime = System.nanoTime();
        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            redBlackTreeJava4.remove(1000+i,1000+i);
        }

        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("redBlackTreeJava4 " + totalTime);
        /******************************************************************/
        /**
        startTime = System.nanoTime();
        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            bTreeBook4.delete(random);
        }
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("bTreeBook4 " + totalTime);
         */
        /******************************************************************/
        startTime = System.nanoTime();

        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            skipListBook4.remove(1000+i);
        }
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("skipListBook4 " + totalTime);
        /******************************************************************/
        startTime = System.nanoTime();

        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            skipListJava4.remove(1000+i);
        }
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("skipListJava4 " + totalTime);


        /*******************************************************************************************************************/


/***********************************************************************************************************************/

        startTime = System.nanoTime();
        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            binarySearchTree8.delete(1000+i);
        }
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("binarySearchTree8 " + totalTime);
        /******************************************************************/
        startTime = System.nanoTime();

        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            redBlackTreeBook8.delete(1000+i);
        }
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("redBlackTreeBook8 " + totalTime);
        /******************************************************************/
        startTime = System.nanoTime();

        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            redBlackTreeJava8.remove(1000+i,1000+i);
        }
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("redBlackTreeJava8 " + totalTime);
        /******************************************************************/
        /**
        startTime = System.nanoTime();

        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            bTreeBook8.delete(random);
        }
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("bTreeBook8 " + totalTime);
         */
        /******************************************************************/
        startTime = System.nanoTime();

        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            skipListBook8.remove(1000+i);
        }
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("skipListBook8 " + totalTime);
        /******************************************************************/
        startTime = System.nanoTime();

        for(int i = 0 ;  i < 10 ; i++){
            Random rnd = new Random();
            int random = rnd.nextInt(100000);
            skipListJava8.remove(1000+i);
        }
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("skipListJava8 " + totalTime);


/*******************************************************************************************************************/

    }
}
