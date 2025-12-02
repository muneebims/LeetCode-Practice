class Solution {
    public int evalRPN(String[] tokens) {
       LinkedList<Integer> list = new LinkedList<>();
        for(String c:tokens){
            try{
                int n=Integer.parseInt(c);
                list.push(n);
            }catch(Exception e){
                int result=0;
                int a=list.pop();
                int b=list.pop();
                switch (c){
                    case "*":
                    result=b*a;
                    break;
                    case "/":
                    result=b/a;
                    break;
                    case "+":
                    result=a+b;
                    break;
                    case "-":
                    result=b-a;
                    break;
                }
                list.push(result);
            }
        }
        return list.pop();
    }
}