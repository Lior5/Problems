// Don't place your source in a package
import java.util.*;
import java.lang.*;
import java.io.*;

// Please name your class Main
class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner scan = new Scanner(System.in);
		int l = scan.nextInt();
        String[] need = new String[l];
        for(int i = 0;i<l;i++){
            need[i] = scan.next();
        }
        int n = scan.nextInt();
        ArrayList<Store> list = new ArrayList<>();
        for(int i = 0;i<n;i++){
            String name = scan.next();
            String[] items = new String[10];
            int[] prices = new int[10];
            for(int j = 0;j<10;j++){
                items[j] = scan.next();
            }
            for(int j = 0;j<10;j++){
                prices[j] = scan.nextInt();
            }
            int cost = 0;
            int count = 0;
            for(int j = 0;j<l;j++){
                for(int k = 0;k<10;k++){
                    if(need[j].equals(items[k])){
                        items[k] = "1";
                        count++;
                        cost+=prices[k];
                    }
                }
            }
            //System.out.println(count+" "+l);
            if(count!=l){
                cost = Integer.MAX_VALUE;
            }
            list.add(new Store(name, cost, -1));
        }
        // for(int i = 0;i<n;i++){
        //     System.out.println(list.get(i).name+" "+list.get(i).cost);
        // }
        int m = scan.nextInt();
        int[] times = new int[n];
        ArrayList[] connections = new ArrayList[n+1];
        for(int i = 0;i<n+1;i++){
            connections[i] = new ArrayList<Edge>();
        }
        ArrayList<Edge> edges = new ArrayList<>();
        for(int i = 0;i<m;i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            connections[a].add(new Edge(a,b,c));
            connections[b].add(new Edge(b,a,c));
        }
        ArrayDeque<Integer> deq = new ArrayDeque<>();
        int[] minimums = new int[n+1];
        Arrays.fill(minimums,Integer.MAX_VALUE);
        deq.add(1);
        minimums[1] = 0;
        while(!deq.isEmpty()){
            int curr = deq.poll();
            for(int i = 0;i<connections[curr].size();i++){
                Edge now = (Edge)(connections[curr].get(i));
                if(minimums[curr]+now.weight<minimums[now.two]){
                    minimums[now.two] = minimums[curr]+now.weight;
                    deq.add(now.two);
                }
            }
        }
        int minCost = Integer.MAX_VALUE;
        ArrayList<Integer> contestants = new ArrayList<>();
        for(int i = 0;i<list.size();i++){
            if(minimums[i+1]==Integer.MAX_VALUE){
                Store curr = list.remove(i);
                list.add(0,new Store(curr.name, Integer.MAX_VALUE, curr.time));
            }
        }
        for(int i = 0;i<list.size();i++){
            minCost = Math.min(list.get(i).cost,minCost);
        }
        for(int i = 0;i<list.size();i++){
            Store curr = list.get(i);
            if(curr.cost==minCost){
                contestants.add(i+1);
            }
        }
        int minTime = Integer.MAX_VALUE;
        for(int i = 0;i<contestants.size();i++){
            //System.out.println(minimums[contestants.get(i)]);
            minTime = Math.min(minTime,minimums[contestants.get(i)]);
        }
        for(int i = 0;i<contestants.size();i++){
            if(minTime == minimums[contestants.get(i)]){
                System.out.print(list.get(contestants.get(i)-1).name+" ");
                break;
            }
        }
        System.out.println(minTime);
	}
	public static class Edge{
	    int one, two, weight;
	    public Edge(int one1, int two1, int weight1){
	        one = one1;
	        two = two1;
	        weight = weight1;
	    }
	}
	public static class Store{
	    String name;
	    int cost, time;
	    public Store(String name1, int cost1, int time1){
	        cost = cost1;
	        time = time1;
	        name = name1;
	    }
	}
}
