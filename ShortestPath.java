//Hasan Mukati
import java.util.*; 
import java.lang.*; 
import java.io.*; 

class ShortestPath 
{ 
	// Used to find the vertex with shorest distance

	static final int V=9; 
	int minDistance(int dist[], Boolean sptSet[]) 
	{ 
		// Initialize min value 
		int min = Integer.MAX_VALUE, min_index=-1; 

		for (int v = 0; v < V; v++) 
			if (sptSet[v] == false && dist[v] <= min) 
			{ 
				min = dist[v]; 
				min_index = v; 
			} 

		return min_index; 
	} 

	//  prints the array 
	void printSolution(int dist[], int n) 
	{ 
		System.out.println("Vertex Distance from Source"); 
		for (int i = 0; i < V; i++) 
			System.out.println(i+" tt "+dist[i]); 
	} 

	// This implements Dijkstra'sshortest path  graph using matrix 
	void dijkstra(int graph[][], int src) 
	{ 
		int dist[] = new int[V]; 
		

		
		Boolean sptSet[] = new Boolean[V]; 

		// Initialize all distances 
		for (int i = 0; i < V; i++) 
		{ 
			dist[i] = Integer.MAX_VALUE; 
			sptSet[i] = false; 
		} 

		// Distance of source from 0 
		dist[src] = 0; 

		// Find shortest path for all vertices 
		for (int count = 0; count < V-1; count++) 
		{ 
			// Pick the minimum distance 
			int u = minDistance(dist, sptSet); 

			// This sets the chosen vertex 
			sptSet[u] = true; 

			// this function updates the dist value for the picked vertex. 
		
			for (int v = 0; v < V; v++) 

				
				if (!sptSet[v] && graph[u][v]!=0 && 
						dist[u] != Integer.MAX_VALUE && 
						dist[u]+graph[u][v] < dist[v]) 
					dist[v] = dist[u] + graph[u][v]; 
		} 

		// This prints the   array 
		printSolution(dist, V); 
	} 

	
	public static void main (String[] args) 
	{ 
		/* This helps to make the graph and are the values given */
	int graph[][] = new int[][]{{0, 5, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0}, 
								{5, 0, 8, 0, 9, 8, 0, 0, 0, 0, 0, 0}, 
								{0, 8, 0, 0, 0, 6, 0, 0, 15, 0, 0, 0}, 
								{6, 0, 0, 0, 0, 4, 9, 0, 0, 0, 0, 0}, 
								{0, 9, 6, 0, 0, 0, 0, 0, 13, 0, 0, 0}, 
								{0, 8, 0, 4, 0, 0, 6, 14, 0, 0, 0, 0}, 
								{0, 0, 0, 9, 0, 6, 0, 0, 11, 0, 0, 0}, 
								{0, 0, 15, 0, 0, 14, 0, 0, 9, 9, 0, 0}, 
								{0, 0, 0, 0, 13, 0, 11, 9, 0, 6, 5, 0},
								{0, 0, 0, 0, 0, 0, 0, 9, 6, 0, 0, 0},
								{0, 0, 0, 0, 0, 0, 0, 0, 17, 0, 0, 0},
								{0, 0, 0, 0, 0, 0, 0, 9, 18, 0, 0, 0}
								}; 
		ShortestPath t = new ShortestPath(); 
		t.dijkstra(graph, 0); 
	} 
} 


