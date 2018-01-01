import java.util.*;

public class GetIndex
{
    int hor = 0;
    int ver = 0;
    int value = 0;
    int crawler = 0;
    String test;

    /*
        Helper function to output indexes from a 2D Array @Lucas Perez
    */
    void get2DIndex(int path[], int graph[][])
    {
        for (int i = 0; i < graph.length; i++)
        {
            for (int j = 0; j < graph[0].length; j++)
            {
                if (graph[i][j] == value)
                {
                    hor = i;
                    ver = j;
                    crawler++;
                    print2DIndex();
                }
                
                if (crawler > path.length-1)
                {
                    test = "test";
                    break;
                }
                else
                    value = path[crawler];
            }
        }
    }

    void print2DIndex()
    {
        System.out.println("For " + value + " the indexes are " + hor + " and " + ver);
        System.out.println(test);
    }

    public static void main (String[] args)
    {                           //    0  1  2   3  4  5   6   7   8  9  10 11
        int graph[][] = new int [][]{{0, 6, 0,  0, 5, 0,  0,  0,  0, 0, 0, 0},   // 0
                                     {2, 0, 10, 0, 0, 15, 0,  0,  0, 0, 0, 0},   // 1
                                     {0, 6, 0,  4, 0, 0,  25, 0,  0, 0, 0, 0},   // 2
                                     {0, 0, 10, 0, 0, 0,  0,  10, 0, 0, 0, 0},   // 3
                                     {2, 0, 0,  0, 0, 15, 0,  0,  1, 0, 0, 0},   // 4
                                     {0, 6, 0,  0, 5, 0,  25, 0,  0, 3, 0, 0},   // 5
                                     {0, 0, 10, 0, 0, 15, 0,  10, 0, 0, 5, 0},   // 6
                                     {0, 0, 0,  4, 0, 0,  25, 0,  0, 0, 0, 2},   // 7
                                     {0, 0, 0,  0, 5, 0,  0,  0,  0, 3, 0, 0},   // 8
                                     {0, 0, 0,  0, 0, 15, 0,  0,  1, 0, 5, 0},   // 9
                                     {0, 0, 0,  0, 0, 0,  25, 0,  0, 3, 0, 2},   // 10
                                     {0, 0, 0,  0, 0, 0,  0,  10, 0, 0, 5, 0}};  // 11

        GetIndex gi = new GetIndex();
        int[] path = {0, 5, 1, 3, 5, 2};
        gi.get2DIndex(path, graph);
        gi.print2DIndex();
    }
}
