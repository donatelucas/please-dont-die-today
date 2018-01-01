/*
    Dijkstra's implementation for adjacency matrix graph
*/

class SafestPath
{
    static final int V = 12; /* Oh, a final, AND a static, aren't we fancy? (ღ˘⌣˘ღ) */
    int[] weightPath = new int[V];
    Boolean[] getPath = new Boolean[V];


    /* A utility function to find the vertex with minimum distance value,
       from the set of vertices not yet included in shortest path tree */
    int minDistance(int dist[], Boolean sptSet[])
    {
        // Initialize min value
        int min = Integer.MAX_VALUE, min_index =-1;

        for (int v = 0; v < V; v++)
            if (sptSet[v] == false && dist[v] <= min)
            {
                min = dist[v];
                min_index = v;
            }
        return min_index;
    }

    /* I wonder what it does */
    void printSolution(int dist[], int src)
    {
        System.out.println("Vertex Distance from Source");
        for (int i = 0; i < V; i++)
            System.out.println("From " + src + " to " + i + " the weight is " + dist[i]);
            // System.out.print("From " + src + " to " + i + " the distance is " + dist[i] + ". The path is: ");
    }

    /*
        It probably doesn't do anything, it just sits pretty in here
        It prints the weight to every node, so you don't have to convert the
        matrix every time you wanna check it.
    */
    void printWeights()
    {
        for (int i = 0; i < weightPath.length; i++)
        {
            System.out.print(weightPath[i] + ", ");
        }
        System.out.println(" ");
    }

    void printPath()
    {
        for (int i = 0; i < getPath.length; i++)
        {
            System.out.println(getPath[i]);
        }
    }

    void printCopy()
    {
        for (int i = 0; i < getPath.length; i++)
            System.out.println(setCopy[i]);
    }

    int[] setCopy = new int[144];

    /* Finds the lightest/shortest path. <-- Wow, we have a Sherlock Holmes over here. */
    void dijkstra(int graph[][], int src)
    {
        int dist[] = new int[V]; // holds the weights of the path

        // sptSet[i] will be true if vertex i is included in shortest
        // path tree or shortest distance from src to i is finalized
        Boolean sptSet[] = new Boolean[V];

        // Initialize all distances as INFINITE and stpSet[] as false
        for (int i = 0; i < V; i++)
        {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }

        // Distance of source vertex from itself is always 0 (Required)
        dist[src] = 0;

        // Checks vertex by vertex, finding the smallest one every loop
        for (int count = 0; count < V-1; count++)
        {
            int u = minDistance(dist, sptSet); // stores minDistance on u, updates every loop

            // Set the picked vertex as true every loop
            sptSet[u] = true;
            if (sptSet[u] == true)
            {
                setCopy[count] = minDistance(dist, sptSet);
            }

            // Update weight of the value of the adjacent vertices of the picked vertex.
            for (int v = 0; v < V; v++)
            {
                /*
                    Updates dist[v] IF AND ONLY IF:

                    - The Vertex isn't on sptSet;
                    - There is a connection from u to v;
                    - Weight of the path from source to v through u is smaller than the current value of
                    dist[v]
                */
                if (!sptSet[v] && graph[u][v]!= 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v])
                {
                    dist[v] = dist[u] + graph[u][v]; // dist[v] => total weight of the path
                    weightPath[v] = graph[u][v]; // weights for all of the paths
                }
            }
        }

        // ta-da!
        printSolution(dist, src);
    }
}
