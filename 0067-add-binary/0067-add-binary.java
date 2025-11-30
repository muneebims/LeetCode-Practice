class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result= new StringBuilder();
        int al=a.length();
        int bl=b.length();
        while(al!=bl){
            if(bl>al){
                a="0"+a;
                al=a.length();
            }
            else if(al>bl){
                b="0"+b;
                bl=b.length();
            }

        }
        int carry=0;
        for(int i=al-1;i>=0;i--){
            int n1=a.charAt(i)-'0';
            int n2=b.charAt(i)-'0';
            int sum=n1+n2+carry;
            int curr=sum%2;
            carry= sum/2;
            result.append(curr);
        }
        if(carry!=0){
            result.append("1");
        }
        result.reverse();
        return result.toString();
    }
}