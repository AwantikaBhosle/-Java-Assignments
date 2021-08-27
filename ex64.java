//Write a JAVA program to compute the sum of the two given integers and count the number of digits of the sum value.    
class SumAndDigit
{
public static void main(String args[])
{
int x, y, sum_val,ctr;
x=95;
y=20;
ctr=0; 
sum_val=x+y; 
System.out.println("sum of 2 numbers:"+sum_val);
while(sum_val!=0)
{
 if(sum_val>0)
{ 
sum_val=sum_val/10; 
} 
ctr++; 
} 
System.out.println("Number of digits of the sum value of the said numbers:"+ctr); 
}
}
