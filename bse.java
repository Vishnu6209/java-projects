class bse{
public static void main(String[] args)
{
int[] num={2,4,5,6,7,8,9,10};
int target=8,left=0,right=num.length-1;
boolean found=false;
while(left<=right){
int mid=(left+right)/2;
if(target==num[mid]){
System.out.println("Found : "+target+"at index: "+mid)
found=true;
break;
}
else if(target<num[mid]){
right=mid-1;}
else{
left=mid+1;}
}
if(!found){
System.out.println("target not found");}
}
}