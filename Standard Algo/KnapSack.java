public class Knapsack {

    public  static  int knapsack(int weight[],int values[],int maxweight,int i){
        if(i==weight.length || maxweight==0){
            return 0;
        }

        if(weight[i]>maxweight){
            return  knapsack(weight,values,maxweight,i+1);
        }else{
            int op1=values[i]+knapsack(weight,values,maxweight-weight[i],i+1);
            int op2=knapsack(weight,values,maxweight,i+1);

            return Math.max(op1,op2);
        }

    }
    public static void main(String args[]){
        int weights[]= {6,1,2,4,5};
        int values[]= {10,5,4,8,6};

        int maxweight=5;

        System.out.println(knapsack(weights,values,maxweight,0)); //Recursion
    }

}
