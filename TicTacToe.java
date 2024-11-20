public class TicTacToe
{
public static void main(String args[])
{
start:
for(;;)
{
char arr[][] = {{'-','-','-'},{'-','-','-'},{'-','-','-'}};
show(arr);
int temp = 1, temp1 = 0, temp2 = 0;
while(true)
{
if(temp==1)
{
temp1++;
temp2++;
System.out.println("******Player 1******\n****Please Enter the row and column number where you want to place the X******");
again:for(;;)
{
System.out.println("*****First insert row and second Column----");
try
{
int row = new java.util.Scanner(System.in).nextInt();
int column = new java.util.Scanner(System.in).nextInt();

if(row>0 && column>0 && row<=3 && column<=3 && arr[row-1][column-1]!='X' && arr[row-1][column-1]!='O'){arr[row-1][column-1]='X';break;}
else
{
System.out.println("****** Wrong Choice******\n******Please Re-enter*****"); continue again;
}
}
catch(Exception e)
{
System.out.println("****** Wrong Choice******\n******Please Re-enter*****"); continue again;
}
}
int br = check1(arr,temp1);
if(br==1)
{
System.out.println("******Player 1 WON*******\n******Thanks for playing*****\n*****For Restart press 1 and For exit press 0");
int s = new java.util.Scanner(System.in).nextInt();
if(s!=1)
break;
else
continue start;
}
temp++;
if(temp2==9)
{
System.out.println("*****Game Draw****\nThanks for Playing*******\n*****For Restart press 1 and For exit press 0");
int s = new java.util.Scanner(System.in).nextInt();
if(s!=1)
break;
else
continue start;
}
}


else
{
temp1++;
temp2++;
System.out.println("******Player 2******\n****Please Enter the row and column number where you want to place the O******");
again:for(;;)
{
System.out.println("*****First insert row and second Column----");
try
{
int row = new java.util.Scanner(System.in).nextInt();
int column = new java.util.Scanner(System.in).nextInt();

if(row>0 && column>0 && row<=3 && column<=3 && arr[row-1][column-1]!='X' && arr[row-1][column-1]!='O'){arr[row-1][column-1]='O';break;}
else
{
System.out.println("****** Wrong Choice******\n******Please Re-enter*****"); continue again;
}
}
catch(Exception e)
{
System.out.println("****** Wrong Choice******\n******Please Re-enter*****"); continue again;
}
}
int br = check2(arr,temp1);
if(br==1)
{
System.out.println("******Player 2 WON*******\n******Thanks for playing*****\n*****For Restart press 1 and For exit press 0");
int s = new java.util.Scanner(System.in).nextInt();
if(s!=1)
break;
else
continue start;
}
temp = 1;
if(temp2==9)
{
System.out.println("*****Game Draw****\nThanks for Playing*******\n*****For Restart press 1 and For exit press 0");
int s = new java.util.Scanner(System.in).nextInt();
if(s!=1)
break;
else
continue start;
}
}
}
break;
}
System.out.println("\n MADE BY MR.RAJAT");
}
static int check1(char arr[][],int temp1)
{
show(arr);
if(temp1>2)
{
if((arr[0][0]=='X' && arr[0][1] =='X' && arr[0][2] == 'X')||  (arr[1][0]=='X' && arr[1][1] =='X' && arr[1][2] == 'X')|| 
  (arr[2][0]=='X' && arr[2][1] =='X' && arr[2][2] == 'X') || (arr[0][0]=='X' && arr[1][0] =='X' && arr[2][0] == 'X') ||
  (arr[0][1]=='X' && arr[1][1] =='X' && arr[2][1] == 'X') || (arr[0][2]=='X' && arr[1][2] =='X' && arr[2][2] == 'X') ||
  (arr[0][0]=='X' && arr[2][1] =='X' && arr[2][2] == 'X') || (arr[0][2]=='X' && arr[2][1] =='X' && arr[2][0] == 'X'))
    return 1;
}
 return 0;
}

static int check2(char arr[][],int temp1)
{
show(arr);
if(temp1>3)
{
if((arr[0][0]=='O' && arr[0][1] =='O' && arr[0][2] == 'O')||  (arr[1][0]=='O' && arr[1][1] =='O' && arr[1][2] == 'O')|| 
  (arr[2][0]=='O' && arr[2][1] =='O' && arr[2][2] == 'O') || (arr[0][0]=='O' && arr[1][0] =='O' && arr[2][0] == 'O') ||
  (arr[0][1]=='O' && arr[1][1] =='O' && arr[2][1] == 'O') || (arr[0][2]=='O' && arr[1][2] =='O' && arr[2][2] == 'O') ||
  (arr[0][0]=='O' && arr[2][1] =='O' && arr[2][2] == 'O') || (arr[0][2]=='O' && arr[2][1] =='O' && arr[2][0] == 'O'))
    return 1;
}
return 0;
}

static void show(char arr[][])
{
System.out.println(
"***************************************************************************************************************************************");
for(int i = 0; i<arr.length; System.out.println("\n"),i++)
for(int j = 0; j<arr[i].length; System.out.print(arr[i][j]+"  "),j++);
}
}