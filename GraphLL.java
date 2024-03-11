import java.util.LinkedList;
class GraphLL{
    LinkedList<Integer>[]adj;
    public GraphLL(int nodes){
        this.adj=new LinkedList[nodes];
        for(int i=0;i<nodes;i++){
            this.adj[i]=new LinkedList<>();
        }
    }
    public void edge(int u,int v){
        this.adj[u].add(v);
        this.adj[v].add(u);
    }

    public void printGraph() {
        for (int i = 0; i < adj.length; i++) {
            System.out.print("Adjacency list of vertex " + i + ": ");
            for (int j = 0; j < adj[i].size(); j++) {
                System.out.print(adj[i].get(j) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        GraphLL g=new GraphLL(4);
        g.edge(0,1);
        g.edge(1,2);
        g.edge(2,3);
        g.edge(3,1);
        g.printGraph();
    }
} 